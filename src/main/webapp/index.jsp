<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="labtwo_movie_store/WEB-INF/style/main_style.css">
    <title>Главная</title>
</head>
<body>
<header>
    <h2>Movie store can't find charset</h2>
    <button class="mp_button">sign in</button>
    <button class="mp_button">sign up</button>
</header>
<main>
    <table>
        <c:forEach var="movie" items="${simpleinfo}" >
            <tr> <td>${movie}</td> </tr>
        </c:forEach>
    </table>
</main>

</body>
</html>

