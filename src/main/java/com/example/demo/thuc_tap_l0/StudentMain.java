package com.example.demo.thuc_tap_l0;

import com.example.demo.thuc_tap_l0.controller.StudentController;

import java.io.IOException;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StudentController studentController = new StudentController();
        int choose;
        while (true) {
            menu();
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    studentController.create();
                    break;
                case 2:
                    studentController.output();
                    break;
                case 3:
                    studentController.readById();
                    break;
                case 4:
                    studentController.update();
                    break;
                case 5:
                    studentController.delete();
                    break;
                case 6:
                    studentController.ratingsRank();
                    break;
                case 7:
                    studentController.percentAverage();
                    break;
                case 8:
                    studentController.searchRank();
                    break;
                case 0:
                    System.out.format("");
                    studentController.outputStream();
                    System.exit(0);
                default:
                    System.out.println("Please choose again: ");
            }
        }

    }

    public static void menu() {
        System.out.println("------------------------------------------------------");
        System.out.println("|1.create                                            |");
        System.out.println("|2.output                                            |");
        System.out.println("|3.read id                                           |");
        System.out.println("|4.update                                            |");
        System.out.println("|5.delete                                            |");
        System.out.println("|6.detail by rank                                    |");
        System.out.println("|7.percent average                                   |");
        System.out.println("|8.search rank                                       |");
        System.out.println("|0.exit.                                             |");
        System.out.println("------------------------------------------------------");
        System.out.println("choose: ");
    }

}
