const numero1 = prompt("Introduce el primer número");
const numero2 = prompt("Introduce el segundo número");
let resultado;

if (numero1 > numero2) {
    resultado = `El numero ${numero1} es mayor que el numero ${numero2}`;
} else if (numero1 < numero2) { 
    resultado = `El numero ${numero2} es mayor que el numero ${numero1}`;
} else {
    resultado = `Los numeros son iguales`;
}
alert(resultado);