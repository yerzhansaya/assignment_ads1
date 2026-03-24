package assignment1_recursion;

import java.util.Scanner;

public class Task2 {

    static int sum(int[] a, int n) {
        if (n == 0) return 0;
        return a[n - 1] + sum(a, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        double avg = (double) sum(a, n) / n;

        System.out.println(avg);
    }
}


