package homework_15_collections;

import java.util.Deque;
import java.util.LinkedList;

public class AnimalQueue {
    private final Deque<String> animals;

    public AnimalQueue() {
        this.animals = new LinkedList<>();
    }
    public void addAnimal(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя животного не может быть пустым");
        }
        animals.addFirst(name);
    }
    public String removeAnimal() {
        if (animals.isEmpty()) {
            throw new IllegalStateException("Очередь пуста, нечего удалять");
        }
        return animals.removeLast();
    }
    public boolean isEmpty() {
        return animals.isEmpty();
    }
    public void printAnimals() {
        System.out.println("Текущие животные: " + animals);
    }
}

