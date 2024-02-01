package edu.ec.epn.saew;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="StudentControllerServlet", urlPatterns="/student-list")
public class StudentControllerServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> students = getStudents();

        String[] names = new String[students.size()];
        for (int i = 0; i < students.size(); i++) {
            names[i] = students.get(i).getName();
        }
        System.out.println(Arrays.toString(names));
        req.setAttribute("students", students);
        req.getRequestDispatcher("student-table.jsp").forward(req, resp);
    }

    private List<Student> getStudents(){
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Alejandra", 8.5f));
        students.add(new Student(2, "Juan", 9.5f));
        students.add(new Student(3, "Maria", 7.5f));
        return students;
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doPost(req, resp);
    }
    
    
}
