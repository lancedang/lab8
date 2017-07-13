package test.com.ppdai.tutorial;

import com.ppdai.tutorial.Nature;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Nature Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>ÆßÔÂ 13, 2017</pre>
 */
public class NatureTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: toString()
     */
    @Test
    public void testToString() throws Exception {
        Assert.assertEquals("brave", Nature.BRAVE.toString());
        Assert.assertEquals("quiet", Nature.QUIET.toString());
        Assert.assertEquals("relaxed", Nature.RELAXED.toString());
    }


} 
