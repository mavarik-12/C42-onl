package homework_15_collections;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List < Integer > grades;

    public Student(String name, String group, int course, List < Integer > grades){
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = (grades != null) ? grades : new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public String getGroup(){
        return group;
    }
    public int getCourse(){
        return course;
    }
    
    public double getAverage(){
        if (grades.isEmpty()){
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        return (double)  sum / grades.size();
    }

    public void translateToNextCourse() {
        if (getAverage() >= 3.0){
            this.course++;
        }
    }
}
