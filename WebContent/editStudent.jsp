<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<h1>Edit Student</h1>
<body>
   <form:form action="editSave" method="post">
   
   ID:<form:input path="sid" disabled="true"/><br><br>
   Name:<form:input path="sname"/><br><br>
   Age:<form:input path="sage"/><br><br>
   Address: <form:textarea path="saddress" rows="5" cols="30"/><br><br>   
   Course:<form:select path="scourse">
          <form:option value="B.Com">B.Com</form:option>
          <form:option value="M.Com">M.Com</form:option>
          <form:option value="B.E">B.E</form:option>
          <form:option value="B.Tech">B.Tech</form:option>            
   		</form:select><br><br>
   <input type="submit" value="Save">
   <input type="reset" value="clear">   
   </form:form>
   <a href="viewAllStudents">View All Students</a>
</body>
</html>