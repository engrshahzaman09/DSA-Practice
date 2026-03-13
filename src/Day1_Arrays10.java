public class Day1_Arrays10 {
    public static void main(String[] args) {

        int [] numbers = {43,56,2,86,45};
        int first = 0;
        int second = 0 ;

        for ( int i = 0 ; i < numbers.length ; i++){
            if ( numbers[i]> first){
                second = first;
                first = numbers[i];
            } else if (numbers[i] > second) {
                second = numbers[i];
                
            }
        }
        System.out.println("Largest Number of list : "+second);
    }
}
