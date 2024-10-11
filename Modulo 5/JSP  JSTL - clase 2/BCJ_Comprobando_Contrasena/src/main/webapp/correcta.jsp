
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Completado</title>
</head>
<body>
<% String password = (String) request.getAttribute("password");  %>
<h3> Su contraseña es : <%=password%></h3>
      <h1>Su contraseña es correcta</h1>

        <a href="form.jsp">Volver</a>
</body>
</html>
