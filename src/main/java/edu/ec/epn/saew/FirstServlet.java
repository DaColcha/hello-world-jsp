package edu.ec.epn.saew;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (name="FirstServlet", urlPatterns={"/first"})
public class FirstServlet  extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Alejandra", 8.5f));
        students.add(new Student(2, "Juan", 9.5f));
        students.add(new Student(3, "Maria", 7.5f));
        
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<table>");
        out.println("<tr>");
        out.println("<th>Id</th>");
        out.println("<th>Name</th>");
        out.println("<th>Grade</th>");
        out.println("</tr>");
        for (Student student : students) {
            out.println("<tr>");
            out.println("<td>" + student.getId() + "</td>");
            out.println("<td>" + student.getName() + "</td>");
            out.println("<td>" + student.getGrade() + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }

}
