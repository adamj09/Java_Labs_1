package lab_06_02;

public class Lab_06_02 {
    public static void main(String[] args) {
        //System.out.println("Sum of Digits: " + sumDigits(234));
        
        //System.out.println(reverseInteger(124532));

        //System.out.println(isPalindrome(123));
        
        //displayReversedInteger(1234532);

        displaySortedNumbers(5.5, 1.5, 2.0);

        //celsiusToFahrenheitTable();
        //fahrenheitToCelsiusTable();
    }

    public static int sumDigits(long number){
        int sum = 0;

        while(number != 0){
            int digit = (int)(number % 10);
            sum += digit;
            number /= 10;
        }
        
        return sum;
    } // End of sumDigits method

    public static int reverseInteger(int number){
        int reversed = 0, numDigits = (number + "").length();

        for(int i = numDigits; i > 0; i--){
            int digit = (number % 10) * (int)Math.pow(10, i - 1);
            reversed += digit;
            number /= 10;
        }

        return reversed;
    } // End of reverseInteger method

    public static boolean isPalindrome(int number){
        return reverseInteger(number) == number;
    } // End of isPalindrome method
    
    public static void displayReversedInteger(int number){
        int reversed = 0, numDigits = (number + "").length();

        for(int i = numDigits; i > 0; i--){
            int digit = (number % 10) * (int)Math.pow(10, i - 1);
            reversed += digit;
            number /= 10;
        }

        System.out.println("Reversed integer: " + reversed);
    } // End of reverseInteger method

    public static void displaySortedNumbers(double num1, double num2, double num3){
        // 6 possibilities
        if(num1 >= num2 && num1 >= num3){ // num1 is greatest
            if(num2 >= num3){
                System.out.println(num3 + " " + num2 + " " + num1); // num3 is least
            }
            else if(num3 > num2){
                System.out.println(num2 + " " + num3 + " " + num1); // num2 is least
            }
        }
        else if(num1 < num2 && num1 < num3){ // num 1 is the least
            if(num2 >= num3){
                System.out.println(num1 + " " + num3 + " " + num2); // num2 is the greatest
            }
            else if(num3 > num2){
                System.out.println(num1 + " " + num2 + " " + num3); // num3 is the greatest
            }
        }
        else if(num1 <= num2 && num1 >= num3){ // num 1 is between num3 and num2
            System.out.println(num3 + " " + num1 + " " + num2);
        }
        else { // num 1 is between num2 and num3          
            System.out.println(num2 + " " + num1 + " " + num3);
        }
    } // End of displaySortedNumbers method

    public static void celsiusToFahrenheitTable(){
        System.out.print("Celsius\t\tFahrenheit\n");
        for(double celsius = 40.0; celsius > 30.0; celsius--){
            System.out.printf("%.1f\t\t%.1f\n", celsius, Conversions.celsiusToFahrenheit(celsius));
        }
    } // End of celsiusToFahrenheitTable method

    public static void fahrenheitToCelsiusTable(){
        System.out.print("Fahrenheit\tCelsius\n");
        for(double fahrenheit = 120.0; fahrenheit > 29.0; fahrenheit -= 10){
            System.out.printf("%.1f\t\t%.1f\n", fahrenheit, Conversions.fahrenheitToCelsius(fahrenheit));
        }
    } // End of fahrenheitToCelsiusTable method
}