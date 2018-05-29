package Howtoconvertnumbertowordsinjava;

public class NumberInWords5Digits {
    static int testcase1 = 93284;

    public static void main(String args[]) {
        NumberInWords5Digits testInstance = new NumberInWords5Digits();
        String result = testInstance.inWords(testcase1);
        System.out.println("Result : " + result);
    }

    //write your code here
    public String inWords(int num) {
        int digit = 0;
        String word = "";
        int temp = num;
        while (temp > 0) {
            if (temp % 10 >= 0)
                digit++;
            temp = temp / 10;
        }
        if (num == 0)
            return "zero";
        System.out.println(num);
        if (digit == 1)
            word = inTens(num, digit);
        else if (digit == 2)
            word = inTens(num, digit);
        else if (digit == 3)
            word = inHundreds(num, digit);
        else if (digit == 4)
            word = inThousands(num, digit);
        else if (digit == 5)
            word = inThousands(num, digit);
        return word;
    }

    public String inTens(int num, int digit) {
        int tens = 0;
        int units = 0;
        if (digit == 2) {
            tens = num / 10;
            units = num % 10;
        }
        String unit = "";
        String ten = "";
        String word = "";
        if (num == 10) {
            word = "ten";
            return word;
        }
        if (num == 11) {
            word = "eleven";
            return word;
        }
        if (num == 12) {
            word = "twelve";
            return word;
        }
        if (num == 13) {
            word = "thirteen";
            return word;
        }
        if (num == 14) {
            word = "fourteen";
            return word;
        }
        if (num == 15) {
            word = "fifteen";
            return word;
        }
        if (num == 16) {
            word = "sixteen";
            return word;
        }
        if (num == 17) {
            word = "seventeen";
            return word;
        }
        if (num == 18) {
            word = "eighteen";
            return word;
        }
        if (num == 19) {
            word = "nineteen";
            return word;
        }
        if (units == 1 || num == 1)
            unit = "one";
        else if (units == 2 || num == 2)
            unit = "two";
        else if (units == 3 || num == 3)
            unit = "three";
        else if (units == 4 || num == 4)
            unit = "four";
        else if (units == 5 || num == 5)
            unit = "five";
        else if (units == 6 || num == 6)
            unit = "six";
        else if (units == 7 || num == 7)
            unit = "seven";
        else if (units == 8 || num == 8)
            unit = "eight";
        else if (units == 9 || num == 9)
            unit = "nine";
        if (tens == 2)
            ten = "twenty";
        else if (tens == 3)
            ten = "thirty";
        else if (tens == 4)
            ten = "forty";
        else if (tens == 5)
            ten = "fifty";
        else if (tens == 6)
            ten = "sixty";
        else if (tens == 7)
            ten = "seventy";
        else if (tens == 8)
            ten = "eighty";
        else if (tens == 9)
            ten = "ninety";

        if (digit == 1)
            word = unit;
        else if (digit == 2)
            word = ten + " " + unit;
        return word;
    }

    //inHundreds(525, 3)
    public String inHundreds(int num, int digit) {
        int hundreds = num / 100; // =5
        int tensAndUnits = num % 100; // =25
        String hundred = "";
        String tenAndUnit = "";
        String word = "";
        tenAndUnit = inTens(tensAndUnits, 2);

        if (hundreds == 1)
            hundred = "one hundred";
        else if (hundreds == 2)
            hundred = "two hundred";
        else if (hundreds == 3)
            hundred = "three hundred";
        else if (hundreds == 4)
            hundred = "four hundred";
        else if (hundreds == 5)
            hundred = "five hundred";
        else if (hundreds == 6)
            hundred = "six hundred";
        else if (hundreds == 7)
            hundred = "seven hundred";
        else if (hundreds == 8)
            hundred = "eight hundred";
        else if (hundreds == 9)
            hundred = "nine hundred";
        word = hundred + " " + tenAndUnit;
        return word;
    }

    public String inThousands(int num, int digit) {
        int thousands = 0;
        int hundredsAndOthers = num % 1000;
        String thousand = "";
        String hundredAndOther = "";
        String word = "";
        if (digit == 5) {
            thousands = num / 1000;
            thousand = inTens(thousands, 2);
        } else if (digit == 4) {
            thousands = num / 1000;
            thousand = inTens(thousands, 1);
        }
        if (hundredsAndOthers / 100 == 0) // in case of "023"
            hundredAndOther = inTens(hundredsAndOthers, 2);
        else
            hundredAndOther = inHundreds(hundredsAndOthers, 3);
        word = thousand + " thousand " + hundredAndOther;
        return word;
    }

}
