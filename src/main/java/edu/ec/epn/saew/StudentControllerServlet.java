package edu.ec.epn.saew;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet(name = "StudentControllerServlet", urlPatterns = "/student-list")
public class StudentControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String view = "list";
        if (req.getParameter("view") != null && "chart".equals(req.getParameter("view"))) {
            view = "chart";
        }

        List<Student> students = getStudents();

        List<String> names = students.stream().map(s -> s.getName()).collect(Collectors.toList());
        List<Float> grades = students.stream().map(s -> s.getGrade()).collect(Collectors.toList());

        Gson gson = new Gson();
        String namesJson = gson.toJson(names);
        String gradesJson = gson.toJson(grades);

        req.setAttribute("students", students);
        req.setAttribute("STUDENT_NAMES", namesJson);
        req.setAttribute("STUDENT_GRADES", gradesJson);
        //req.getRequestDispatcher("student-table.jsp").forward(req, resp);
        RequestDispatcher dispatcher = null;
        if ("chart".equals(view)) {
            dispatcher = req.getRequestDispatcher("student-chart.jsp");
        } else {
            dispatcher = req.getRequestDispatcher("student-table.jsp");
        }

        dispatcher.forward(req, resp);
    }

    private List<Student> getStudents() {
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
