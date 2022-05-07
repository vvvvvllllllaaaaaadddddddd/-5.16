import java.util.Scanner;

public class FourTask {
    public static void main(String[] args) {
        String program = ""; // ЧИСЛА, ЯКІ ЗАГАДАЛА ПРОГРАМА
        String userInput = ""; // ЧИСЛА ЯКІ ВВОДИТИМЕ КОРИСТУВАЧ
        int attempt = 0; // СПРОБИ
        for (int i = 0; i < 3; i++) {
            program = program.concat(String.valueOf((int)(Math.random()*3) + 1));
        }


        Scanner sc = new Scanner(System.in);
        // не знав як робити це завдання

