package assignment1_recursion;
import java.util.Scanner;

public class Task8 {

    static boolean check(String s, int i) {

        if (i == s.length()) return true;

        if (!Character.isDigit(s.charAt(i)))
            return false;

        return check(s, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (check(s, 0))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
