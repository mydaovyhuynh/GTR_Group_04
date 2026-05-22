import java.util.Arrays;
public class Algorithm_Phaleng extends Algorithm_V1{
    @override
    int sum(int[] input){
        int sum = 0;
        for(int i = 0; i < input.length; i++){
            sum += input[i];
        }
        return sum; 
    }

    @override
    double average(int[] input){

    }

    public static void main(String[] args) {
        // 
        Algorithm_V1 al = new Algorithm_Phaleng();

        System.out.println(Array.toString(al.sample));

        Systen.out.println(al.sum(al.sample));
    }
}


