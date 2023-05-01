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
}
