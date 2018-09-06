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
        assertEquals("fizz fake deluxe", fizzBuzzSolution.fizzBuzz(333));
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(12));

        assertEquals("buzz", fizzBuzzSolution.fizzBuzz(454));
        assertEquals("buzz fake deluxe", fizzBuzzSolution.fizzBuzz(25));
        assertEquals("buzz fake deluxe", fizzBuzzSolution.fizzBuzz(55));

        assertEquals("fizz buzz fake deluxe", fizzBuzzSolution.fizzBuzz(513));
        assertEquals("fizz buzz fake deluxe", fizzBuzzSolution.fizzBuzz(555));

        assertEquals("fake deluxe", fizzBuzzSolution.fizzBuzz(11));
    }
}
