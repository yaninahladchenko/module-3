package task3;

import java.util.Random;

public class Employee {
    private String name;
    private String surname;
    private int id;

    public Employee() {
        this.id = Math.abs(new Random().nextInt());
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = Math.abs(new Random().nextInt());
    }

    public void print() {
        System.out.println(String.format("Employee name: %s", getName()));
        System.out.println(String.format("Employee surname: %s", getSurname()));
        System.out.println(String.format("Employee id: %s", getId()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}