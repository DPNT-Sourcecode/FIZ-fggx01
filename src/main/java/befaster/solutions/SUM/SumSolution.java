package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

public class SumSolution {

    public int compute(int x, int y) {
        if (numberInRange(x) && numberInRange(y))
            return x + y;
        throw new SolutionNotImplementedException();
    }

    private boolean numberInRange(int number){
        return number >= 0 && number <= 100;
    }

}
