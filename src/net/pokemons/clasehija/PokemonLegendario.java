package net.pokemons.clasehija;

import net.pokemons.clasepadre.Pokemon;

public class PokemonLegendario extends Pokemon {
    private String localizacion;


    public PokemonLegendario(String nombre, String tipo, double altura, double peso, String descripcion) {
        super(nombre, tipo, altura, peso, descripcion);
        this.localizacion = localizacion;
    }

    public PokemonLegendario(String nombre, String tipo, String localizacion) {
        super(nombre, tipo);
        this.localizacion = localizacion;
    }

    public PokemonLegendario(String nombre, String tipo) {
        super(nombre, tipo);
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        String msg = super.toString() + "\nLocalización: ";
        if (localizacion != null) {
            msg += localizacion;
        } else {
            msg += "??";
        }
        return msg;
    }
}
