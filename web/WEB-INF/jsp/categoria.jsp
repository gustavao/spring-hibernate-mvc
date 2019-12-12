<%-- 
    Document   : categoria
    Created on : 11/12/2019, 01:23:07 PM
    Author     : Gustavo Espindola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Costo</th>
                    <th>Nombre</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="categoria" items="${categoria}">
                    <tr>
                        <td><c:out value="${categoria.getId()}"></c:out></td>
                        <td><c:out value="${categoria.getCoste}"></c:out></td>
                        <td><c:out value="${categoria.getNombre()}"></c:out></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
