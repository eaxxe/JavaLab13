package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name) {
        this(name, "Unknown", 0, "Unknown", 0.0);
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "Unknown", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void setExperience(int years) {
        this.experienceInYears = years;
    }

    public void setExperience(String yearsAsString) {
        this.experienceInYears = Integer.parseInt(yearsAsString);
    }

    public void setExperience(int years, boolean increment) {
        if (increment) {
            this.experienceInYears += years;
        } else {
            this.experienceInYears = years;
        }
    }

    public static void printTesterInfo(Tester tester) {
        System.out.println("Name: " + tester.name + ", Surname: " + tester.surname +
                ", Experience: " + tester.experienceInYears + " years, English Level: " +
                tester.englishLevel + ", Salary: $" + tester.salary);
    }
}


