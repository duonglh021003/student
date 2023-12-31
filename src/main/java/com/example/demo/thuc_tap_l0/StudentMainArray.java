package com.example.demo.thuc_tap_l0;

import com.example.demo.thuc_tap_l0.controller.StudentArrayListController;

import java.io.IOException;
import java.util.Scanner;

public class StudentMainArray {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StudentArrayListController studentArrayListController = new StudentArrayListController();
        int choose;
        while (true) {
            menu();
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    studentArrayListController.create();
                    break;
                case 2:
                    studentArrayListController.output();
                    break;
                case 3:
                    studentArrayListController.readById();
                    break;
                case 4:
                    studentArrayListController.delete();
                    break;
                case 5:
                    studentArrayListController.update();
                    break;
                case 0:
                    System.out.format("");
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
        System.out.println("|4.delete                                            |");
        System.out.println("|5.update                                            |");
        System.out.println("|0.exit.                                             |");
        System.out.println("------------------------------------------------------");
        System.out.println("choose: ");
    }
}
