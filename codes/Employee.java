package codes; // My class is inside codes package


import java.util.Locale;

// Class - Noun (Employee, Customer, Person, Student , Account , Product)
// class - PascalCase e.g FullTimeEmployee
// OOPS + SOLID Soft Eng.
// S  - SRP 
// this class is having default scope (Package level scope).
// public class -  access with in the package and outside the package 
// if class is public it must match with file name.
// OOPS Principles
// Encapsulation - Binding Data and Methods into a single unit , and that unit is class.
// Good Encapsulation - private Data and public Method
// Data Hiding
// Object - It is God class / Root Class in Java
// Every class directly or indirectly a child of Object class.
//public class Employee extends Object{
public class Employee{
    // Features
    // Instance Variables
    // default scope
   private int id; // when object is created , comes in memory
   private String name;
   private  double salary; 
   private String companyName;
   private String email;
   private String phone;
   private String city;
   private double bonus;
   private String dept;
   private String manager;
   private Formatting formatting;
   private Locale locale;

   

   /*
    * Constructor - It is used to initalize the instance variables
    Every class by default has default constructor . It is doing nothing
    Constructor Name is same as Class name
    Constructor returns nothing, even it never be void
    Constructor will be call when u create an object 
    */

    public int getId() {
    return id;
}

public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getCompanyName() {
    return companyName;
}
public void setCompanyName(String companyName) {
    this.companyName = companyName;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getPhone() {
    return phone;
}
public void setPhone(String phone) {
    this.phone = phone;
}
public String getCity() {
    return city;
}
public void setCity(String city) {
    this.city = city;
}
public double getBonus() {
    return bonus;
}
public void setBonus(double bonus) {
    this.bonus = bonus;
}
public String getDept() {
    return dept;
}
public void setDept(String dept) {
    this.dept = dept;
}
public String getManager() {
    return manager;
}
public void setManager(String manager) {
    this.manager = manager;
}
    {
        //System.out.println(" i am a init block , pre constructor call");
        //System.out.println(" INIT BLOCK ::: Id "+id + " name "+name + " Salary "+salary);
    }

    {
        //System.out.println("Init Block2");
    }

    // this is a default constructor
   public Employee(){
    companyName = "Brain Mentors";
    
    // System.out.println("I am a Default Cons");
    // id =111;
    // name = "No Name";
    // salary = 1111;
    // System.out.println(" Cons Values ::: Id "+id + " name "+name + " Salary "+salary);
   }
   public Employee(Locale locale){
    this(); // Call Default Const
    this.locale = locale;
    formatting = new Formatting(this.locale);
   }
   // Constructor Overloading
   // Param Constructor
   public Employee(int id , String name, double salary, Locale locale){
    // Constructor Chaining
    this(locale); // One Arg Constructor
    //this(); // call default constructor , mustbe the first line
    if(validate(id, name, salary)){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    else{
        System.out.println("Invalid Data....");
       }

   }

   // setter and getter
   public void setSalary(double salary){
    this.salary = salary;
   }
   public double getSalary(){
    return salary;
   }
   

//    public void Employee(){
//     System.out.println("I am a Method not a constructor");
//    }
   // Data Hiding - private - scope with in the class
    public void takeInput(int id , String name, double salary){
       // id = id ; // Local Var = Local Var
       // Instance Var = Local var
       if(validate(id, name, salary)){
       this.id = id;
       this.name = name;
       this.salary = salary;
       }
       else{
        System.out.println("Invalid Data....");
       }
    }

    private boolean validate(int id, String name, double salary){
        return id>=0 && name!=null && salary>=0;
    }
    // public - keyword - provide access with in the package and outside the package
    public void print(){
       
        // this - keyword (it contains the current calling object reference)
        System.out.println("Current Date "+formatting.doDateFormat());
        System.out.println("Id "+this.id);
        System.out.println("Name "+name);
        System.out.println("Salary "+formatting.doCurrencyFormat(salary));
        System.out.println("Company Name "+companyName);
    }
    @Override
     public boolean equals(Object object){
            // this (emp1)
            // object (emp2) // Upcast to object.
            // Ref compare
            if(this == object){
                return true;
            }
            if(object instanceof Employee){
                Employee e = (Employee) object; // Downcasting
                if(this.id == e.id && this.name.equals((e.name)) && this.salary == e.salary){
                    return true;
                }
            }
            return false;

     }

    @Override
    public String toString(){
            return "Id "+id + " Name "+name+" Salary "+formatting.doCurrencyFormat(salary);
    }
}