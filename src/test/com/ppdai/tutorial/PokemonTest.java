package test.com.ppdai.tutorial;

import com.ppdai.tutorial.Nature;
import com.ppdai.tutorial.Pokemon;
import com.ppdai.tutorial.PokemonType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Pokemon Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>ÆßÔÂ 13, 2017</pre>
 */
public class PokemonTest {
    private Pokemon bulbasaur;
    private Pokemon charmander;
    private Pokemon squirtle;

    @Before
    public void before() throws Exception {
        bulbasaur = Pokemon.BULBASAUR;
        charmander = Pokemon.CHARMANDER;
        squirtle = Pokemon.SQUIRTLE;
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getNature()
     */
    @Test
    public void testGetNature() throws Exception {
//TODO: Test goes here...
        Assert.assertEquals(Nature.RELAXED, bulbasaur.getNature());
        Assert.assertEquals(Nature.BRAVE, charmander.getNature());
        Assert.assertEquals(Nature.QUIET, squirtle.getNature());
    }

    /**
     * Method: getPokemonType()
     */
    @Test
    public void testGetPokemonType() throws Exception {
//TODO: Test goes here...
        Assert.assertEquals(PokemonType.GRASS, bulbasaur.getPokemonType());
        Assert.assertEquals(PokemonType.FIRE, charmander.getPokemonType());
        Assert.assertEquals(PokemonType.WATER, squirtle.getPokemonType());
    }

    /**
     * Method: toString()
     */
    @Test
    public void testToString() throws Exception {
//TODO: Test goes here...
        Assert.assertEquals("Bulbasaur: a relaxed grass type", bulbasaur.toString());
        Assert.assertEquals("Charmander: a brave fire type", charmander.toString());
        Assert.assertEquals("Squirtle: a quiet water type", squirtle.toString());
    }


} 
