package com.ppdai.tutorial;

import com.ppdai.tutorial.PokemonInfo;

/**
 * Created by qiankai02 on 2017/7/12.
 */
public enum Pokemon {

    BULBASAUR(new PokemonInfo(Nature.RELAXED, PokemonType.GRASS)),
    CHARMANDER(new PokemonInfo(Nature.BRAVE, PokemonType.FIRE)),
    SQUIRTLE(new PokemonInfo(Nature.QUIET, PokemonType.WATER));

    private PokemonInfo info;

    Pokemon(PokemonInfo info) {
        this.info = info;
    }

    public Nature getNature() {
        return info.getNature();
    }

    public PokemonType getPokemonType() {
        return info.getPokemonType();
    }

    @Override
    public String toString() {
        String name = name().toLowerCase();
        //first letter to uppercase
        char[] cs = name.toCharArray();

        cs[0] -= 32;
        name = String.valueOf(cs);
        return name + ": a " + getNature() + " " + getPokemonType() + " type";
    }
}
