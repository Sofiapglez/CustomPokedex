package net;

import net.lista.ListaPokemon;
import net.pokemons.clasehija.PokemonLegendario;
import net.pokemons.clasepadre.Pokemon;

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

            switch (opcion) {
                case "a":
                    System.out.println("Introduce el nombre del net.salesianos.clases.Pokemon: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Introduce el tipo");
                    String tipo = scanner.nextLine();

                    Pokemon pokemonAvistado = new Pokemon(nombre, tipo);
                    listaAvistados.agregarPokemon(pokemonAvistado);
                    System.out.println("Avistamiento añadido correctamente");
                    break;
                case "b":
                    System.out.println("Ingrese el nombre del net.salesianos.clases.Pokemon legendario: ");
                    String nombreLegendario = scanner.nextLine();
                    System.out.println("Ingrese el tipo de pokemon legendario: ");
                    String tipoLegendario = scanner.nextLine();
                    System.out.println("Ingresa la localización del pokemon legendario: ");
                    String localizacion = scanner.nextLine();

                    PokemonLegendario pokemonLegendario = new PokemonLegendario(nombreLegendario, tipoLegendario);
                    pokemonLegendario.setLocalizacion(localizacion);
                    listaAvistados.agregarPokemon(pokemonLegendario);
                    System.out.println("Avistamiento legendario añadido");
                    break;
                case "c":
                    System.out.println("Introduce el nombre del net.salesianos.clases.Pokemon que quieres capturar");
                    String nombreCaptura = scanner.nextLine();
                    Pokemon pokemonCaptura = listaAvistados.buscarPokemon(nombreCaptura);
                    if (pokemonCaptura != null) {
                        listaAvistados.eliminarPokemon(nombreCaptura);
                        System.out.print("Introduce el peso del pokemon: ");
                        double peso = scanner.nextDouble();
                        System.out.print("Introduce la altura del pokemon: ");
                        double altura = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Introduce la descripción del pokemon: ");
                        String descripcion = scanner.nextLine();

                        pokemonCaptura.setPeso(peso);
                        pokemonCaptura.setAltura(altura);
                        pokemonCaptura.setDescripcion(descripcion);

                        listaCapturados.agregarPokemon(pokemonCaptura);
                        System.out.println("net.salesianos.clases.Pokemon capturado correctamente");

                    } else {
                        System.out.println("No se ha encontrado el pokemon en la lista de avistados.");
                    }
                    break;
                case "d":
                    System.out.println("\nLista de pokemons avistados");
                    listaAvistados.mostrarLista();
                    break;
                case "e":
                    System.out.println("\nLista de pokemons capturados");
                    listaCapturados.mostrarLista();
                    break;
                case "f":
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Elige una opción válida");
                    break;
                }
            }
        }
    }