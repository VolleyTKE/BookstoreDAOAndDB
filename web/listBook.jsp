<%-- 
    Document   : listUser
    Created on : Aug 1, 2015, 9:05:36 AM
    Author     : Chris
--%>

<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Show All Books</title>
</head>
<body>
    <table border=1>
        <thead>
            <tr>
                <th>Book ID</th>
                <th>Title</th>
                <th>Year Published</th>
                <th>Quantity</th>
                
                <th colspan=2>Action</th>
            </tr>
        </thead>
        <tbody
            

            <c:forEach var="book" items="${book}" >
                
                <tr>
                    <td><c:out value="${book.bookid}" /></td>
                    <td><c:out value="${book.title}" /></td>
                    <td><c:out value="${book.author}" /></td>
                    <td><c:out value="${book.yearpub}" /></td>
                    <td><c:out value="${book.quantity}"/></td>
                    
                    <td><a href="BookController?action=edit&bookid=<c:out value="${book.bookid}"/>">Update</a></td>
                    <td><a href="BookController?action=delete&bookid=<c:out value="${book.bookid}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p><a href="BookController?action=insert">Add Book</a></p>
</body>
</html>
