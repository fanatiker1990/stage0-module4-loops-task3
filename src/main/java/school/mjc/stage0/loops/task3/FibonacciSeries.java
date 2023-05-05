package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int innerNum0 = 0;
        int innerNum1 = 1;
        for (int i = 1; i <= lastFibonacci; i++) {
            if (i == 1) {
                System.out.println(0);
            } else {
                int array0fFibonacci = innerNum0 + innerNum1;
                System.out.println(array0fFibonacci);
                innerNum1 = innerNum0;
                innerNum0 = array0fFibonacci;
            }
        }
    }

}
