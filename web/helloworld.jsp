<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 28/05/18
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Oh Monde Magnifique</title>
</head>
<body>

<!-- appel du java -->

<form action="/customHello" method="post">

    First name:<br>
    <input type="text" name="firstname">
    <br>

    Last name:<br>
    <input type="text" name="lastname">
    <br>

    Time fo the day:<br>
    <input type="text" name="time">

    <input type="submit" value="Submit">

</form>



</body>
</html>
