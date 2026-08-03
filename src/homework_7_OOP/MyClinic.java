package homework_7_OOP;

public class MyClinic {
    static void main() {
        Surgeon surgeon = new Surgeon();
        Therapist therapist = new Therapist();
        Doctor dentist = new Dentist();

        Patient patient = new Patient(1);
        patient.assignDoctor();
    }
}

