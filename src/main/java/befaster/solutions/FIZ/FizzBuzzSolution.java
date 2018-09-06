package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        StringBuilder result = new StringBuilder();
        String fizz = "fizz";
        String buzz = "buzz";
        String num = "1";

        if (number % 3 == 0)
            result.append(fizz);
        if (number % 5 == 0) {
            if (result.toString().contains(fizz))
                result.append(" ");
            result.append(buzz);
        }
        if (number % 3 != 0 && number % 5 != 0)
            result.append(num);
        return result.toString();
//        throw new SolutionNotImplementedException();
    }

}
