<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
   <form action="register" method="post">
   Name:<input type="text" name="sname"><br><br>
   Age:<input type="number" name="sage"><br><br>
   Address:<textarea rows="5" cols="30" name="saddress"></textarea><br><br>
   Course:<select name="scourse">
       <option value="B.Com">B.Com</option>
       <option value="M.Com">M.Com</option>
       <option value="B.E">B.E</option>
       <option value="B.Tech">B.Tech</option>     
   </select><br><br>
   <input type="submit" value="Register">
   <input type="reset" value="clear">
   </form>
   <a href="viewAllStudents">View All Students</a>
</body>
</html>