// CO1 - Apply Level 1: Hospital Management System
import java.util.Scanner;

class Person {
    String name;
    int age;
    String contactInfo;

    void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: "); name = sc.nextLine();
        System.out.print("Enter age: "); age = sc.nextInt(); sc.nextLine();
        System.out.print("Enter contact info: "); contactInfo = sc.nextLine();
    }

    void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact Info: " + contactInfo);
    }
}

class Doctor extends Person {
    String specialization;
    String availability;

    Doctor() { inputData(); }
    @Override
    void inputData() {
        super.inputData(); // common attributes
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter specialization: "); specialization = sc.nextLine();
        System.out.print("Enter availability: "); availability = sc.nextLine();
    }


    @Override
    void displayData() {
        super.displayData();
        System.out.println("Specialization: " + specialization);
        System.out.println("Availability: " + availability);
    }
}

class Patient extends Person {
    String disease;
    String admittedDate;

    Patient() { inputData(); }

    @Override
    void inputData() {
        super.inputData(); // common attributes
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter disease: "); disease = sc.nextLine();
        System.out.print("Enter admitted date: "); admittedDate = sc.nextLine();
    }

    @Override
    void displayData() {
        super.displayData();
        System.out.println("Disease: " + disease);
        System.out.println("Admitted Date: " + admittedDate);
    }
}

class HospitalManagement {
    public static void main(String[] args) {
        //take input details
        System.out.println("\nEnter Doctor Details:");
        Doctor doc = new Doctor();
        System.out.println("\nEnter Patient Details:");
        Patient pat = new Patient();

        //display details
        System.out.println("\nDoctor Details:");
        doc.displayData();
        System.out.println("\nPatient Details:");
        pat.displayData();
    }
}
