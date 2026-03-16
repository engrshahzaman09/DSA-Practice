import java.util.Scanner;

public class Day2_Strings4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you'r Word checking for Palindrome : ");
        String original = sc.nextLine();
        String reversed = "";

        for (int i = original.length()-1 ; i >=0 ; i--){
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)){
            System.out.println("This Word is Palindrome !");
        }else {
            System.out.println("This Word is not Palindrome !");
        }
    }
}
