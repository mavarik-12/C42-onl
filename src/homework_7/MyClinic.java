package homework_7;

public class MyClinic {
//    private static boolean patient;
//    private static Doctor doctor;

    static void main() {
        Surgeon surgeon = new Surgeon();
        Therapist therapist = new Therapist();
        Doctor dentist = new Dentist();

        Patient patient = new Patient(1);
        patient.assignDoctor();
    }
}

//         createDoctor();
//        createPatient();






//    public static void createDoctor(){
//        Doctor Surgeon = new Surgeon("Surgeon", "Alexander", 25);
//        Doctor Therapist = new Therapist("Therapist", "Maksim", 28);
//        Doctor Dentist = new Dentist("Dentist", "Pavel", 30);
//        System.out.println(Surgeon);
//        System.out.println("-".repeat(50));
//        System.out.println(Therapist);
//        System.out.println("-".repeat(50));
//        System.out.println(Dentist);
//
//       doctor.treat();
//
//    }
//
//    public static void createPatient(){
//      Patient patient = new Patient("Patient", "Anton", 22);
//        System.out.println(patient);
//        patient.appointments();
//
//
//
//    }
//
//
//}
