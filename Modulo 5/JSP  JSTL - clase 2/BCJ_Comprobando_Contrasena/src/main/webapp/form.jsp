<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">

    <title>Formulario</title>
</head>
<body>
    <h1> Introduzca su contraseña </h1>

    <form action="evaluar-password" method="post">
      <label for="password">Contraseña:</label>
      <input type="text" id="password" name="password" required >
      <button type="submit">Enviar</button>

    </form>
</body>
</html>
