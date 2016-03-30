<%--
  Created by IntelliJ IDEA.
  User: Илья
  Date: 30.03.2016
  Time: 0:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Здания МАИ</title>
</head>
<body>

<table border = "2" align="center">
    <tr>
        <th>ID здания</th>
        <th>Название здания</th>
    </tr>
    <c:forEach items = "${buildings_list}" var = "building">
        <tr>
            <td>${building.building_id}</td>
            <td>${building.building_name}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
