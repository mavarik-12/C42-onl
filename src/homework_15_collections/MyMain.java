package homework_15_collections;

import java.util.*;

import static homework_15_collections.StudentManager.printStudents;

public class MyMain {
    public static void main(String[] args){
        getUniqueNumbers();
        System.out.println("-".repeat(50));

        getAnimalQueue();
        System.out.println("-".repeat(50));

        getStudent();
        System.out.println("-".repeat(50));
    }

    public static void getUniqueNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа ( через запятую или пробел): ");
        String input = scanner.nextLine();

        String[] parts = input.split(",\\s*");
        Set < String > uniqueNumbersSet = new HashSet<>(Arrays.asList(parts));

        StringBuilder result = new StringBuilder();
        for (String number : uniqueNumbersSet){
            result.append(number).append(",");
        }
        if (!result.isEmpty()){
            result.setLength(result.length() - 2);
        }
        System.out.println("Уникальное число:  " + result.toString());
    }

    public static void getAnimalQueue(){
        AnimalQueue queue = new AnimalQueue();
        queue.addAnimal("Жираф");
        queue.addAnimal("Пантера");
        queue.addAnimal("Ягуар");

        queue.printAnimals();
        String removed = queue.removeAnimal();
        System.out.println("Удалили: " + removed);
        queue.printAnimals();
    }

    public static void getStudent(){
        List < Student > students = new ArrayList<>();
        students.add(new Student("Грибоедов", "Г1", 1, List.of(3, 4, 5)));
        students.add(new Student("Бабушкин", "Г2", 1, List.of(2, 3, 4)));
        students.add(new Student("Смирнов", "Г3", 2, List.of(5, 5, 5)));
        students.add(new Student("Петров", "Г1", 1, List.of(1, 1, 1)));
        System.out.println("Студенты на 1 курсе до обработки");
        printStudents(students,1);

        System.out.println("\n После обработки ( удаление слабых студентов и перевод остальных):");
        StudentManager.removePoorStudents(students);
        printStudents(students, 1);
        System.out.println("\n Студенты на 2 курсе после обработки: ");
        StudentManager.printStudents(students,2);
    }
}



