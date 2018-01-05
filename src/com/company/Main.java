package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Person person=new Person();
        person.nameList();

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        for (int i=0;i<num;i++)
        {
            print();
        }

    }
    static void print()
    {
        System.out.println("Hello");
    }
}
