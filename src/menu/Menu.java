package menu;

public class Menu {
    public static void menu() {
        boolean salir = false;
        String opcion = "";
        do {
            System.out.println("0. Salir");
            System.out.println("1. Ejercicio1 ficheros");
            System.out.println("2. Ejercicio1 ficheros NIO");
            System.out.println("3. Ejercicio2 ficheros");
            System.out.println("4. Ejercicio2 ficheros NIO");

            opcion = libs.Leer.pedirCadena("Introduce una opción");
            switch (opcion) {
                case "0" -> salir = true;
                case "1" -> {

                }
                case "2" -> {

                }
                case "3" -> {

                }
                case "4" -> {

                }
                default -> {

                }
            }
        }
        while (!salir);
    }
}
