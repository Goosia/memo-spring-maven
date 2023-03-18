<%--
  Created by IntelliJ IDEA.
  User: Goosia
  Date: 2023-03-18
  Time: 오후 8:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <table>
        <tr>
            <th>id</th>
            <th>contents</th>
        </tr>
<c:forEach items="${hello}" var="memo">
        <tr>
            <td>${memo.idx}</td>
            <td>${memo.contents}</td>
        </tr>
</c:forEach>
    </table>
</body>
</html>
