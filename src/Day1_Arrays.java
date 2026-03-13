public class Day1_Arrays {
    public static void main(String[] args) {

        int [] numbers = {2 ,3 ,5 ,6 ,65 ,87 ,99 };

        int max = numbers[0];

        for ( int i = 1 ; i < numbers.length ; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Sabse bada Number : "+ max);
    }
}
