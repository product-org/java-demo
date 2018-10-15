package com.company;

import java.util.Scanner;

public class PiraTriangle {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows/height: ");
        int h = sc.nextInt();//height of Triangle
        System.out.println();
        for(int i=1;i<=h;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println((""));
        }



    }

}
