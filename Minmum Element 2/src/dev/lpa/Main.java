package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOfIntegers = readIntegers();
        int[] readNumbers = readElements(numberOfIntegers);
        System.out.println(Arrays.toString(readNumbers));

        int returnedMin = findMin(readNumbers);
        System.out.println("min = " + returnedMin);
    }

    private static int readIntegers() {
        Scanner ob = new Scanner(System.in);
        System.out.println("How many integers do you want?");
        return ob.nextInt();

    }

    private static int[] readElements(int size) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter " + size + " integers separated by commas:");
        String input = ob.nextLine();

        String[] splits = input.split(",");
        int[] inputArray = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            inputArray[i] = Integer.parseInt(splits[i].trim());
        }
        return inputArray;
        }

        private static int findMin ( int[] array){

            int min = Integer.MAX_VALUE;
            for (int j : array) {
                if (j < min) {
                    min = j;
                }
            }
            return min;
        }
    }

