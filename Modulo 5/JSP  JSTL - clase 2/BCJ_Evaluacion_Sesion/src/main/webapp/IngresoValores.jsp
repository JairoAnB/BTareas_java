<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>Ingresar valores</title>
</head>
<body>
<div class="container mt-5">
    <div class="border p-4">
        <div class="text-center mb-4">
            <img src="images/Falabella.svg.png" alt="Logo" class="img-fluid" style="max-width: 250px;">
        </div>
        <div class="text-right">
            <h2>Factura</h2>
            <p><strong>Fecha:</strong> 10 de octubre de 2024</p>
            <p><strong>Factura No:</strong> 001234</p>
            <p><strong>Cliente:</strong> </p>
        </div>
        <hr>
        <form action="RecibirDatos" method="post">
            <div class="form-group row">
                <div class="col-md-6">
                    <label for="nombre">Nombre:</label>
                    <input type="text" class="form-control" id="nombre" name="nombre" required placeholder="Ingrese su nombre">
                </div>
                <div class="col-md-6">
                    <label for="direccion">Dirección:</label>
                    <input type="text" class="form-control" id="direccion" required name="direccion" placeholder="Ingrese su dirección">
                </div>
            </div>
            <div class="table-responsive">
                <table class="table table-bordered mt-4">
                    <thead class="thead-light">
                    <tr>
                        <th>Producto</th>
                        <th>Descripción</th>
                        <th>Valor Unidad</th>
                        <th>Cantidad</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>Motherboard</td>
                        <td>Asus LGA 1200</td>
                        <td>$249,000</td>
                        <td>
                            <input type="number" class="form-control" name="cantidadP1" min="1" value="1">
                        </td>
                    </tr>
                    <tr>
                        <td>Ram</td>
                        <td>DDR4 Kingston 16GB 4200Mhz</td>
                        <td>$45,990</td>
                        <td>
                            <input type="number" class="form-control" name="cantidadP2" min="1" value="1">
                        </td>
                    </tr>
                    <tr>
                        <td>Procesador</td>
                        <td>i7 14700F</td>
                        <td>$379,000</td>
                        <td>
                            <input type="number" class="form-control" name="cantidadP3" min="1" value="1">
                        </td>
                    </tr>
                    <tr>
                        <td>Tarjeta de video</td>
                        <td>RTX 4070 SUPER MSI gaming X</td>
                        <td>$219,900</td>
                        <td>
                            <input type="number" class="form-control" min="1" name="cantidadP4" value="1">
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="text-right mt-3">
                <button type="submit" class="btn btn-success">Generar Factura</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
