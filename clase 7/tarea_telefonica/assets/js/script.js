var boleta;
var señal;
var ofertas;
var consultas;
var respuesta;
var opcion = prompt(
  "¡Hola! Soy Eva, tu asistente virtual del Servicio al Cliente de Mentel. Estoy aquí para ayudarte en lo que necesides.\nEscribe el número de la opción que buscas: \n1.- Boletas y Pagos \n2.- Señal y llamadas \n3.- Oferta comercial  \n4.- Otras consultas"
);
//Panel principal
if (opcion == 1) {
  boleta = prompt("Seleccione una opcion.\n1.- Ver boleta.\n2.- Pagar cuenta");
} else if (opcion == 2) {
  señal = prompt(
    "Seleccione una opcion.\n1.- Problemas de señal.\n2.- Problemas con las llamadas"
  );
} else if (opcion == 3) {
  ofertas = prompt(
    "¡Mentel tiene una oferta comercial acorde a tus necesidades! Para conocer mas informacion y ser asesorado personalmente por un ejecutivo escribe 'SI' y un ejecutivo te llamara. De lo contrario ingrese 'NO' "
  );
} else if (opcion == 4) {
  consultas = prompt("A continuacion escriba su consulta:");
  alert(
    `Estimado usuario, su consulta: '${consultas}' ha sido ingresada con exito. Pronto sera contactado por uno de nuestros ejecutivos.`
  );
} else {
  alert(
    "La opcion ingresada no es valida. Gracias por preferir nuestros servicios"
  );
}
//Boletas y pogos
if (boleta == 1) {
  alert("Haga click aqui para descargar su boleta");
} else if (boleta == 2) {
  alert("Usted esta siendo trasferido. Espere por favor.");
}
//Señal y llamadas
if (señal == 1 || señal == 2) {
  respuesta = prompt("A continuacion escriba su solicitud: ");
  alert(
    `Estimado usuario, su solicitud: '${respuesta}' Ha sido ingresada con exito, Pronto sera contactado por uno de nuestros ejecutivos.`
  );
}
//Oferta comercial
if (ofertas == "Si" || ofertas == "si" || ofertas == "SI") {
  alert("Un ejecutivo se contactara con usted");
} else {
  alert("Gracias por preferir nuestros servicios");
}
//Otras consultas
