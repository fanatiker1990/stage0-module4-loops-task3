package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int number= 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            int counter=0;
            String innerStroka="";
            while(counter<=i){
                innerStroka+=9;
                counter++;
            }
            number+=Integer.parseInt(innerStroka);
        }
        System.out.println(number);

    }

    public static void main(String[] args) {
        NinesSum s=new NinesSum();
        s.calculateSum(9);
    }
}
