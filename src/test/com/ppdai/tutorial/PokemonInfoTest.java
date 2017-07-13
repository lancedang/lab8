package test.com.ppdai.tutorial;

import com.ppdai.tutorial.Nature;
import com.ppdai.tutorial.PokemonInfo;
import com.ppdai.tutorial.PokemonType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * PokemonInfo Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>ÆßÔÂ 13, 2017</pre>
 */
public class PokemonInfoTest {
    private PokemonInfo info1;
    private PokemonInfo info2;
    private PokemonInfo info3;

    @Before
    public void before() throws Exception {
        info1 = new PokemonInfo(Nature.QUIET, PokemonType.WATER);
        info2 = new PokemonInfo(Nature.RELAXED, PokemonType.GRASS);
        info3 = new PokemonInfo(Nature.BRAVE, PokemonType.FIRE);
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
        Assert.assertEquals(Nature.QUIET, info1.getNature());
        Assert.assertEquals(Nature.RELAXED, info2.getNature());
        Assert.assertEquals(Nature.BRAVE, info3.getNature());
    }

    /**
     * Method: getPokemonType()
     */
    @Test
    public void testGetPokemonType() throws Exception {
//TODO: Test goes here...
        Assert.assertEquals(PokemonType.WATER, info1.getPokemonType());
        Assert.assertEquals(PokemonType.GRASS, info2.getPokemonType());
        Assert.assertEquals(PokemonType.FIRE, info3.getPokemonType());
    }

    /**
     * Method: toString()
     */
    @Test
    public void testToString() throws Exception {
//TODO: Test goes here...
        Assert.assertEquals("a quiet water type", info1.toString());
        Assert.assertEquals("a relaxed grass type", info2.toString());
        Assert.assertEquals("a brave fire type", info3.toString());
    }

} 
