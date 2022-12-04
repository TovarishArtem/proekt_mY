package src;

import CSV.Parser;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        var report = Parser.getReport("C:\\Users\\artem\\OneDrive\\Рабочий стол\\proekt\\basicprogramming_2.csv");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for(var i : report.keySet()){
            if (i.contains(name)){
                System.out.println(i);
               for (var j : report.get(i)){
                   System.out.println(j);
               }

            }

        }

    }

}