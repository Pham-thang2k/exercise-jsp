<%-- 
    Document   : thanks
    Created on : Sep 1, 2021, 9:53:35 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Murach's Java Servlets and JSP</title>
         <link rel="stylesheet" href="css/main.css" type="text/css"/>
    </head>
    <body>
        <h1>Thanks for joining our email list</h1
        <p>Here is the information that you entered;</p>
        <label>Email:</label>
        <span>${user.email}</span><br>
        <label>First Name:</label>
        <span>${user.firstName}</span><br>
        <label>Last Name:</label>
        <span>${user.lastName}</span><br>
        <label>Heard From:</label>
        <span>${user.heardFrom}</span><br>
        <label>Updates:</label>
        <span>${user.updates}</span><br>
        <label>Via:</label>
        <span>${user.via}</span><br>
        
        <p>To enter another email address, click on the Back button in your browser or the Return button shown below.</p>
        
        <form action="" method="get">
            <input type="hidden" name="action" value="join">
            <input type="submit" value="Return">
        </form>
    </body>
</html>
