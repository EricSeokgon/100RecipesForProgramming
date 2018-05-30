package Howtoconvertnumbertowordsinjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rupee {
    public static void main(String[] args) throws IOException {
        int len = 0, revnum = 0, i, dup = 0, j = 0, k = 0;
        int gvalue;
        String[] ones =
                {"one", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Eleven", "Twelve"};
        String[] twos =
                {"Ten", "Twenty", "Thirty", "Fourty", "fifty", "Sixty", "Seventy", "eighty", "Ninety", ""};
        System.out.println("\n Enter value");
        InputStreamReader b = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(b);
        gvalue = Integer.parseInt(br.readLine());
        if (gvalue == 10)
            System.out.println("Ten");
        else if (gvalue == 100)
            System.out.println("Hundred");
        else if (gvalue == 1000)
            System.out.println("Thousand");
        dup = gvalue;
        for (i = 0; dup > 0; i++) {
            revnum = revnum * 10 + dup % 10;
            len++;
            dup = dup / 10;
        }
        while (j < len) {
            if (gvalue < 10) {
                System.out.println(ones[gvalue - 1]);
            } else if (gvalue > 10 && gvalue <= 19) {
                System.out.println(ones[gvalue - 2]);
                break;
            } else if (gvalue > 19 && gvalue < 100) {
                k = gvalue / 10;
                gvalue = gvalue % 10;
            }
            System.out.println(twos[k - 1]);
        }
        if (gvalue > 100 && gvalue < 1000) {
            k = gvalue / 100;
            gvalue = gvalue % 100;
            System.out.println(ones[k - 1] + "Hundred");
        } else if (gvalue >= 1000 && gvalue < 9999) {
            k = gvalue / 1000;
            gvalue = gvalue % 1000;
            System.out.println(ones[k - 1] + "Thousand");
        } else if (gvalue >= 11000 && gvalue <= 19000) {
            k = gvalue / 1000;
            gvalue = gvalue % 1000;
            System.out.println(twos[k - 2] + "Thousand");
        } else if (gvalue >= 12000 && gvalue < 100000) {
            k
                    = gvalue / 10000;
            gvalue = gvalue % 10000;
            System.out.println(ones[gvalue - 1]);
        } else {
            System.out.println("");
        }
        j++;
    }
}
