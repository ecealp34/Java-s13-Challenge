package com.workintech.employeeApp.model;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthPlans() {
        return healthplans;
    }
    public void addHealthplan(int index, String name) {
        try {
            boolean isValid = false;
            for (String healthPlan : healthplans) {
                if (healthPlan.equals(name)) {
                    isValid = true;
                    break;
                }
            }
            if (!isValid) {
                if (healthplans[index] == null) {
                    healthplans[index] = name;
                } else {
                    System.out.println("Bu index için healthplan var");
                }
            } else {
                System.out.println(name + " Bu isimde healthplan var.");
            }

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(index + "Olmayan indexe atama yapılamaz.");
        }
    }
    public String toString() {
        return "FullName - " + fullName + " Healthplans - " + Arrays.toString(healthplans);
    }
}
