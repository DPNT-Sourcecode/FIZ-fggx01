package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

public class SumSolution {

    public int compute(int x, int y) {

        throw new SolutionNotImplementedException();
    }

    private boolean numberInRange(int number){
        return number >= 0 && number <= 100;
    }

    public static void main(String[] args) {
        SumSolution sumSolution = new SumSolution();
        System.out.println(sumSolution.numberInRange(0));
        System.out.println(sumSolution.numberInRange(-1));
        System.out.println(sumSolution.numberInRange(23));
        System.out.println(sumSolution.numberInRange(100));
        System.out.println(sumSolution.numberInRange(101));

    }

}
