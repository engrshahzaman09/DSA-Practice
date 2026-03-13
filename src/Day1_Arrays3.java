public class Day1_Arrays3 {
    public static void main(String[] args) {

        int [] numbers = { 43,56,43,23,12,76,89};
        int sum = 0;

        for ( int i = 0 ; i < numbers.length ; i++){
            sum = sum+ numbers[i];
        }
        System.out.println("Sum total Numbers : "+sum);
    }
}
