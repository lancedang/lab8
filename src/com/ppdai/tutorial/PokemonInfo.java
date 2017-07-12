package com.ppdai.tutorial;

/**
 * Created by qiankai02 on 2017/7/12.
 */
public class PokemonInfo {
    private Nature nature; //性格
    private PokemonType pokemonType;

    public PokemonInfo(Nature nature, PokemonType pokemonType) {
        this.nature = nature;
        this.pokemonType = pokemonType;
    }

    public Nature getNature() {
        return nature;
    }

    public PokemonType getPokemonType() {
        return pokemonType;
    }

    @Override
    public String toString() {
        return "a <" + this.nature.toString();
    }
}
