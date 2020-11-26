package com.william.controller.Admin;

import com.william.Dao.ProductDAO;
import com.william.model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ResultListProduct", urlPatterns = "/productlist")
public class ResultListProduct extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        ArrayList<Product> products = ProductDAO.getProductInDb();
        request.setAttribute("productsReultAdmin",products );
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/admin/html/resultListProduct.jsp");
        requestDispatcher.forward(request,response);
    }
}
