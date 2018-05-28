package Howtoconvertnumbertowordsinjava;

import java.util.Scanner;

public class StringToNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int no = sc.nextInt();
        int arrNum[] = new int[10];
        int i = 0;
        while (no != 0) {
            arrNum[i] = no % 10;
            no = no / 10;
            i++;
        }
        int len = i;
        int arrNum1[] = new int[len];
        int j = 0;
        for (int k = len - 1; k >= 0; k--) {
            arrNum1[j] = arrNum[k];
            j++;
        }
        StringToNum stn = new StringToNum();
        String output = "";
        switch (len) {
            case 1: {
                output += stn.strNum1(arrNum1[len - 1]);
                System.out.println("output=" + output);
                break;
            }
            case 2: {
                int no1 = arrNum1[len - 2] * 10 + arrNum1[len - 1];
                if (no1 >= 11 & no1 <= 19) {
                    output = stn.strNum2(no1);
// output=output+" "+stn.strNum1(arrNum1[len-1]);
                    System.out.println("output=" + output);
                } else {
                    arrNum1[len - 2] = arrNum1[len - 2] * 10;
                    output += stn.strNum2(arrNum1[len - 2]);
                    output = output + " " + stn.strNum1(arrNum1[len - 1]);
                    System.out.println("output=" + output);
                }
                break;
            }
            case 3: {
                output = stn.strNum1(arrNum1[len - 3]) + " hundred ";
                int no1 = arrNum1[len - 2] * 10 + arrNum1[len - 1];
                if (no1 >= 11 & no1 <= 19) {
                    output = stn.strNum2(no1);
                } else {
                    arrNum1[len - 2] = arrNum1[len - 2] * 10;
                    output += stn.strNum2(arrNum1[len - 2]);
                    output = output + " " + stn.strNum1(arrNum1[len - 1]);
                }
                System.out.println("output=" + output);
                break;
            }
            case 4: {
                output = stn.strNum1(arrNum1[len - 4]) + " thousand ";
                if (!stn.strNum1(arrNum1[len - 3]).equals("")) {
                    output += stn.strNum1(arrNum1[len - 3]) + " hundred ";
                }
                int no1 = arrNum1[len - 2] * 10 + arrNum1[len - 1];
                if (no1 >= 11 & no1 <= 19) {
                    output = stn.strNum2(no1);
                } else {
                    arrNum1[len - 2] = arrNum1[len - 2] * 10;
                    output += stn.strNum2(arrNum1[len - 2]);
                    output = output + " " + stn.strNum1(arrNum1[len - 1]);
                }
                System.out.println("output=" + output);
                break;
            }
            case 5: {
                int no1 = arrNum1[len - 5] * 10 + arrNum1[len - 4];
                if (no1 >= 11 & no1 <= 19) {
                    output = stn.strNum2(no1) + " thousand ";
                } else {
                    arrNum1[len - 5] = arrNum1[len - 5] * 10;
                    output += stn.strNum2(arrNum1[len - 5]);
                    output = output + " " + stn.strNum1(arrNum1[len - 4]) + " thousand ";
                }
                if (!stn.strNum1(arrNum1[len - 3]).equals("")) {
                    output += stn.strNum1(arrNum1[len - 3]) + " hundred ";
                }
                no1 = arrNum1[len - 2] * 10 + arrNum1[len - 1];
                if (no1 >= 11 & no1 <= 19) {
                    output = stn.strNum2(no1);
                } else {
                    arrNum1[len - 2] = arrNum1[len - 2] * 10;
                    output += stn.strNum2(arrNum1[len - 2]);
                    output = output + " " + stn.strNum1(arrNum1[len - 1]);
                }
                System.out.println("output=" + output);
                break;
            }
            case 6: {
                output += stn.strNum1(arrNum1[len - 6]) + " million ";
                int no1 = arrNum1[len - 5] * 10 + arrNum1[len - 4];
                if (no1 >= 11 & no1 <= 19) {
                    output += stn.strNum2(no1) + " thousand ";
                } else {
                    arrNum1[len - 5] = arrNum1[len - 5] * 10;
                    output += stn.strNum2(arrNum1[len - 5]);
                    output = output + " " + stn.strNum1(arrNum1[len - 4]) + " thousand ";
                }
                if (!stn.strNum1(arrNum1[len - 3]).equals("")) {
                    output += stn.strNum1(arrNum1[len - 3]) + " hundred ";
                }
                no1 = arrNum1[len - 2] * 10 + arrNum1[len - 1];
                if (no1 >= 11 & no1 <= 19) {
                    output = stn.strNum2(no1);
                } else {
                    arrNum1[len - 2] = arrNum1[len - 2] * 10;
                    output += stn.strNum2(arrNum1[len - 2]);
                    output = output + " " + stn.strNum1(arrNum1[len - 1]);
                }
                System.out.println("output=" + output);
                break;
            }
            case 7: {
                int no1 = arrNum1[len - 7] * 10 + arrNum1[len - 6];
                if (no1 >= 11 & no1 <= 19) {
                    output = stn.strNum2(no1) + " Milloin ";
                } else {
                    arrNum1[len - 7] = arrNum1[len - 7] * 10;
                    output += stn.strNum2(arrNum1[len - 7]);
                    output = output + " " + stn.strNum1(arrNum1[len - 6]) + " Million ";
                }
                no1 = arrNum1[len - 5] * 10 + arrNum1[len - 4];
                if (no1 >= 11 & no1 <= 19) {
                    output = stn.strNum2(no1) + " Thousand ";
                } else {
                    arrNum1[len - 5] = arrNum1[len - 5] * 10;
                    output += stn.strNum2(arrNum1[len - 5]);
                    output = output + " " + stn.strNum1(arrNum1[len - 4]) + " Thousand ";
                }
                if (!stn.strNum1(arrNum1[len - 3]).equals("")) {
                    output += stn.strNum1(arrNum1[len - 3]) + " Hundred ";
                }
                no1 = arrNum1[len - 2] * 10 + arrNum1[len - 1];
                if (no1 >= 11 & no1 <= 19) {
                    output = stn.strNum2(no1);
                } else {
                    arrNum1[len - 2] = arrNum1[len - 2] * 10;
                    output += stn.strNum2(arrNum1[len - 2]);
                    output = output + " " + stn.strNum1(arrNum1[len - 1]);
                }
                System.out.println("output=" + output);
                break;
            }
        }
    }

    String strNum1(int a) {
        String op = "";
        switch (a) {
            case 1: {
                op = "one";
                break;
            }
            case 2: {
                op = "two";
                break;
            }
            case 3: {
                op = "three";
                break;
            }
            case 4: {
                op = "four";
                break;
            }
            case 5: {
                op = "five";
                break;
            }
            case 6: {
                op = "six";
                break;
            }
            case 7: {
                op = "seven";
                break;
            }
            case 8: {
                op = "eight";
                break;
            }
            case 9: {
                op = "nine";
                break;
            }
        }
        return op;
    }

    String strNum2(int a) {
        String op = "";
        switch (a) {
            case 10: {
                op = "ten";
                break;
            }
            case 20: {
                op = "twenty";
                break;
            }
            case 30: {
                op = "thirty";
                break;
            }
            case 40: {
                op = "fourty";
                break;
            }
            case 50: {
                op = "fifty";
                break;
            }
            case 60: {
                op = "sixty";
                break;
            }
            case 70: {
                op = "seventy";
                break;
            }
            case 80: {
                op = "eighty";
                break;
            }
            case 90: {
                op = "ninty";
                break;
            }
            case 11: {
                op = "eleven";
                break;
            }
            case 12: {
                op = "twelve";
                break;
            }
            case 13: {
                op = "thirteen";
                break;
            }
            case 14: {
                op = "fourteen";
                break;
            }
            case 15: {
                op = "fifteen";
                break;
            }
            case 16: {
                op = "sixteen";
                break;
            }
            case 17: {
                op = "seventeen";
                break;
            }
            case 18: {
                op = "eighteen";
                break;
            }
            case 19: {
                op = "nineteen";
                break;
            }
        }
        return op;
    }
}


