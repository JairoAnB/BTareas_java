import classes.Control;
import classes.Vegetales;
import classes.Vestuario;
import model.Producto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Control control = new Control();
        Vegetales vegetales = new Vegetales("1","Papa",500,date,date);
        Vegetales vegetales2 = new Vegetales("2","Lechuga",20,date,date);
        Vestuario vestuario = new Vestuario("3","Pantalon",25,12,"Gris");
        Vestuario vestuario2 = new Vestuario("4","Poleron",100,25,"Amarillo");
        //Array
        List<Producto> productos = new ArrayList<>();
        productos.add(vegetales);
        productos.add(vegetales2);
        productos.add(vestuario);
        productos.add(vestuario2);
        //instanciamiento clases
        control.inicioSesion();
        control.menu(productos);
    }
}