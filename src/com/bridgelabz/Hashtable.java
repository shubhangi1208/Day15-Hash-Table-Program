package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashtable {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String s = sc.nextLine();

        //Split String into String Object Array
        String a[] = s.split(" ");

        //Insert each separated string word in Linked List from Last
        for (String x : a) {
            linkedList.insertLast(x);
        }

        linkedList.showLinkedList();
        //Show Frequent Words Count
        linkedList.showFrequent();
    }
}