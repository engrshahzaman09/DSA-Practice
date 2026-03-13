public class Day1_Arrays4 {
    public static void main(String[] args) {

        int [] numners = {4,54,67,5,86,13,32,50,99};
        int even = 0;
        int odd = 0;

        for (int i = 0 ; i<numners.length; i++){
            if(numners[i] % 2 ==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("ODD numbers : "+odd);
        System.out.println("Even Numbers : "+even);
    }
}
