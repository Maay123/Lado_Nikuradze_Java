package com.company;

import java.util.Scanner;

public class Exercise_2 {
    public Exercise_2(){
        System.out.println("Exercise_2");
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("X=");
        x=sc.nextInt();
        System.out.print("Y=");
        y=sc.nextInt();

        System.out.println("x/y="+x/y);
        System.out.println("x%y="+x%y);
    }
}
