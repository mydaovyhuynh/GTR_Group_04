import java.util.Arrays;

public class Algorithm_Phannag extends Algorithm_V1 {

    @Override
    int sum(int[] input) {
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }

        return sum;
    }

    @Override
    double average(int[] input) {
        return (double) sum(input) / input.length;
    }

    public static void main(String[] args) {

        Algorithm_V1 al = new Algorithm_Phaleng();

        System.out.println(Arrays.toString(al.sample));

        System.out.println(al.sum(al.sample));

        System.out.println(al.average(al.sample));
    }
}
