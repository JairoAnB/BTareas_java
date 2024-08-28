package ControlProductos;

import java.util.ArrayList;
import java.util.Scanner;

public class Control {

    static ArrayList<Producto> listaProductos = new ArrayList();

    static{
        listaProductos.add(new Producto("Chocolate",500,"Chocolate amargo, 500gr"));
        listaProductos.add(new Producto("Leche",800,"Leche entera, 1 litro"));
        listaProductos.add(new Producto("Arroz",900,"Arroz grado2, 1kg"));
    }

    public static void Iteracion(){
        boolean salir = true;
        while (salir) {
            String eleccion;
            Scanner sc = new Scanner(System.in);
            System.out.println("WALMORT LTDA, SOFTWARE DE INVENTARIO DE PRODUCTOS BASICOS");
            System.out.println("Por favor elija una opcion\n" +
                    "1- Ver productos\n" +
                    "2- Agregar productos\n" +
                    "3- Modificar producto\n" +
                    "4- Salir");
            System.out.println("----------------------------------------------------------");
            eleccion = sc.nextLine();
            switch (eleccion){
                case "1":
                    for (int i = 0; i <listaProductos.size(); i++){
                        Producto p = listaProductos.get(i);
                        System.out.println(p);
                    }
                    System.out.println("----------------------------------------------------------");
                    break;
                case "2":
                    if (listaProductos.size()>= 7 ){
                        System.out.println("YA TIENE 7 ELEMENTOS AGREGADOS. SI DESEA CAMBIAR UNO APRETE 3");
                        System.out.println("----------------------------------------------------------");
                        break;
                    }else{
                        System.out.println("Ingrese el nombre del producto: ");
                        String Nombre = sc.nextLine().trim();

                        System.out.println("Ingrese el valor del producto: ");
                        int Valor = sc.nextInt();
                        //Nextline para consumir el salto de linea.
                        sc.nextLine();

                        System.out.println("Ingrese la descripcion del producto: ");
                        String Descripcion = sc.nextLine().trim();

                        System.out.println("¡PRODUCTO " + Nombre + " AGREGADO CON EXITO!");
                        System.out.println("----------------------------------------------------------");
                        listaProductos.add(new Producto(Nombre,Valor,Descripcion));
                        break;
                    }

                case "3":
                    System.out.println("Ingrese el numero del producto a actualizar de la siguente lista: ");
                    for (int i = 0; i <listaProductos.size(); i++){
                        System.out.println((i) + ". " + listaProductos.get(i).getNombre());
                        }
                        int Update = sc.nextInt();
                        Producto ProductoUpdate = listaProductos.get(Update);
                        sc.nextLine();

                        System.out.println("Ingrese el nuevo nombre para el producto (" + ProductoUpdate.getNombre().toUpperCase() +")");
                        String nuevoNombre = sc.nextLine();

                        System.out.println("Ingrese el nuevo valor del producto: ");
                        int nuevoValor = sc.nextInt();

                        sc.nextLine();
                        System.out.println("Ingrese la nueva descripcion del producto: ");
                        String nuevaDescripcion = sc.nextLine().trim();

                        ProductoUpdate.setNombre(nuevoNombre);
                        ProductoUpdate.setValor(nuevoValor);
                        ProductoUpdate.setDescripcion(nuevaDescripcion);

                        System.out.println("SE HA ACTUALIZADO EL PRODUCTO A (" + ProductoUpdate.getNombre().toUpperCase() + ") " + "CON EXITO");
                        System.out.println("----------------------------------------------------------");
                        break;

                case "4":
                    System.out.println("Gracias por preferir WALTMORT, antes que cualquier otro. ¡HASTA LUEGO! ");
                    salir = false;
                    break;
                    default:
                        System.out.println("Opcion ingresada no es valida, por favor reintente nuevamente.");
            }

        }
    }
}

