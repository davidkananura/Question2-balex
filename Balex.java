/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.balexproject;

/**
 *
 * @author DAVID'S-PC
 */
import java.util.HashMap;
import java.util.Scanner;

public class Balex {
    public static void main(String[] args) {
        // Initialize the courses
        HashMap<String, Courses> courseList = new HashMap<>();
        courseList.put("BSE", new Courses("Software Engineering", "BSE", 900000));
        courseList.put("BIT", new Courses("Information Technology", "BIT", 750000));
        courseList.put("BCS", new Courses("Computer Science", "BCS", 800000));
        courseList.put("BCE", new Courses("Computer Engineering", "BCE", 950000));

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CourseID: ");
        String courseID = scanner.nextLine().toUpperCase();

        // Check if the courseID exists in the courseList
        if (courseList.containsKey(courseID)) {
            Courses course = courseList.get(courseID);
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Course ID: " + course.getCourseID());
            System.out.println("Tuition: " + course.getTuition());
        } else {
            System.out.println("Wrong CourseID details");
        }

        // Close the scanner
        scanner.close();
    }
}

