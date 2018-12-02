package com.infoshareacademy.homeworks;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private Double mark;

    public Student(String name, Double mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public Double getMark() {
        return mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(mark, student.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark);
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
