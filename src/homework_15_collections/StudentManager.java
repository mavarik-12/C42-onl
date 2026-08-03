package homework_15_collections;

import java.util.Iterator;
import java.util.List;

public class StudentManager {
    public static void removePoorStudents(List < Student > students){
        Iterator< Student > iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getAverage() < 3.0) {
                iterator.remove();
            } else {
                student.translateToNextCourse();
            }
        }
    }
    public static void printStudents(List < Student > students, int course){
        boolean found = false;
        for (Student student : students){
            if (student.getCourse() == course){
                System.out.println(student.getName() + "(средний балл: " + student.getAverage() + ")");
                found = true;
            }
        }
        if (!found){
            System.out.println("Студентов на этом курсе нет.");
        }
    }
}
