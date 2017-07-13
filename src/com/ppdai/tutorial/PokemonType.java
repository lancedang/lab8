package com.ppdai.tutorial;

import java.util.HashMap;

/**
 * Lab 8
 *
 * An enumeration containing a subset of the possible
 * types that a Pokemon can have.
 *
 * @author Nicholas
 * @version 2016-10-08
 */
public enum PokemonType
{
    /**
     * The Fire type.
     */
    FIRE,

    /**
     * The Grass type.
     */
    GRASS,

    /**
     * The Water type.
     */
    WATER;

    /**
     * Maps a com.ppdai.tutorial.PokemonType to the com.ppdai.tutorial.PokemonType that it is strong against.
     */
    private static final HashMap<PokemonType, PokemonType> STRENGTH_MAP;

    /**
     * Maps a com.ppdai.tutorial.PokemonType to the com.ppdai.tutorial.PokemonType that it is weak against.
     */
    private static final HashMap<PokemonType, PokemonType> WEAKNESS_MAP;

    /* This is the static initializer, run when the class is first loaded. */
    static
    {
        // TODO: fill in this implementation
        STRENGTH_MAP = new HashMap<>();
        WEAKNESS_MAP = new HashMap<>();

        STRENGTH_MAP.put(PokemonType.FIRE, PokemonType.GRASS);
        STRENGTH_MAP.put(PokemonType.WATER, PokemonType.FIRE);
        STRENGTH_MAP.put(PokemonType.GRASS, PokemonType.WATER);

        WEAKNESS_MAP.put(PokemonType.GRASS, PokemonType.FIRE);
        WEAKNESS_MAP.put(PokemonType.FIRE, PokemonType.WATER);
        WEAKNESS_MAP.put(PokemonType.WATER, PokemonType.GRASS);

    }

    /**
     * Method that gives the type that this type is strong against.
     *
     * @return The com.ppdai.tutorial.PokemonType that this type is strong against.
     */
    public PokemonType effectiveAgainst()
    {
        // Really should check for existence of key, but.
        // TODO: fill in return value
        return STRENGTH_MAP.get(this);
    }

    /**
     * Method that gives the type that this type is weak against.
     *
     * @return The com.ppdai.tutorial.PokemonType that this type is weak against.
     */
    public PokemonType weakAgainst()
    {
        // Really should check for existence of key, but.
        // TODO: fill in return value
        return WEAKNESS_MAP.get(this);
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString()
    {
        // TODO: fill in implementation
        return name().toLowerCase();
    }
}
