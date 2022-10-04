package com.revature.courses;

import com.revature.courses.service.TeacherService;

import java.util.Scanner;

public class App {

    public static TeacherService ts = new TeacherService();

    public static void main(String[] args) {
        System.out.println("Press 1 to Login. Press 2 to register");

        Scanner sc = new Scanner(System.in);
        TeacherService ts = new TeacherService();

        String choice = sc.nextLine();

        if (choice.equals("1")) {
            System.out.println("Please enter your username");
            String username = sc.nextLine();
            System.out.println("Please enter your password");
            String password = sc.nextLine();

            ts.login(username, password);
        }

        else if (choice.equals("2")) {
            System.out.println("please enter your first name");
            String firstName = sc.nextLine();
            System.out.println("Please enter your last name");
            String lastName = sc.nextLine();
            System.out.println("Please enter your username");
            String username = sc.nextLine();
            System.out.println("Please enter your password");
            String password = sc.nextLine();
        }

    }
}
