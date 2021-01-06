<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h1><c:out value="${error}"/></h1>
    <form action="/check" method="post">
        <label > what is the code </label>
        <input type="text" name="code" id="code">
        <input type="submit">
    </form>

</center>



</body>
</html>