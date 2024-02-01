<%@ page import="java.util.List" %>
<%@ page import="edu.ec.epn.saew.Student" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista estudiantes</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Grade</th>
        </tr>
        <% 
            List<Student> students = (List)request.getAttribute("students"); 
            for(Student s: students) {

        %>
            <tr>
                <td><%= s.getId() %></td>
                <td><%= s.getName() %></td>
                <td><%= s.getGrade() %></td>
            </tr>

        <% } %>
    </table>
</body>
</html>