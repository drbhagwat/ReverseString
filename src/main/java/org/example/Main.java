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
        main.reverse();
        main.print();
        main.scanner.close();
    }

    public void read() {
        System.out.print("Enter a string: ");
        data = new StringBuilder(scanner.nextLine());
    }

    public void print() {
        System.out.print("After reversing, the string is: ");
        System.out.println(data);
    }

    private void swap(int left, int right) {
        final char temp = data.charAt(left);
        data.setCharAt(left, data.charAt(right));
        data.setCharAt(right, temp);
    }

    public void reverse() {
        final int size = data.length();

        // do not reverse when the string is empty or has only one character.
        if (size <= 1) {
            return;
        }

        // init the left and right pointers
        int left = 0;
        int right = size - 1;

        // ensure the pointers do not cross
        while (left < right) {
            swap(left, right);
            left++;
            right--;
        }
    }
}
