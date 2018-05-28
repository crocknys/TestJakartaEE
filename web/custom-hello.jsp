<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 28/05/18
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result custom hello</title>
    <link href="customeHello.css" rel="stylesheet" type="text/css">
</head>

<body>

    <H1>
    <%
        String indextext = (String) request.getAttribute("result");
        out.println(indextext);
    %>
    </H1>

</body>
</html>
