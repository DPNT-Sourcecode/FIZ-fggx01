package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        StringBuilder result = new StringBuilder();
        String fizz = "fizz";
        String buzz = "buzz";
        String deluxe = "deluxe";
        String fake = "fake";

        if (number % 3 == 0 && String.valueOf(number).contains("3"))
            result.append(fizz);
        if (number % 5 == 0 && String.valueOf(number).contains("5")) {
            if (result.toString().contains(fizz))
                result.append(" ");
            result.append(buzz);
        }
        
        if (number % 3 != 0 && !String.valueOf(number).contains("3") && number % 5 != 0 &&
                !String.valueOf(number).contains("5"))
            result.append(number);
        return result.toString();
    }

    private boolean isEven(Integer number){
        String stringNumber = String.valueOf(number);
        int digit = Integer.valueOf(stringNumber.charAt(stringNumber.length()-1));
        return  digit % 2 == 0;
    }



}
