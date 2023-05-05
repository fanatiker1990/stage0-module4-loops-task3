package school.mjc.stage0.loops.task3;



public class DigitsSum {
    public void printDigitsSum(int t) {
        String numToString = String.valueOf(t);
        int result = 0;
        for (int i = 0; i < numToString.length(); i++) {
            if (!String.valueOf(numToString.charAt(i)).equals("-")) {
                result += Integer.parseInt(String.valueOf(numToString.charAt(i)));
            }
        }
        System.out.println(result);
    }
}
