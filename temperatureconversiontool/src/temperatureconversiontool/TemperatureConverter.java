package temperatureconversiontool;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Conversion Tool");
        System.out.println("---------------------------");
        
        int choice;
        do {
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    fahrenheitToCelsius();
                    break;
                case 2:
                    celsiusToFahrenheit();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
            System.out.println();
        } while (choice != 3);
        
    }
    
    public static void fahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.println("Temperature in Celsius: " + celsius);
        
    }
    
    public static void celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 9 / 5) + 32;
        
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        
    }
}

