package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private StringBuilder data;
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.read();
        main.reverseString();
        main.print();
        main.scanner.close();
    }

    public void read() {
        System.out.println("Enter a string :");
        data = new StringBuilder(scanner.nextLine());
    }

    public void print() {
        if (data == null) {
            System.out.println("The string is null.");
            return;
        }
        System.out.println("After reversing, the string is: ");
        System.out.println(data);
    }

    public void reverseString() {
        if (data == null)  {
            return;
        }
        int size = data.length();

        if (size <= 1) {
            return;
        }

        int left = 0;
        int right = size - 1;

        while (left < right) {
            char temp = data.charAt(left);
            data.setCharAt(left, data.charAt(right));
            data.setCharAt(right, temp);
            left++;
            right--;
        }
    }
}
