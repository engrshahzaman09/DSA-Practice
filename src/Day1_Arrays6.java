public class Day1_Arrays6 {
    public static void main(String[] args) {

        int [] numbers = {4,54,67,2,87,13,40};
        int min = numbers[0];

        for (int i = 0 ; i < numbers.length ; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println(" Small number from list : " + min);

    }
}
