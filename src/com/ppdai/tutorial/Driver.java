package com.ppdai.tutorial;

import com.ppdai.tutorial.PokemonType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Lab 8
 *
 * com.ppdai.tutorial.Driver, runs user through
 * the process of selecting their first Pokemon.
 *
 * @author Nicholas, modified by ???
 * @version 2016-10-08
 */
public class Driver
{
    /**
     * Maps short strings to members of the Pokemon enumeration.
     */
    private static HashMap<String, Pokemon> pokemonMap = 
        new HashMap<String, Pokemon>();

    /**
     * Prompts the user to either choose a Pokemon or
     * list all Pokemon.  Prints out information about
     * the chosen Pokemon or all Pokemon in pokemonMap.
     *
     * @param args Command line arguments.
     * @throws IOException Error during I/O operation.
     */
    public static void main(String[] args) throws IOException 
    {
        // Setup program to read user input.
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

        String input; // The user's input.
        String pokemonChoice; // The Pokemon chosen by the user.
        int menuChoice; // The menu option chosen by the user.

        // Populate the Pokémon HashMap
        // TODO: complete implementation
        pokemonMap.put("SQR", Pokemon.SQUIRTLE);
        pokemonMap.put("BLB", Pokemon.BULBASAUR);
        pokemonMap.put("CHR", Pokemon.CHARMANDER);

        //print the menu options
        System.out.println("Professor Oak, the Pokemon professor, presents"
            + " you with three pokeballs - and tells you that you can choose"
            + " one as your first Pokemon!\nPlease select an option:");

        System.out.println("1: Choose a Pokemon");
        System.out.println("2: List all Pokemon");

        while (true) // Loop until the user chooses a valid menu option.
        {
            try
            {
                input = br.readLine();
                menuChoice = Integer.parseInt(input);
                
                if (menuChoice <= 0 || menuChoice > 2)
                {
                    System.out.println("Please choose either 1 or 2.");
                }
                else
                {
                    break;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please enter an integer.");
            } 
        }
        
        switch(menuChoice)
        {
            case 1:
            {
                // List the Pokemon that the user can choose from.
                System.out.println(
                    "Please choose from the following Pokemon: " +
                    pokemonMap.keySet());

                pokemonChoice = br.readLine().toUpperCase();

                /* Loop until the user has entered something that
                 * is in the pokemonMap's set of keys.
                 */
                // TODO: fill in the condition 
                while (!pokemonMap.containsKey(pokemonChoice))
                {
                    System.out.println(
                        "Please choose one of the Pokemon listed.");

                    pokemonChoice = br.readLine().toUpperCase();
                }
                
                // Extract the information about the Pokemon & print out the information
                // TODO: complete implementation
                Pokemon pokemon = pokemonMap.get(pokemonChoice);
                
                System.out.printf("You choose %s.\n", pokemon);

                PokemonType pokemonType = pokemon.getPokemonType();

                System.out.printf("Your %s type Pokemon is weak against %s"
                    + " types and strong against %s types.\n", pokemonType,
                    pokemonType.weakAgainst(), pokemonType.effectiveAgainst());

                break;
            }

            case 2:
            {
                // TODO: Print out all of the Pokemons' three-letter abbreviation 
                // and the description.
                int len = pokemonMap.size();

                Iterator iter = pokemonMap.entrySet().iterator();
                while (iter.hasNext()) {
                    Map.Entry entry  = (Map.Entry) iter.next();
                    String key = (String) entry.getKey();
                    Pokemon value = (Pokemon) entry.getValue();
                    System.out.println(key.toUpperCase() + " - " + value.toString());
                }
                pokemonMap.keySet();
                break;
            }
        }
    }
}
