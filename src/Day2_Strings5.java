import java.util.Scanner;

public class Day2_Strings5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Word checking for Vowels : ");
        String name = sc.nextLine();
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch == 'e' || ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){

                count++;
            }
        }
        System.out.println("Vowels : "+ count);
    }
}
