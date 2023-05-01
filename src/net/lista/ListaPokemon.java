package net.lista;

import net.pokemons.clasepadre.Pokemon;

public class ListaPokemon {

    private Pokemon[] pokemonArray;
    private int cantidad;

    public ListaPokemon() {
        pokemonArray = new Pokemon[1];
        cantidad = 0;
    }

    public void agregarPokemon(Pokemon pokemon) {
        if (cantidad == pokemonArray.length) {
            Pokemon[] nuevoArray = new Pokemon[pokemonArray.length + 1];
            System.arraycopy(pokemonArray, 0, nuevoArray, 0, pokemonArray.length);
            pokemonArray = nuevoArray;
        }
        pokemonArray[cantidad] = pokemon;
        cantidad++;
    }

    public void eliminarPokemon (String nombre) {
        for (int i = 0; i < cantidad; i++) {
            if (pokemonArray[i].getNombre().equals(nombre)) {
                for (int j = i; j < cantidad - 1; j++) {
                    pokemonArray[j] = pokemonArray[j + 1];
                }
                cantidad --;
                pokemonArray[cantidad] = null;
                return;
            }
        }
        System.out.println("No se encuentra el pokemon");
    }

    public void mostrarLista() {
        if (cantidad == 0) {
            System.out.println("No hay pokemons en la lista");
        } else {
            for (int i = 0; i < cantidad; i++) {
                System.out.println("net.salesianos.clases.Pokemon " + (i + 1) + ":");
                System.out.println(pokemonArray[i].toString());
                System.out.println();
            }
        }
    }

    public Pokemon obtenerPokemon (int posicion) {
        if (posicion < 0 || posicion >= cantidad) {
            System.out.println("No hay un pokemon en la posición indicada");
            return null;
        } else {
            return pokemonArray[posicion];
        }
    }

    public Pokemon buscarPokemon(String nombre) {
        for (int i = 0; i < cantidad; i++) {
            if (pokemonArray[i].getNombre().equalsIgnoreCase(nombre)) {
                return pokemonArray[i];
            }
        }
        return null;
    }
}
