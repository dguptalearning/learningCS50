package com.dguptalearning.learningCS50.searching;

import java.util.Scanner;

public class LinearSearchInteger {

    public static void main(String[] args) {
        Integer[] integer = {23, 45, 67, 78, 34};

        System.out.print("Please enter the number you want to search : ");
        int numberToSearch = new Scanner(System.in).nextInt();

        for (int i = 0; i < integer.length; i++) {
            if (integer[i] == numberToSearch) {
                System.out.println("Number Found");
                return;
            }
        }
        System.out.println("Number not found");
    }
}
