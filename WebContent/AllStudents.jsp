<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Students</title>
</head>
<body>
  <h1>Display All the Students</h1>
  <table border=1 width=100%>
    <tr><th>Student_ID</th><th>Student_Name</th><th>Student_Age</th><th>Student_Address</th><th>Course</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="student" items="${Students}">    
      <tr>
        <td>${student.sid}</td>
        <td>${student.sname}</td>
        <td>${student.sage}</td>
        <td>${student.saddress}</td>
        <td>${student.scourse}</td>        
        <td><a href="edit/${student.sid}">Edit</a></td>
        <td><a href="delete/${student.sid}">Delete</a></td>
      </tr>    
    </c:forEach>
  </table>
</body>
</html>