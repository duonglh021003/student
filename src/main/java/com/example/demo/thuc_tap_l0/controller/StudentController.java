package com.example.demo.thuc_tap_l0.controller;


import com.example.demo.thuc_tap_l0.Until;
import com.example.demo.thuc_tap_l0.entity.Student;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.*;

public class StudentController {

    Scanner scanner = new Scanner(System.in);
    List<Student> students = new ArrayList<>();

    public StudentController() {
        students.add(new Student("SV01", LocalDate.of(2003, 10, 02), "FPT", 55.5f, 55.5f, "1234567890", "Ha Noi", 7777, 8.0f));
        students.add(new Student("SV02", LocalDate.of(2003, 10, 02), "FPT", 55.5f, 55.5f, "1234567899", "Ha Noi", 7777, 3.0f));
        students.add(new Student("SV03", LocalDate.of(2003, 10, 02), "FPT", 55.5f, 55.5f, "1234567898", "Ha Noi", 7777, 8.0f));
        students.add(new Student("SV04", LocalDate.of(2003, 10, 02), "FPT", 55.5f, 55.5f, "1234567897", "Ha Noi", 7777, 6.0f));
        students.add(new Student("SV05", LocalDate.of(2003, 10, 02), "FPT", 55.5f, 55.5f, "1234567896", "Ha Noi", 7777, 6.0f));
        students.add(new Student("SV05", LocalDate.of(2003, 10, 02), "FPT", 55.5f, 55.5f, "1234567895", "Ha Noi", 7777, 7.0f));

    }


    private String inputName() {
        String name;
        while (true) {
            System.out.println("Input name: ");
            name = scanner.nextLine();
            if (name.trim().isEmpty()) {
                System.err.println("not empty!");
            } else if (name.matches(Until.NUMBER)) {
                System.err.println("name must be letter!");
            } else if (name.length() < Until.MAX_NAME_LENGTH) {
                break;
            } else {
                System.err.println("name < 100!");
            }
        }
        return name;
    }

    private LocalDate inputdateOfBirth() {
        LocalDate date;
        while (true) {
            try {
                System.out.println("Input dateOfBirth (dd/MM/yyyy): ");
                String input = scanner.nextLine();
                String[] parts = input.split("/");
                int day = Integer.parseInt(parts[0]);
                int month = Integer.parseInt(parts[1]);
                int year = Integer.parseInt(parts[2]);
                date = LocalDate.of(year, month, day);

                if (year > Until.MIN_YEAR) {
                    break;
                } else {
                    System.err.println("dateOfBirth > 1900!");
                }
            } catch (Exception e) {
                System.err.println("dateOfBirth wrong format!");
            }
        }
        return date;
    }

    private String inputAddress() {
        String address;
        while (true) {
            System.out.println("Input address: ");
            address = scanner.nextLine();
            if (address.trim().isEmpty()) {
                System.err.println("not empty!");
            } else if (address.length() < Until.MAX_ADDRESS_LENGTH) {
                break;
            } else {
                System.err.println("length address < 300!");
            }
        }
        return address;
    }

    private String inputHeight() {
        String height;
        while (true) {
            System.out.println("Input height: ");
            height = scanner.nextLine();
            if (height.trim().isEmpty()) {
                System.err.println("not empty!");
            } else if (height.matches(Until.TEXT)) {
                System.err.println("height must be number!");
            } else if (Until.MIN_HEIGHT <= Float.parseFloat(height) && Until.MAX_HEIGHT >= Float.parseFloat(height)) {
                break;
            } else {
                System.err.println("height about 50.0 - 300.0!");
            }
        }
        return height;
    }

    private String inputWeight() {
        String weight;
        while (true) {
            System.out.println("Input Weight: ");
            weight = scanner.nextLine();
            if (weight.trim().isEmpty()) {
                System.err.println("not empty!");
            } else if (weight.matches(Until.TEXT)) {
                System.err.println("weight must be number!");
            } else if (Until.MIN_WEIGHT <= Float.parseFloat(weight) && Until.MAX_WEIGHT >= Float.parseFloat(weight)) {
                break;
            } else {
                System.err.println("weight about 5.0 - 1000.0.");
            }
        }
        return weight;
    }


    private String inputCode() {
        String code;
        while (true) {
            System.out.println("Input code: ");
            code = scanner.nextLine();
            boolean codeExists = false;

            for (Student student : students) {
                if (student.getCode().equals(code)) {
                    codeExists = true;
                }
            }

            if (code.trim().isEmpty()) {
                System.err.println("not empty!");
            } else if (!(code.length() == Until.CODE_LENGTH)) {
                System.err.println("length code = 10!");
            } else if (!codeExists) {
                break;
            } else {
                System.err.println("code duplicate!");
            }
        }
        return code;

    }

    private String inputSchool() {
        String school;
        while (true) {
            System.out.println("Input school: ");
            school = scanner.nextLine();
            if (school.trim().isEmpty()) {
                System.err.println("not empty!");
            } else if (school.length() < Until.MAX_SCHOOL_LENGTH) {
                break;
            } else {
                System.err.println("length school < 200");
            }
        }
        return school;
    }

    private String inputStartYear() {
        String startYear;
        while (true) {
            System.out.println("Input startYear: ");
            startYear = scanner.nextLine();
            if (startYear.trim().isEmpty()) {
                System.err.println("not empty!");
            } else if (startYear.matches(Until.TEXT)) {
                System.err.println("startYear must be number!");
            } else if (!(Integer.parseInt(startYear) > 1900)) {
                System.err.println("startYear > 1900");
            } else if ((startYear.length() == Until.YEAR_LENGTH)) {
                break;
            } else {
                System.err.println("length startYear = 4");
            }
        }
        return startYear;
    }

    private String inputAverage() {
        String average;
        while (true) {
            System.out.println("input average: ");
            average = scanner.nextLine();
            if (average.trim().isEmpty()) {
                System.err.println("not empty!");
            } else if (average.matches(Until.TEXT)) {
                System.err.println("average must be number!");
            } else if (Until.MIN_AVERAGE <= Float.parseFloat(average) && Until.MAX_AVERAGE >= Float.parseFloat(average)) {
                break;
            } else {
                System.err.println("average about 0.0 - 10.0");
            }
        }
        return average;
    }


    public void create() {

        String name = inputName();
        LocalDate dateOfBirth = inputdateOfBirth();
        String address = inputAddress();
        String height = inputHeight();
        String weight = inputWeight();
        String code = inputCode();
        String school = inputSchool();
        String startYear = inputStartYear();
        String average = inputAverage();

        Student student = new Student(
                name,
                dateOfBirth,
                address,
                Float.parseFloat(height),
                Float.parseFloat(weight),
                code,
                school,
                Integer.parseInt(startYear),
                Float.parseFloat(average));
        students.add(student);
    }

    public void output() {
        Integer count = 0;
        for (Student student : students) {
            System.out.println("{STT: " + ++count + ", " + student.toString());
        }
    }

    public void readById() {
        Integer id;
        boolean checkId = false;
        try {
            System.out.println("input by id: ");
            id = Integer.parseInt(scanner.nextLine());
        }catch (Exception e) {
            System.err.println("Please enter an integer!");
            return;
        }

        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student);
                checkId = true;
                break;
            }
        }
        if (!checkId) {
            System.err.println("id: " + id + " not existed!");
        }
    }


    public void update() {
        Integer id;
        boolean checkId = false;
        try {
            System.out.println("input id update: ");
            id = Integer.parseInt(scanner.nextLine());
        }catch (Exception e) {
            System.err.println("Please enter an integer!");
            return;
        }

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                String name = inputName();
                LocalDate dateOfBirth = inputdateOfBirth();
                String address = inputAddress();
                String height = inputHeight();
                String weight = inputWeight();
                String code = inputCode();
                String school = inputSchool();
                String startYear = inputStartYear();
                String average = inputAverage();

                Student student = students.get(i);
                student.setName(name);
                student.setDateOfBirth(dateOfBirth);
                student.setAddress(address);
                student.setHeight(Float.parseFloat(height));
                student.setWeight(Float.parseFloat(weight));
                student.setCode(code);
                student.setSchool(school);
                student.setStartYear(Integer.parseInt(startYear));
                student.setAverage(Float.parseFloat(average));
                System.out.println("update success id: " + id);
                output();
                return;
            }
        }

        if (!checkId) {
            System.err.println("id: " + id + " not existed!");
        }

    }


    public void delete() {

        boolean checkId = false;
        Integer id;
        try {
            System.out.println("input id delete: ");
             id = Integer.parseInt(scanner.nextLine());
        }catch (Exception e) {
            System.err.println("Error : Please enter an integer");
            return;
        }

        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                students.remove(i);
                System.out.println("successful delete id: " + id);
                output();
                checkId = true;
            }
        }

        if (!checkId) {
            System.err.println("id: " + id + " not existed!");
        }


    }

    public void ratingsRank() {

        double countExcellent = 0;
        double countGood = 0;
        double countRather = 0;
        double countAverage = 0;
        double countWeak = 0;
        double countLeast = 0;
        double countList = students.size();


        for (Student student : students) {
            if (student.getRankEnum().equals(Student.rank.EXCELLENT)) {
                countExcellent++;
            } else if (student.getRankEnum().equals(Student.rank.GOOD)) {
                countGood++;
            } else if (student.getRankEnum().equals(Student.rank.RATHER)) {
                countRather++;
            } else if (student.getRankEnum().equals(Student.rank.AVERAGE)) {
                countAverage++;
            } else if (student.getRankEnum().equals(Student.rank.WEAK)) {
                countWeak++;
            } else {
                countLeast++;
            }
        }

        double excellent = Math.round((countExcellent / countList) * 100);
        System.out.println("EXCELLENT: " + excellent + "%");

        double good = Math.round((countGood / countList) * 100);
        System.out.println("GOOD: " + good + "%");

        double rather = Math.round((countRather / countList) * 100);
        System.out.println("RATHER: " + rather + "%");

        double average = Math.round((countAverage / countList) * 100);
        System.out.println("AVERAGE: " + average + "%");

        double weak = Math.round((countWeak / countList) * 100);
        System.out.println("WEAK: " + weak + "%");

        double least = Math.round((countLeast / countList) * 100);
        System.out.println("LEAST: " + least + "%");

        List<Double> listRatingsRank = new ArrayList<>();
        listRatingsRank.add(excellent);
        listRatingsRank.add(good);
        listRatingsRank.add(rather);
        listRatingsRank.add(average);
        listRatingsRank.add(weak);
        listRatingsRank.add(least);

        Collections.sort(listRatingsRank, Collections.reverseOrder());
        System.out.println("sort descending = " + listRatingsRank);
    }

    public void percentAverage() {
        double countList = students.size();

        Map<Float, Long> map = new HashMap<>();
        for (Student student : students) {
            map.put(student.getAverage(), Math.round(map.getOrDefault(student.getAverage(), 0L) + 1.0 / countList * 100));
        }
        Set<Float> set = map.keySet();
        for (Float key : set) {
            System.out.println(key + " : " + map.get(key) + "%");
        }

    }

    public void searchRank() {
        String rank;
        System.out.println("input rank search: ");
        rank = scanner.nextLine();
        boolean rankExists = false;


        for (Student student : students) {
            if (String.valueOf(student.getRankEnum()).equals(rank)) {
                System.out.println(student);
                rankExists = true;
            }
        }
        if (!rankExists) {
            System.err.println("rank: " + rank + " not existed!");
        }

    }

    public void outputStream() {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(Until.OUTPUT_STREAM));
            for (Student student : students) {
                writer.write(student.toString());
                writer.newLine();
            }
            writer.close();
            System.out.println("save done!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}




