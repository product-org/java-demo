package com.company;

import java.util.Scanner;

public class FaboniccaiSeries {
    public static void main(String args[])
    {
        //Scanner is used to print on console
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n1=0, n2=1,n3,i,count;
        count = sc.nextInt();

        System.out.print(n1+ " " +n2);

        for(i=2;i<=count;i++)
        {
            n3=n1+n2;
            System.out.print(" " +n3);
            n1=n2;
            n2=n3;
        }
    }
}
