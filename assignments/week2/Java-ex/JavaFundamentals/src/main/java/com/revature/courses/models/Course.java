package com.revature.courses.models;

import java.util.Objects;

public class Course {

    private String courseNum;

    private String title;

    private int teacherId;

    public Course(String courseNum, String title, int teacherId) {
        this.courseNum = courseNum;
        this.title = title;
        this.teacherId = teacherId;
    }

    public Course(String courseNum) {
        this.courseNum = courseNum;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return teacherId == course.teacherId && courseNum.equals(course.courseNum) && title.equals(course.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseNum, title, teacherId);
    }
}
