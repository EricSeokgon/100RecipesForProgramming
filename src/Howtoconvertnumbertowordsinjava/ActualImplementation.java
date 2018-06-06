package Howtoconvertnumbertowordsinjava;

import java.util.ResourceBundle;

public class ActualImplementation {
    public static ResourceBundle readPropertyFile = ResourceBundle
            .getBundle("NumberEnglishRepresentation");

    public static void main(String[] args) {
        System.out.println(ActualImplementation.main(-2));
    }

    public static String main(Integer number) {
        int power;
// Calculate Number of digits
        Integer numberOfDigits = number > 0 ? (int) Math.log10((double)
                number) + 1
                : 1;
        String output = "";
// If number is negative convert it to positive an append minus to
// output
        if (Integer.signum(number) == -1) {
            output = "minus ";
            number = number < 0 ? number * -1 : number;
        }
        String stringVal = String.valueOf(number);
        if (number <= 20 || number == 30 || number == 40 || number == 50
                || number == 60 || number == 70 || number == 80 || number ==
                90
                || number == 100 || number == 1000)
            output += readPropertyFile.getString(stringVal);
        else {
            int i;
            for (i = 0; i < numberOfDigits; i++) {
                if (number != 0) {
                    numberOfDigits = number > 0 ? (int) Math
                            .log10((double) number) + 1 : 1;
                    power = (int) Math.pow(10, numberOfDigits - 1);
// If number is like 10,001 then print ten first and then
// remaining value
                    if (numberOfDigits >= 5 && numberOfDigits % 2 == 1) {
                        power = (int) Math.pow(10, numberOfDigits - 2);
                    }
                    if (readPropertyFile.containsKey(String.valueOf(number)))
                        output += readPropertyFile.getString(String
                                .valueOf(number));
                    else {
// As the digits at units and tens place are read
// differently
                        if (numberOfDigits > 2) {
                            output += readPropertyFile.getString(String
                                    .valueOf(number / power))
                                    + readPropertyFile.getString(String
                                    .valueOf(power));
                        } else {
                            output += readPropertyFile.getString(String
                                    .valueOf(number - number % power));
                        }
                    }
                    number = (int) (number % power);
                }
            }
        }
        return output;
    }

}
