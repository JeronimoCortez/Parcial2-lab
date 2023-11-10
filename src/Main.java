import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Aeropuerto> listaAeropuertos = new ArrayList<>();
        int opcion,posicion;
        String nombre;
        Scanner read = new Scanner(System.in);
        do{
            System.out.println("**** Ingrese una opcion ****");
            System.out.println("1.Agregar un aeropuerto a la lista: ");
            System.out.println("2.Eliminar un aeropuerto de la lista");
            System.out.println("3.Buscar un aeropuerto por nombre");
            System.out.println("4.Lista de aeropuertos");
            System.out.println("5.Mostrar aeropuerto por posicion en la lista");
            System.out.println("6.Salir");
            opcion = read.nextInt();
            switch (opcion){
                case 1:
                    agregarAeropuerto(listaAeropuertos);
                    break;
                case 2:
                    read.nextLine();
                    System.out.println("Ingrese el nombre del aeropuerto que desea eliminar");
                    nombre = read.nextLine();
                    eliminarAeropuerto(nombre,listaAeropuertos);
                    break;
                case 3:
                    read.nextLine();
                    System.out.println("Ingrese el nombre del aeropuerto que desea buscar");
                    nombre = read.nextLine();
                    buscarAeropuertoPorNombre(nombre,listaAeropuertos);
                    break;
                case 4:
                    listarAeropuertos(listaAeropuertos);
                    break;
                case 5:
                    System.out.println("Ingrese la posicion del aeropuerto");
                    posicion = read.nextInt();
                    aeropuertoPorPosicion(posicion, listaAeropuertos);
                    break;
                case 6:
                    System.out.println("Salio del programa!!");
                    break;
            }
        }while(opcion != 6);
    }
    public static void agregarAeropuerto(ArrayList<Aeropuerto> listaAeropuertos){
        Aeropuerto a1 = new Aeropuerto();
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el nombre del aeropuerto");
        a1.setNombre(read.nextLine());
        System.out.println("Ingrese el pais del aeropuerto");
        a1.setPais(read.nextLine());
        System.out.println("Ingrese la ciudad del aeropuerto");
        a1.setCiudad(read.nextLine());
        System.out.println("Ingrese la cantidad de pistas de aterrizaje");
        a1.setPistasAterrizaje(read.nextInt());
        listaAeropuertos.add(a1);
    }

    public static void eliminarAeropuerto(String nombre,ArrayList<Aeropuerto> listaAeropuertos){
        boolean aeropuertoEncontrado = false;
        if(listaAeropuertos.size() > 0) {
            for (int i = 0; i < listaAeropuertos.size(); i++) {
                if (listaAeropuertos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    listaAeropuertos.remove(i);
                    aeropuertoEncontrado = true;
                    System.out.println("El aeropuerto " + nombre + " se elimino correctamente" );
                    break;
                }
            }
            if (aeropuertoEncontrado == false) {
                System.out.println("El aeropuerto no esta en la lista");
            }
        }else{
                System.out.println("No hay aeropuertos en la lista");
        }
        }

    public static void buscarAeropuertoPorNombre(String nombre,ArrayList<Aeropuerto> listaAeropuertos){
        boolean aeropuertoEncontrado = false;
        if(listaAeropuertos.size() > 0) {
            for (int i = 0; i < listaAeropuertos.size(); i++) {
                if (listaAeropuertos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Los datos del aeropuerto " + nombre + " son:");
                    System.out.println(i+1 + ".Nombre = " + listaAeropuertos.get(i).getNombre() + ", Pais = " + listaAeropuertos.get(i).getPais() + ", Ciudad = " +listaAeropuertos.get(i).getCiudad() + ", Pistas de aterrizaje = " + listaAeropuertos.get(i).getPistasAterrizaje());
                    aeropuertoEncontrado = true;
                    break;
                }
            }
            if (aeropuertoEncontrado == false) {
                System.out.println("El aeropuerto no esta en la lista");
            }
        }else{
            System.out.println("No hay aeropuertos en la lista");
        }
    }

    public static void listarAeropuertos(ArrayList<Aeropuerto> listaAeropuertos){
        if(listaAeropuertos.size() > 0) {
            for (int i = 0; i < listaAeropuertos.size(); i++) {
                System.out.println(i+1 + ".Nombre = " + listaAeropuertos.get(i).getNombre() + ", Pais = " + listaAeropuertos.get(i).getPais() + ", Ciudad = " +listaAeropuertos.get(i).getCiudad() + ", Pistas de aterrizaje = " + listaAeropuertos.get(i).getPistasAterrizaje());
            }
        }else{
            System.out.println("No hay aeropuertos en la lista");
        }
    }

    public static void aeropuertoPorPosicion(int posicion,ArrayList<Aeropuerto> listaAeropuertos){
        if(listaAeropuertos.size() > 0) {
            if (posicion >= 1 && posicion <= listaAeropuertos.size()){
                System.out.println("Los datos del aeropuerto de la posicion " + posicion + " son:");
                System.out.println("Nombre = " + listaAeropuertos.get(posicion - 1).getNombre() + ", Pais = " + listaAeropuertos.get(posicion - 1).getPais() + ", Ciudad = " + listaAeropuertos.get(posicion - 1).getCiudad() + ", Pistas de aterrizaje = " + listaAeropuertos.get(posicion - 1).getPistasAterrizaje());
            }else{
                System.out.println("La posicion ingresada esta fuera de los rangos permitidos");
            }
        }else{
            System.out.println("No hay aeropuertos en la lista");
        }
    }
}
