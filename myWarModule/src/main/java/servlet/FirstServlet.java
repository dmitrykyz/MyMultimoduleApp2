package servlet;

import jar.TestClass;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Dmitry on 10/17/2016.
 */
//@WebServlet(name = "FirstServlet", urlPatterns = "/FirstServlet")
public class FirstServlet extends HttpServlet {

    public FirstServlet() {
        super();
    }
    public void init() throws ServletException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().print("This is " + this.getClass().getName()
                + ", using the GET method");

        //Вот простое обращение к классу в jar
        TestClass testClass = new TestClass();
        response.getWriter().print(testClass.number);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().print("This is " + this.getClass().getName() + ", using the POST method");
    }
    public void destroy() {
        super.destroy(); // Just puts "destroy" string in log
    }
}
