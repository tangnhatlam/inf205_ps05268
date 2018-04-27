/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Product;
import model.Products;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "ControllerProducts", urlPatterns = {"/ControllerProducts"})
public class ControllerProducts extends HttpServlet {

    private static final long serialVersionUID = 1L;

    // location to store file uploaded
    private static final String UPLOAD_DIRECTORY = "images";

    // upload settings
    private static final int MEMORY_THRESHOLD = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50; // 50MB
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            String action = request.getParameter("action");
            if(action.equals("Search"))
            {
                String tensp = request.getParameter("txtTenSP");
                Products sp = new Products();
                List<Product> list = new ArrayList<Product>();
                list = sp.showProduct(tensp);
                request.setAttribute("listSP", list);
                RequestDispatcher rd = request.getRequestDispatcher("products.jsp");
                rd.forward(request, response);
            }else if(action.equals("Delete"))
            {
                String code = request.getParameter("txtCode");
                Products sp = new Products();
                sp.delete(code);
                String url = "ControllerProducts?action=Search&txtTenSP=";
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
            }else if(action.equals("Edit"))
            {
                String code = request.getParameter("txtCode");
                String name = request.getParameter("txtName");
                String pri = request.getParameter("txtPrice");
                String img = request.getParameter("image");
                int ipri = Integer.parseInt(pri);
                Product sp = new Product(code,name,ipri,img);
                request.setAttribute("SP", sp);
                String url = "editProduct.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
            }
            else if(action.equals("Update"))
            {
                String code = request.getParameter("txtCode");
                String name = request.getParameter("txtName");
                String pri = request.getParameter("txtPrice");
                String img = request.getParameter("uploadFile");
                int fpri = Integer.parseInt(pri);
                Products sp = new Products();
                sp.upload(code, name, fpri,img);
                String url="ControllerProducts?action=Search&txtTenSP=";
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
            }
            else if(action.equals("New"))
            {
                String url="newProduct.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
            }
            else if(action.equals("Insert"))
            {
                String code = request.getParameter("txtCode");
                String name = request.getParameter("txtName");
                String pri = request.getParameter("txtPrice");
                String image = request.getParameter("uploadFile");
                int fpri = Integer.parseInt(pri);
                Products sp = new Products();
                sp.insert(code, name, fpri,image);
                String url = "products.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
            }
        }catch(Exception e){e.printStackTrace();}
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
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        // checks if the request actually contains upload file
        if (!ServletFileUpload.isMultipartContent(request)) {
            // if not, we stop here
            PrintWriter writer = response.getWriter();
            writer.println("Error: Form must has enctype=multipart/form-data.");
            writer.flush();
            return;
        }

        // configures upload settings
        DiskFileItemFactory factory = new DiskFileItemFactory();
        // sets memory threshold - beyond which files are stored in disk 
        factory.setSizeThreshold(MEMORY_THRESHOLD);
        // sets temporary location to store files
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

        ServletFileUpload upload = new ServletFileUpload(factory);

        // sets maximum size of upload file
        upload.setFileSizeMax(MAX_FILE_SIZE);

        // sets maximum size of request (include file + form data)
        upload.setSizeMax(MAX_REQUEST_SIZE);

        // constructs the directory path to store upload file
        // this path is relative to application's directory
        String uploadPath = getServletContext().getRealPath("")
                + File.separator + UPLOAD_DIRECTORY;

        // creates the directory if it does not exist
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }

        try {
            // parses the request's content to extract file data
            @SuppressWarnings("unchecked")
            List<FileItem> formItems = upload.parseRequest(request);

            if (formItems != null && formItems.size() > 0) {
                // iterates over form's fields
                for (FileItem item : formItems) {
                    // processes only fields that are not form fields
                    if (!item.isFormField()) {
                        String fileName = new File(item.getName()).getName();
                        String filePath = uploadPath + File.separator + fileName;
                        File storeFile = new File(filePath);

                        // saves the file on disk
                        item.write(storeFile);
                        request.setAttribute("msg", UPLOAD_DIRECTORY + "/" + fileName);
                        request.setAttribute("message",
                                "Upload has been done successfully >>" + UPLOAD_DIRECTORY + "/" + fileName);
                    }
                }
            }
        } catch (Exception ex) {
            request.setAttribute("message",
                    "There was an error: " + ex.getMessage());
        }
        // redirects client to message page
        getServletContext().getRequestDispatcher("/products.jsp").forward(
                request, response);
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
