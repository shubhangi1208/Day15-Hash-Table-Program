package com.bridgelabz;

import java.util.Scanner;

public class HashtableMain {

    public static void main(String[] args) {
        //HashTableExp Object for Generic Type
        HashTableExp<String> hashTableExp = new HashTableExp<>();

        Scanner sc = new Scanner(System.in);

        String str = "to be or not to be ";

        String strArr[] = str.split(" ");

        //Integer strArr[] ={1,6,9,3,7,1,9,6,3,9};

        System.out.println("Given String =" + str);
        //Passing Array Element in HashTable Index
        for (String mystr : strArr) {
            //Get index of each object
            int index = hashTableExp.myHashFunction(mystr);
            //Store Element in Hash Table at given index
            hashTableExp.storeKey(index, mystr);
        }

        //Methode to Show Hash Table Data
        hashTableExp.showHashList();

        //Code to Remove the Given Word from HashTable Linked List
        System.out.println("\nEnter the Word to Remove from Hash Table :");
        String word = sc.next();
        int index = hashTableExp.myHashFunction(word);
        hashTableExp.removeKey(index, word);

        hashTableExp.showHashList();
    }
}
