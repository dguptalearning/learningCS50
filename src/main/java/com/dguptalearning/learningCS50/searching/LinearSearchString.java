package com.dguptalearning.learningCS50.searching;

import java.util.Scanner;

public class LinearSearchString {

    public static void main(String[] args) {
        String[] searchStore = {"Hello", "world", "Ajinkya"};

        System.out.print("Please enter the name you want to search : ");
        String nameSearch = new Scanner(System.in).next();

        for (String search : searchStore) {
            if (search.compareTo(nameSearch) == 0) {
                System.out.println("Name Found");
                return;
            }
        }
        System.out.println("Name not found");
    }
}
