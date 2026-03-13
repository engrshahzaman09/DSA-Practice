public class Day1_Arrays8 {
    public static void main(String[] args) {

        int [] numbers = {23,1 ,44,54,43,76,57,6,3};
        int even = 0;
        int odd = 0 ;

        for (int i= 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Odd numbers of list : "+odd);
        System.out.println("Even numbrs of list : "+even);
    }
}
