package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        int apples = scanner.nextInt();
        int oranges = scanner.nextInt();

        if (money >= (apples+oranges)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
