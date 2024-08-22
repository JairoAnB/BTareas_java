var rut;
var contraseña;
var opcion;
var giro;
var deposito;

//constructor
class Cliente {
  constructor(Nombre, Identificador, Clave, Saldo) {
    this.Nombre = Nombre;
    this.Identificador = Identificador;
    this.Clave = Clave;
    this.Saldo = Saldo;
  }
}
var cliente1 = new Cliente("Jairo", "21599628-0", "1111", 10000);
var cliente2 = new Cliente("Daniel", "21599628-1", "2222", 50000);
var cliente3 = new Cliente("Julio", "21599628-2", "3333", 20000);

var cliente = [cliente1, cliente2, cliente3];

//Banca en linea
alert("Bienvenido a Banca en linea");

rut = prompt("Por favor ingrese su rut");
if (
  rut == cliente1.Identificador ||
  rut == cliente2.Identificador ||
  rut == cliente3.Identificador
) {
  contraseña = prompt("Por favor ingrese su clave");
  if (
    contraseña == cliente1.Clave ||
    contraseña == cliente2.Clave ||
    contraseña == cliente3.Clave
  ) {
    for (let i = 0; i < cliente.length; i++) {
      if (rut == cliente[i].Identificador) {
        alert(`Bienvenido ${cliente[i].Nombre}`);
        while (true) {
          opcion = prompt(
            "Seleccione que desea hacer:\n1.- Ver saldo.\n2.- Realizar giro.\n3.- Realizar deposito.\n4- Salir."
          );
          if (opcion == 1) {
            for (let i = 0; i < cliente.length; i++) {
              if (rut == cliente[i].Identificador) {
                alert(`Su saldo es de: ${cliente[i].Saldo}`);
              }
            }
          } else if (opcion == 2) {
            giro = prompt(
              `Su saldo actual es de: ${cliente[i].Saldo}\n¿Cuanto saldo desea girar?`
            );
            if (giro <= cliente[i].Saldo) {
              cliente[i].Saldo = cliente[i].Saldo - giro;
              alert(
                `Dada su instruccion hemos realizado un giro de : ${giro}\nSu nuevo saldo es de: ${cliente[i].Saldo}.`
              );
            } else {
              alert("Saldo insuficiente, intente nuevamente.");
            }
          } else if (opcion == 3) {
            deposito = prompt(
              `Su saldo actual es de: ${cliente[i].Saldo}\n¿Ingrese el monto que desea depositar?`
            );
            cliente[i].Saldo =
              parseFloat(cliente[i].Saldo) + parseFloat(deposito);
            alert(`Su nuevo saldo es de: ${cliente[i].Saldo}.`);
          } else if (opcion == 4) {
            while (false);
            break;
          } else if (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4) {
            alert("Por favor ingrese una opcion valida");
          }
        }
      }
    }
  } else {
    alert(
      "Por favor verifique su contraseña, recargue la pagina e intente nuevamente."
    );
  }
} else {
  alert(
    "Usuario no registrado, por favor recargue la pagina e intente nuevamente."
  );
}
