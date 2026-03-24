package assignment1_recursion;


import java.util.Scanner;

public class Task3 {

    static boolean prime(int n, int i) {
        if (i == n) return true;
        if (n % i == 0) return false;

        return prime(n, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (prime(n, 2))
            System.out.println("Prime");
        else
            System.out.println("Composite");
    }
}