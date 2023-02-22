package br.edu.univas;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option;
        boolean menu = true;
        do {
            System.out.println("Choose a math solution:");
            System.out.println("1 - Sum");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("9 - Exit");
            option = scanner.next();
            switch (option) {
                case "1": {
                    System.out.println("You chose the sum!");
                    System.out.println("How many numbers do you want to make this equation?");
                    int amount = scanner.nextInt();
                    int[] numbers = new int[amount];
                    int sum = 0;
                    for (int i = 0; i < numbers.length; i++){
                        numbers[i] = scanner.nextInt();
                        sum += numbers[i];
                    }
                    System.out.println(sum);
                    break;
                }
                case "2": {
                    System.out.println("You chose Subtraction!");
                    System.out.println("How many numbers do you want to make this equation?");
                    int amount = scanner.nextInt();
                    int[] numbers = new int[amount];
                    int subtraction = 0;
                    for (int i = 0; i < numbers.length; i++){
                        numbers[i] = scanner.nextInt();
                        if (i == 0){
                            subtraction =  numbers[i];
                        }
                        else{
                            subtraction -=  numbers[i];
                        }

                    }
                    System.out.println(subtraction);

                    break;
                }
                case "3": {
                    System.out.println("You chose Multiplication!");
                    System.out.println("How many numbers do you want to make this equation?");
                    int amount = scanner.nextInt();
                    int[] numbers = new int[amount];
                    int multiplication = 0;
                    for (int i = 0; i < numbers.length; i++){
                        numbers[i] = scanner.nextInt();
                        if (i == 0){
                            multiplication = numbers[i];
                        }
                        else{
                            multiplication *= numbers[i];
                        }

                    }
                    System.out.println(multiplication);


                    break;
                }
                case "4": {
                    System.out.println("You chose Division!");
                    System.out.println("How many numbers do you want to make this equation?");
                    int amount = scanner.nextInt();
                    int[] numbers = new int[amount];
                    int division = 0;
                    for (int i = 0; i < numbers.length; i++){
                        numbers[i] = scanner.nextInt();
                        if (i == 0){
                            division = numbers[i];
                        }
                        else{
                            division /= numbers[i];
                        }

                    }
                    System.out.println(division);

                    break;
                }
                case "9": {
                    menu = false;
                    System.out.println("We ended here bye bye!!!!!");
                    break;
                }
            }

        }while (menu);

    }
}