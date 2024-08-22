var tareas = [];
var formulario = document.getElementById("formulario");
var BotonAgregar = document.getElementById("agregar-tarea");
var hidden = document.getElementsByClassName("hidden");

BotonAgregar.addEventListener("click", function () {
  if (formulario.classList.contains("hidden")) {
    formulario.classList.remove("hidden");
  } else {
    formulario.classList.add("hidden");
  }
});

function cerrarTarea() {
  document.getElementById("formulario").classList.add("hidden");
}
function Agregar() {
  var filaCreada = crearFila();
  var cuerpoTabla = document.getElementById("cuerpo-tabla");
  cuerpoTabla.appendChild(filaCreada);
  cerrarTarea();
}

function crearFila(tarea) {
  var input = document.getElementById("nuevaTarea");
  var texto = input.value;
  input.value = "";
  var fila = document.createElement("tr");
  var celda = document.createElement("td");
  var boton = document.createElement("button");
  var botonCelda = document.createElement("td");
  boton.type = "button";
  boton.className = "btn btn-danger";
  boton.textContent = "Finalizar";
  boton.addEventListener("click", function () {
    tareas.pop();
    fila.remove();
  });

  celda.textContent = texto;

  fila.appendChild(celda);
  botonCelda.appendChild(boton);
  fila.appendChild(botonCelda);

  tareas.push(texto);
  console.log(tareas);
  return fila;
}

function iterarTareas() {
  tareas.forEach((tarea) => {
    var cuerpoTabla = document.getElementById("cuerpo-tabla");
    var fila = crearFila(tarea);
    cuerpoTabla.appendChild(fila);
  });
}
