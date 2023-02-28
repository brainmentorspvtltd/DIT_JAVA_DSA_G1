import java.util.Locale;
import java.util.Scanner;

import codes.Employee; // Employee will be lookup from codes package
import codes.MessageReader;

public class TestEmployee {
    public static void main(String[] args) {
        Locale locale = new Locale("hi","IN");
        Employee emp1 = new Employee(1001, "Ram", 99999, locale);
        Employee emp2 = new Employee(1001, "Ram", 99999, locale);
        System.out.println("Ref Compare...");
        System.out.println("Ref Compare " + (emp1 == emp2)); // Refernence Compare
        System.out.println("Value Compare "+(emp1.equals(emp2)));
        Scanner scanner = new Scanner(System.in);
        int x; // x is a variable of int type
        x = 10; // Assign
        Employee emp; // emp is a variable of Employee Type
        //emp = new Employee();
        //emp.Employee();
        // emp.id = -1001;
        // emp.name = "Ram";
        // emp.salary = -9999;
        // Read from the MessageBundle
       /*  Locale locale = new Locale("hi","IN");
        MessageReader messageReader = new MessageReader(locale); 
       
        System.out.println(messageReader.getMessage("id.msg"));
        int id = scanner.nextInt();
        System.out.println(messageReader.getMessage("name.msg"));
        //System.out.println("Enter the Name");
        String name = scanner.next();
        System.out.println(messageReader.getMessage("salary.msg"));
       // System.out.println("Enter the Salary");
        double salary = scanner.nextDouble();
        emp = new Employee(id, name, salary, locale);
        emp.setSalary(emp.getSalary()+ 20000);
        System.out.println(emp.getName());
        String strName = new String("Amit");
        //System.out.println(strName.toString());
        //System.out.println(emp.toString());
        System.out.println(emp); // emp.toString();
        //emp = new Employee();
        //emp.takeInput(id, name, salary);
       // emp.print();
        scanner.close();
        // System.out.println(emp.id);
        // System.out.println(emp.name);
        // System.out.println(emp.salary);
        // System.out.println("*********************");
        // Employee shashi = new Employee();
        // shashi.takeInput(1002, "Shashi", 99999);
        // shashi.print();
        // System.out.println(shashi.id);
        // System.out.println(shashi.name);
        // System.out.println(shashi.salary);
        */
    }
}
