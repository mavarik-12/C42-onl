package homework_9;
public class Main {
    public static void main(String[] args) {
        Director director = new Director("Генеральный директор");
        Worker worker = new Worker("Программист");
        Accountant accountant = new Accountant("Главный бухгалтер");

        director.printPosition();
        worker.printPosition();
        accountant.printPosition();
    }
}
interface EmployeeRole {
    void printPosition();
}
