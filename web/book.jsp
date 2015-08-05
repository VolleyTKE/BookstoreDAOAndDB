<%-- 
    Document   : book
    Created on : Aug 1, 2015, 11:17:04 AM
    Author     : Chris
--%>

<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">


<title>Add new book</title>
</head>
<body>


    <form method="POST" action='BookController' name="frmAddBook">
        Book ID : <input type="text" readonly="readonly" name="bookid"
            value="<c:out value="${book.bookid}" />" /> <br/> 
        Year Published : <input
            type="text" name="yearpub"
            value="<c:out value="${book.yearpub}" />" /> <br/> 
        Title : <input
            type="text" name="Title"
            value="<c:out value="${book.title}" />" /> <br/> 
        Author : <input 
            type="text" name="author"
            value="<c:out value="${book.author}" />" /> <br/>
        Price : <input
            type="text" name="price"
            value="<c:out value="${book.price}" />" /> <br/>
        Quantity : <input 
            type="text" name ="quantity" value="<c:out 
            value="${book.quantity}"/>"/><br /> 
        <input type="submit" value="Submit">
    </form>
</body>
</html>
