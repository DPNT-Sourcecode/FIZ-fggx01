package befaster.solutions.HLO;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

public class HelloSolutionTest {
    HelloSolution helloSolution;
    @Before
    public void init(){
        helloSolution = new HelloSolution();
    }

    @Test
    public void helloTest(){
        assertEquals(helloSolution.hello("George"), "Hello, World!");
    }
}
