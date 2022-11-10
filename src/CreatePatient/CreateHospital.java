package CreatePatient;

import java.util.Scanner;

public class CreateHospital {
     public String name;
     public int age;
     public int phoneNumber;
     public String city;
     public String state;
     public String department;

    public CreateHospital() {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getDepartment() {
        return department;
    }
    public void AddPatient(){
        Scanner sc = new Scanner(System.in);


        System.out.println("enter name of patient");
        name = sc.next();

        System.out.println("enter the age of pateint ");
        age = sc.nextInt();

        System.out.println("enter the phone number of patient");
        phoneNumber = sc.nextInt();

        System.out.println("enter the city of pateint ");
        city = sc.next();

        System.out.println("enter the state");
        state = sc.next();

        System.out.println("enter the deprtment in which the pateint will be admits");
        department = sc.next();
    }

    // name, age, phoneNumber,city,state, department
}
