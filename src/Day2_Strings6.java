import java.util.Scanner;

public class Day2_Strings6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence or Word For Counting : ");

        String counting = sc.nextLine();
        int count = 1;

        for (int i = 0; i < counting.length() ; i++){
            if (counting.charAt(i) == ' '){

                count++;

            }
        }
        System.out.println("Words : " + count);
    }
}
