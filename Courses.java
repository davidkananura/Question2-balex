/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.balexproject;

/**
 *
 * @author DAVID'S-PC
 */
public class Courses {
    String courseName;
    String courseID;
    int tuition;

    public Courses(String courseName, String courseID, int tuition) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.tuition = tuition;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public int getTuition() {
        return tuition;
    }
}

