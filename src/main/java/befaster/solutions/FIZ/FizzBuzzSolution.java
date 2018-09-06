package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        StringBuilder result = new StringBuilder();
        String fizz = "fizz";
        String buzz = "buzz";

        if (number % 3 == 0 || String.valueOf(number).contains("3"))
            result.append(fizz);
        if (number % 5 == 0 || String.valueOf(number).contains("5")) {
            if (result.toString().contains(fizz))
                result.append(" ");
            result.append(buzz);
        }
        if (number % 3 != 0 && !String.valueOf(number).contains("3") && number % 5 != 0 &&
                !String.valueOf(number).contains("5") )
            result.append(number);
        return result.toString();
    }

    private boolean checkForDeluxe(Integer number){
        String stringNumber = String.valueOf(number);
        boolean result = false;
        if (number > 10)
        for (int i = 0; i < stringNumber.length(); i++){
            char check = stringNumber.charAt(0);
            if (check == stringNumber.charAt(i)){
                result = true;
            }else {
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        System.out.println(solution.checkForDeluxe(11));
        System.out.println(solution.checkForDeluxe(131));
        System.out.println(solution.checkForDeluxe(55555));
        System.out.println(solution.checkForDeluxe(9));
    }

}
