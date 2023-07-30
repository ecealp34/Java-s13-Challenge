package com.workintech.employeeApp.model;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    private void checkId(int id) {
        if(id < 0) {
            this.id = 0;
        } else {
            this.id = id;
        }
    }

    private void checkGiro(double giro) {
        if(giro < 0) {
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public Company(int id, String name, double giro, String[] developerNames) {
        checkId(id);
        this.name = name;
        checkGiro(giro);
        this.developerNames = developerNames;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void addEmployee(int index, String name) {
        try {
            if (developerNames[index] == null) {
                developerNames[index] = name;
            } else {
                System.out.println("Bu indexe ait developer var");
            }
        } catch(ArrayIndexOutOfBoundsException ex) {
                System.out.println("Olmayan indexe atama yapılamaz" + index);
            }
        }
        public String toString(){
            return "Name - " + name + " Giro - " + giro + " developers - " + Arrays.toString(developerNames);
        }



}
