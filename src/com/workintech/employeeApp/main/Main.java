package com.workintech.employeeApp.main;

import com.workintech.employeeApp.enums.Plan;
import com.workintech.employeeApp.model.Company;
import com.workintech.employeeApp.model.Employee;
import com.workintech.employeeApp.model.Healthplan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main {
    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData() {
        Healthplan plan = new Healthplan(1, "A Sigorta", Plan.ADVANCE);
        Healthplan plan2 = new Healthplan(2, "C Sigorta", Plan.BASIC);

        System.out.println(plan.getPlan().getName());

        String[] healthplans = new String[2];
        healthplans[0] = plan.getName();
        healthplans[1] = plan2.getName();

        Employee developer = new Employee(1, "Melis", "melis@gmail.com", "1234", healthplans);
        developer.addHealthplan(4, "A Sigorta");
        System.out.println(developer);

        String[] developerNames = new String[4];
        developerNames[0] = developer.getFullName();
        Employee juniorDeveloper = new Employee(2, "Ahmet", "ahmet@gmail.com", "1234", healthplans);
        Company company = new Company(1, "X company", 100000000.00, developerNames);
        company.addEmployee(1, juniorDeveloper.getFullName());
        System.out.println(company);

    }


    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
