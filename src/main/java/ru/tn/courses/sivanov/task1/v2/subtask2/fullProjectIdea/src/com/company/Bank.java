package com.company;

import java.util.Comparator;

public class Bank {
    private int course;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bank(int course, String name) {
        this.course = course;
        this.name = name;
    }

    public Bank(String bank, int crs) {
    }

    public Bank(Bank bank) {
        this.course = bank.course;
        this.name = bank.name;

    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "course=" + course +
                ", name='" + name + '\'' +
                '}';
    }

    public static Comparator<Bank> CourseComparator = new Comparator<Bank>(){
        @Override
        public int compare(Bank o1, Bank o2) {
            return (int) (o1.getCourse() - o2.getCourse());
        }
    };

    public int exchange(int dollars) {
        int rub = dollars*this.course;
        return rub;
    }
}
