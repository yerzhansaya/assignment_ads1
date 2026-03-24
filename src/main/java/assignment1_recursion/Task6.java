package assignment1_recursion;

import java.util.Scanner;

public class Task6 {

    static long power(long a, long n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long n = sc.nextLong();

        System.out.println(power(a, n));
    }
}