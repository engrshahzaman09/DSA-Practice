public class Day1_Arrays5 {
    public static void main(String[] args) {

        int [] numbers = {4,6,2,8,9,1,3,5,7};

        int max = numbers[0];

        for( int i = 1 ; i < numbers.length ; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Big Number of List : "+ max);
    }
}
