package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  private StringBuilder input;

  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      Main main = new Main();
      main.read(scanner);
      main.reverse();
      main.print();
    }
  }

  public void read(Scanner scanner) {
    System.out.print("Enter a string: ");
    input = new StringBuilder(scanner.nextLine());
  }

  public void print() {
    System.out.print("After reversing, the string is: ");
    System.out.println(input);
  }

  private void swap(int left, int right) {
    final char temp = input.charAt(left);
    input.setCharAt(left, input.charAt(right));
    input.setCharAt(right, temp);
  }

  public void reverse() {
    final int size = input.length();

    // do not reverse when the string is empty or has only one character.
    if (size > 1) {
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
}
