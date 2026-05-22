public class Team {
    // atribute ms.davy
    private int[] sample = {1, 2, 3, 4, 5};

    // constructor mr.phanang
    public Team() {
        // default initialization already done
    }

    public static void main(String[] args) {
        Team team = new Team();

        int total = team.sum(team.sample);
        int maximum = team.max(team.sample);

        System.out.println("Computed values from sample array:");
        System.out.println("Sum = " + total);
        System.out.println("Max = " + maximum);
    }

    // method sum ms.phaleng
    public int sum(int[] input){
        int sum = 0;
        for(int i = 0; i < input.length; i++){
            sum += input[i];
        }
        System.out.println("The sum is: " + sum);
        return sum;

    }
    // method max mr.yun
    public int max(int[] input){
        int max = input[0];
        for(int i = 1; i < input.length; i++){
            if(input[i] > max){
                max = input[i];
            }
        }
        System.out.println("Max: " + max);
        return max;
    }
}
      