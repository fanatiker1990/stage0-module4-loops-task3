package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        while (first != second) {
            if (first > second) {
                if (second == 0) {
                    break;
                }
                first = first - second;
            } else {
                if (first == 0) {
                    first = second;
                    break;
                }
                second = second - first;
            }
        }
        System.out.println(first);
    }
}
