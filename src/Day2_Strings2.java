import java.util.Scanner;

public class Day2_Strings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter You'r name Please :");
        String name = sc.nextLine();

        for (int i = name.length()-1 ; i >= 0 ; i--){
            System.out.print(name.charAt(i));
        }
    }


}
