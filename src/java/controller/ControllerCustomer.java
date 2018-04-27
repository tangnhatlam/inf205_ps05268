/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;
import model.Customers;


/**
 *
 * @author Administrator
 */
public class ControllerCustomer extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String action = request.getParameter("action");
            if(action.equals("Login"))
            {
                String user = request.getParameter("txtUser");
                String pass = request.getParameter("txtPass");
                Customers cus = new Customers();
                boolean exist = cus.checkLogin(user, pass);
                boolean existID = cus.checkLoginIdmin(user, pass);
                String url = "error.jsp";
                if(existID)
                {
                    url = "index_admin.jsp";
                    HttpSession sesson = request.getSession(true);
                    sesson.setAttribute("USER", user);
                }else if(exist){
                    url = "index.jsp";
                    HttpSession sesson = request.getSession(true);
                    sesson.setAttribute("USER", user);
                }
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
                
            }else if(action.equals("Register"))
            {
                String username = request.getParameter("username");
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                String lastname = request.getParameter("lastname");
                String admin = request.getParameter("chkAdmin");
                String gt = request.getParameter("chkGT");
                boolean roles = false;
                if(admin != null)
                {
                    roles =true;
                }
                boolean gioitinh = false;
                if(gt != null)
                {
                    gioitinh = true;
                }
                Customers rg = new Customers();
                boolean result = rg.insert(username, password, lastname, gioitinh,email,roles);
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            }else if(action.equals("Search"))
            {
                String ten = request.getParameter("txtTen");
                Customers sp = new Customers();
                List<Customer> list = new ArrayList<Customer>();
                list = sp.showProduct(ten);
                request.setAttribute("listND", list);
                RequestDispatcher rd = request.getRequestDispatcher("customer_edit.jsp");
                rd.forward(request, response);
            }else if(action.equals("Delete"))
            {
                String username = request.getParameter("txtUser");
                Customers nd = new Customers();
                nd.delete(username);
                String url = "ControllerCustomer?action=Search&txtTen=";
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
            }else if(action.equals("Edit"))
            {
                String username = request.getParameter("txtUser");
                String password = request.getParameter("txtPass");
                String hoten = request.getParameter("txtLast");
                String gt = request.getParameter("txtGT");
                String email = request.getParameter("txtEmail");
                String admin = request.getParameter("txtRole");
                boolean roles = false;
                if(admin != null)
                {
                    roles =true;
                }
                boolean gioitinh = false;
                if(gt != null)
                {
                    gioitinh = true;
                }
                Customer nd = new Customer(username, password, hoten, gioitinh, email, roles);
                request.setAttribute("ND", nd);
                String url = "editCustomer.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
            }else if(action.equals("Update"))
            {
                String username = request.getParameter("txtUser");
                String password = request.getParameter("txtPass");
                String hoten = request.getParameter("txtLast");
                String gt = request.getParameter("chkGT");
                String email = request.getParameter("txtEmail");
                String admin = request.getParameter("chkAdmin");
                boolean roles = false;
                if(admin != null)
                {
                    roles =true;
                }
                boolean gioitinh = false;
                if(gt != null)
                {
                    gioitinh = true;
                }
                Customers nd = new Customers();
                nd.updateCustomer(username, password,hoten, gioitinh, email, roles);
                String url="ControllerCustomer?action=Search&txtTen=";
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
            }
            
        }catch(Exception ex){ex.printStackTrace();}
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
