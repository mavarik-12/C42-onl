package homework_7;

public class Surgeon extends Doctor {
    @Override
    public void treat() {
        System.out.println("Хирург делает операции");
    }
}
//    public Surgeon(String doctorType, String doctorName, int age) {
//        super(doctorType, doctorName, age);
//    }
//    @Override
//    public void treat(){
//        System.out.println("Терапевты делает осмотр,лечением пациентов!");
//
//    }

