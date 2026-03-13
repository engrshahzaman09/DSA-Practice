public class Day1_Arrays7 {

    public static void main(String[] args) {

        int [] numbers = {54,56,2,76,98,13};
        int sum = 0;
        for (int i = 0; i < numbers.length ; i++){
            sum = sum+ numbers[i];
        }
        System.out.println("Sum of Total numbers of list : "+ sum);
    }
}
