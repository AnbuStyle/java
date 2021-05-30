package ru.geekbrains.efremov;

public class Employee {

    private String name;
    private String position;
    private String email;
    private String  phoneNumber;
    private int income;
    private int age;

    public Employee (String name, String position, String email, String phoneNumber,
                     int income, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.income = income;
        this.age = age;
            }

    public String getName() {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getIncome() {
        return income;
    }
    public void setIncome(int income) {
        this.income = income;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public void info () {
        System.out.printf("name = %s, " +
                        "position = %s, " +
                        "email = %s, " +
                        "phoneNumber = %s, "+
                        "income = %d, " +
                        "age = %d",
                name, position, email, phoneNumber, income, age);
    }
}

