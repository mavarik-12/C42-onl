package homework_7;

class  Patient {
    private final int treatmentPlan;

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }
    public void assignDoctor(){
        Doctor doctor;
        if (treatmentPlan == 1) {
            doctor = new Surgeon();
        } else if (treatmentPlan == 2) {
            doctor = new Dentist();
        } else {
            doctor = new Therapist();
        }
        doctor.treat();
    }
    }

//    private String patientType;
//    private  String patientName;
//    private  int age;
//
//    public Patient(String patientType, String patientName, int age) {
//        super();
//        this.patientType = patientType;
//        this.patientName = patientName;
//        this.age = age;
//    }
//    public  void appointments(){
//        System.out.println("Пациенты приходят на прием к врачу когда болеют");
//    }







