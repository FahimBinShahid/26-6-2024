package dev.lpa;
public class Main {
    public static void main(String[] args) {

        System.out.println("Whassup Everybody");

        String[] splitString = "Whassup EveryBody".split(" ");
        printText(splitString);

        System.out.println("_".repeat(20));
        printText("Whassup");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first","second","third","fourth","fifth"};
        System.out.println(String.join(",", sArray));
    }
    private static void printText(String... textList){
        for(String t : textList){
            System.out.println(t);
        }
    }
}