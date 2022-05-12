package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int t = sc.nextInt();
        int r= t*t;
        int b = 300;
int payment =hour*b+1000;
System.out.println(payment);
System.out.println("зарплата за год ");
System.out.println(payment *12);
    }
}
