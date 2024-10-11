
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
    <title>Inicia sesion</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
    <div class="container">
    <h2>Login</h2>
    <form action="procesaLogin" method="post">
        <div class="form-group">
            <label for="username">Usuario: </label>
            <input type="text" class="form-control" id="username"  name="username" required>
        </div>
        <div class="form-group">
            <label for="password">Contraseña: </label>
            <input id="password" class="form-control" name="password" type="password" required>
        </div>
        <button type="submit" class="btn btn-success">Entrar</button>
    </form>
    </div>
</body>
</html>
