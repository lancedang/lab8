package test.com.ppdai.tutorial;

import com.ppdai.tutorial.Pokemon;
import com.ppdai.tutorial.PokemonType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * PokemonType Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>ÆßÔÂ 13, 2017</pre>
 */
public class PokemonTypeTest {
    private PokemonType fire;
    PokemonType water;
    PokemonType grass;

    @Before
    public void before() throws Exception {
        fire = PokemonType.FIRE;
        water = PokemonType.WATER;
        grass = PokemonType.GRASS;
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: effectiveAgainst()
     */
    @Test
    public void testEffectiveAgainst() throws Exception {
//TODO: Test goes here...

        Assert.assertEquals(fire.effectiveAgainst(), PokemonType.GRASS);
        Assert.assertEquals(water.effectiveAgainst(), PokemonType.FIRE);
        Assert.assertEquals(grass.effectiveAgainst(), PokemonType.WATER);

    }

    /**
     * Method: weakAgainst()
     */
    @Test
    public void testWeakAgainst() throws Exception {
//TODO: Test goes here...
        Assert.assertEquals(fire.weakAgainst(), PokemonType.WATER);
        Assert.assertEquals(water.weakAgainst(), PokemonType.GRASS);
        Assert.assertEquals(grass.weakAgainst(), PokemonType.FIRE);
    }

    /**
     * Method: toString()
     */
    @Test
    public void testToString() throws Exception {
//TODO: Test goes here...
        Assert.assertEquals(grass.toString(), "grass");
        Assert.assertEquals(fire.toString(), "fire");
        Assert.assertEquals(water.toString(), "water");
    }


} 
