import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaPokemon listaAvistados = new ListaPokemon();
        ListaPokemon listaCapturados = new ListaPokemon();

        Scanner scanner = new Scanner(System.in);
        String opcion = "";

        while (!opcion.equals("f")) {
            System.out.println("");
            System.out.println("Bienvenido a la Pokedex");
            System.out.println("Escoge una opción: ");
            System.out.println("a. Añadir un pokemon avistado");
            System.out.println("b. Añadir avistamiento legendario");
            System.out.println("c. Pasar a capturados");
            System.out.println("d. Mostrar lista de avistados");
            System.out.println("e. Mostrar lista de capturados");
            System.out.println("f. Cerrar la pokedex");
            opcion = scanner.nextLine();

        }
    }
}