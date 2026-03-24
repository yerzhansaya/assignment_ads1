package assignment1_recursion;

import java.util.Scanner;

public class Task1 {

    static void print(int n) {
        if (n == 0) return;

        print(n / 10);
        System.out.println(n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}