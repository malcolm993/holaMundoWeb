/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saludotest.holamundoweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author santiago
 */
public class ServletColorPreferido extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET");
        String nombre= req.getParameter("nombre");
        String apellido= req.getParameter("apellido");
        String colorElegido= req.getParameter("color");
        PrintWriter out =  resp.getWriter();
        
        out.println("<html><head></head><body>");
        out.println("<h1 span style= 'color:"+ colorElegido+ "'>Hola "+ nombre +" " +apellido+"</h1 >");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST");
    }
    
    
    
}
