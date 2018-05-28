package org.wcs.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/simplehello", "/customHello"})
public class SimpleHelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String momentOfTheDay;
        int time = Integer.parseInt(request.getParameter("time"));

        if (time <= 17 && time >= 8) {
            momentOfTheDay = "Bonjour";
        } else {
            momentOfTheDay = "Bonsoir";
        }

        String message = momentOfTheDay + " " + name + " " + lastName + " il est: " + time;

        request.setAttribute("result", message);

        this.getServletContext().getRequestDispatcher("/custom-hello.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/helloworld.jsp").forward(request, response);
    }

}
