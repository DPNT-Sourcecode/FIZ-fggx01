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
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(3));
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(12));

        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(5));
        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(25));

        assertEquals("11", fizzBuzzSolution.fizzBuzz(11));
        assertEquals("31", fizzBuzzSolution.fizzBuzz(31));

        assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(30));
    }
}
