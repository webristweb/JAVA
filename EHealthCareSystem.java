import java.util.Scanner;
import java.util.ArrayList;

public class EHealthCareSystem {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to E-Healthcare System!");
            System.out.println("1. Register Patient");
            System.out.println("2. Register Doctor");
            System.out.println("3. Set Appointment");
            System.out.println("4. View Appointments");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    registerPatient(scanner);
                    break;
                case 2:
                    registerDoctor(scanner);
                    break;
                case 3:
                    setAppointment(scanner);
                    break;
                case 4:
                    viewAppointments();
                    break;
                case 5:
                    System.out.println("Thank you for using E-Healthcare System. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void registerPatient(Scanner scanner) {
        System.out.println("Register Patient:");
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter address: ");
        String address = scanner.next();
        System.out.print("Enter email: ");
        String email = scanner.next();
        System.out.print("Enter phone: ");
        String phone = scanner.next();

        Patient patient = new Patient(name, age, address, email, phone);
        patients.add(patient);
        System.out.println("Patient registered successfully!");
    }

    private static void registerDoctor(Scanner scanner) {
        System.out.println("Register Doctor:");
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter specialization: ");
        String specialization = scanner.next();
        System.out.print("Enter availability: ");
        String availability = scanner.next();

        Doctor doctor = new Doctor(name, specialization, availability);
        doctors.add(doctor);
        System.out.println("Doctor registered successfully!");
    }

    private static void setAppointment(Scanner scanner) {
        System.out.println("Set Appointment:");
        System.out.print("Enter patient's name: ");
        String patientName = scanner.next();
        System.out.print("Enter doctor's name: ");
        String doctorName = scanner.next();
        System.out.print("Enter day: ");
        String day = scanner.next();
        System.out.print("Enter time: ");
        String time = scanner.next();

        Patient patient = findPatient(patientName);
        Doctor doctor = findDoctor(doctorName);
        if (patient != null && doctor != null) {
            Appointment appointment = new Appointment(patient, doctor, day, time);
            appointments.add(appointment);
            System.out.println("Appointment set successfully!");
        } else {
            System.out.println("Patient or Doctor not found. Please check the names and try again.");
        }
    }

    private static Patient findPatient(String name) {
        for (Patient patient : patients) {
            if (patient.getName().equals(name)) {
                return patient;
            }
        }
        return null;
    }

    private static Doctor findDoctor(String name) {
        for (Doctor doctor : doctors) {
            if (doctor.getName().equals(name)) {
                return doctor;
            }
        }
        return null;
    }

    private static void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
        } else {
            System.out.println("Appointments:");
            for (Appointment appointment : appointments) {
                System.out.println("Patient: " + appointment.getPatient().getName());
                System.out.println("Doctor: " + appointment.getDoctor().getName());
                System.out.println("Day: " + appointment.getDay());
                System.out.println("Time: " + appointment.getTime());
                System.out.println("-----------------------");
            }
        }
    }
}

class Patient {
    private String name;
    private int age;
    private String address;
    private String email;
    private String phone;

    public Patient(String name, int age, String address, String email, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
}

class Doctor {
    private String name;
    private String specialization;
    private String availability;

    public Doctor(String name, String specialization, String availability) {
        this.name = name;
        this.specialization = specialization;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }
}

class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String day;
    private String time;

    public Appointment(Patient patient, Doctor doctor, String day, String time) {
        this.patient = patient;
        this.doctor = doctor;
        this.day = day;
        this.time = time;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
}
}