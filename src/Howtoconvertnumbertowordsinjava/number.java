package Howtoconvertnumbertowordsinjava;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        int a;
        int u, t, h, th;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Four digit number");
        a = sc.nextInt();
        int n = a;
        int noOfDigit = 1;
        while ((n = n / 10) != 0) ++noOfDigit;
        if (noOfDigit <= 4) {
            u = a % 10;
            a = (a - u) / 10;
            t = a % 10;
            a = (a - t) / 10;
            h = a % 10;
            a = (a - h) / 10;
            th = a % 10;
            System.out.println();
            switch (th) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("One thousand ");
                    break;
                case 2:
                    System.out.print("Two thousand ");
                    break;
                case 3:
                    System.out.print("Three thousand ");
                    break;
                case 4:
                    System.out.print("Four thousand ");
                    break;
                case 5:
                    System.out.print("five thousand ");
                    break;
                case 6:
                    System.out.print("Six thousand ");
                    break;
                case 7:
                    System.out.print("Seven thousand ");
                    break;
                case 8:
                    System.out.print("Eight thousand ");
                    break;
                case 9:
                    System.out.print("Nine thousand ");
                    break;
            }
            switch (h) {
                case 0:
                    System.out.print("");
                    if (h == 0 && th != 0) {
                        System.out.print("and ");
                    }
                    break;
                case 1:
                    System.out.print("One hundred ");
                    System.out.print("and ");
                    break;
                case 2:
                    System.out.print("Two hundred ");
                    System.out.print("and ");
                    break;
                case 3:
                    System.out.print("Three hundred ");
                    System.out.print("and ");
                    break;
                case 4:
                    System.out.print("Four hundred ");
                    System.out.print("and ");
                    break;
                case 5:
                    System.out.print("five hundred ");
                    System.out.print("and ");
                    break;
                case 6:
                    System.out.print("Six hundred ");
                    System.out.print("and ");
                    break;
                case 7:
                    System.out.print("Seven hundred ");
                    System.out.print("and ");
                    break;
                case 8:
                    System.out.print("Eight hundred ");
                    System.out.print("and ");
                    break;
                case 9:
                    System.out.print("Nine hundred ");
                    System.out.print("and ");
                    break;
            }

            switch (t) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("");
                    switch (u) {
                        case 0:
                            System.out.print("ten");
                            break;
                        case 1:
                            System.out.print("eleven");
                            break;
                        case 2:
                            System.out.print("twelve");
                            break;
                        case 3:
                            System.out.print("Thirteen");
                            break;
                        case 4:
                            System.out.print("Fourteen");
                            break;
                        case 5:
                            System.out.print("fifteen");
                            break;
                        case 6:
                            System.out.print("Sixteen");
                            break;
                        case 7:
                            System.out.print("Seventeen");
                            break;
                        case 8:
                            System.out.print("Eightteen");
                            break;
                        case 9:
                            System.out.print("nineteen");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("therty ");
                    break;
                case 4:
                    System.out.print("fourty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("Seveth ");
                    break;
                case 8:
                    System.out.print("Eighty ");
                    break;
                case 9:
                    System.out.print("Ninty ");
                    break;
            }
            {
                if (t != 1) {
                    switch (u) {

                        case 0:
                            System.out.print("");
                            break;
                        case 1:
                            System.out.print("One.");
                            break;
                        case 2:
                            System.out.print("Two.");
                            break;
                        case 3:
                            System.out.print("Three.");
                            break;
                        case 4:
                            System.out.print("Four.");
                            break;
                        case 5:
                            System.out.print("five.");
                            break;
                        case 6:
                            System.out.print("Six.");
                            break;
                        case 7:
                            System.out.print("Seven.");
                            break;
                        case 8:
                            System.out.print("Eight.");
                            break;
                        case 9:
                            System.out.print("nine.");
                            break;
                    }

                } else
                    System.out.println(".");
                System.out.println("");
            }
        } else
            System.out.println("accepts only less then 4 digits");
    }
}
