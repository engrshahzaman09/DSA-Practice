public class Day1_Arrays2 {
    public static void main(String[] args) {

        int [] numbers = {43,56,76,35,54,78,99};

        int min = numbers[0];

        for ( int i = 1; i < numbers.length; i++){
            if ( numbers[i] < min ){

                min = numbers[i];
            }
        }
        System.out.println("Sabse Chota Number : "+ min);
    }
}
