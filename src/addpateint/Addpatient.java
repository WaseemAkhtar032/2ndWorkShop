package addpateint;
import CreatePatient.CreateHospital;
import java.util.ArrayList;
import java.util.Scanner;

public class Addpatient extends CreateHospital{
        Scanner sc = new Scanner(System.in);
        ArrayList<CreateHospital> person; //ArrayList for patient

        /*
         * Creating Constructor with arraylist
         */
        public Addpatient() {
            person = new ArrayList<CreateHospital>();
        }

        public void addPatient() {
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


    public void displayPatient(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(phoneNumber);
        System.out.println(city);
        System.out.println(state);
        System.out.println(department);
    }

        public static void main(String[] args) {
            System.out.println("Welcome to Second Workshop Program..!");

            /*
             * Creating Object of Contact
             */
            CreateHospital patient = new CreateHospital();
            Addpatient ap = new Addpatient();
            System.out.println("Enter the first patient details");
            ap.addPatient();
            ap.displayPatient();
            System.out.println("Enter the second patient details");
            ap.addPatient();
            ap.displayPatient();
            System.out.println("Enter the third patient details");
            ap.addPatient();
            ap.displayPatient();
        }

    }