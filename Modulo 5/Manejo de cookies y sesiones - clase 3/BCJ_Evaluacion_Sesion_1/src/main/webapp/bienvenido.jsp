<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bienvenido</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <h2 class="fs-3 text-center">Bienvenido</h2>
    <% HttpSession sesion = request.getSession();
       String nombreLocal = (String) sesion.getAttribute("username");%>
    <br/>
    <p> Si puedes ver esta escena, haz iniciado sesion correctamente. Usted ha iniciado sesión.</p>
    <p> Bienvenido <%= nombreLocal %></p>
    <br/>

    <form action="deslogeo" method="post">
        <button type="submit" class="btn btn-danger text-center ">Cerrar sesión</button>
    </form>
</div>
</body>
</html>

