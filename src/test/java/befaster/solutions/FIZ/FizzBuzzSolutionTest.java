package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzSolutionTest {
    FizzBuzzSolution fizzBuzzSolution;

    @Before
    public void init(){
        fizzBuzzSolution = new FizzBuzzSolution();
    }

    @Test
    public void fizzBuzzTest(){
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(131));
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(12));

        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(454));
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(25));

        assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(513));
    }
}
