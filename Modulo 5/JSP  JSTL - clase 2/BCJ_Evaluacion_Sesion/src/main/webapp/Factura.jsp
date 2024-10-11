<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  <title>Factura</title>
</head>
<body>
<div class="container mt-5">
  <div class="border p-4">
    <div class="text-center mb-4">
      <img src="images/Falabella.svg.png" alt="Logo" class="img-fluid" style="max-width: 250px;">
    </div>
    <div class="row">
      <div class="col-md-6">
        <h2>Factura</h2>
        <p><strong>Fecha:</strong> 10 de octubre de 2024</p>
        <p><strong>Factura No:</strong> 001234</p>
      </div>
      <div class="col-md-6 text-right">
        <p><strong>Cliente:</strong> <%= request.getAttribute("nombre") %></p>
        <p><strong>Dirección:</strong> <%= request.getAttribute("direccion") %></p>
      </div>
    </div>
    <hr>
    <div class="table-responsive">
      <table class="table table-bordered mt-4">
        <thead class="thead-light">
        <tr>
          <th>Producto</th>
          <th>Descripción</th>
          <th>Valor Unidad</th>
          <th>Cantidad</th>
          <th>Subtotal</th>
        </tr>
        </thead>
        <tbody>
        <tr>
          <td>Motherboard</td>
          <td>Asus LGA 1200</td>
          <td>$249,000</td>
          <td><%= request.getAttribute("cantidadP1") %></td>
          <td>$<%= String.valueOf((int) request.getAttribute("precioTarjetaMadre")) %></td>
        </tr>
        <tr>
          <td>Ram</td>
          <td>DDR4 Kingston 16GB 4200Mhz</td>
          <td>$45,990</td>
          <td><%= request.getAttribute("cantidadP2") %></td>
          <td>$<%= String.valueOf((int) request.getAttribute("precioRam")) %></td>
        </tr>
        <tr>
          <td>Procesador</td>
          <td>i7 14700F</td>
          <td>$379,000</td>
          <td><%= request.getAttribute("cantidadP3") %></td>
          <td>$<%= String.valueOf((int) request.getAttribute("precioProcesador")) %></td>
        </tr>
        <tr>
          <td>Tarjeta de video</td>
          <td>RTX 4070 SUPER MSI gaming X</td>
          <td>$219,900</td>
          <td><%= request.getAttribute("cantidadP4") %></td>
          <td>$<%= String.valueOf((int) request.getAttribute("precioTarjetaVideo")) %></td>
        </tr>
        </tbody>
      </table>
    </div>
    <div class="mt-4">
      <h4>Precio Total Neto: $<%= String.valueOf((int) request.getAttribute("total")) %></h4>
      <h4>Descuento 10%</h4>
      <h3>Total con Descuento: $<%= String.valueOf((double) request.getAttribute("totalFinal")) %></h3>
    </div>
  </div>
</div>
</body>
</html>
