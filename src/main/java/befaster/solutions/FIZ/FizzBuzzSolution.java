package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        StringBuilder result = new StringBuilder();
        String fizz = "fizz";
        String buzz = "buzz";
        String deluxe = "deluxe";

        if (number % 3 == 0 || String.valueOf(number).contains("3"))
            result.append(fizz);
        if (number % 5 == 0 || String.valueOf(number).contains("5")) {
            if (result.toString().contains(fizz))
                result.append(" ");
            result.append(buzz);
        }

        if (checkForDeluxe(number)) {
            if (result.length() > 0)
                result.append(" ");
//            if ()
            result.append(deluxe);
        }
        if (number % 3 != 0 && !String.valueOf(number).contains("3") && number % 5 != 0 &&
                !String.valueOf(number).contains("5") && !checkForDeluxe(number))
            result.append(number);
        return result.toString();
    }

    private boolean checkForOdd(Integer number){
        String stringNumber = String.valueOf(number);
        int digit = Integer.valueOf(stringNumber.charAt(stringNumber.length()-1));
        return  digit % 2 == 0;
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
        System.out.println(solution.checkForOdd(1));
        System.out.println(solution.checkForOdd(2));
        System.out.println(solution.checkForOdd(44));
        System.out.println(solution.checkForOdd(55));
    }

}
