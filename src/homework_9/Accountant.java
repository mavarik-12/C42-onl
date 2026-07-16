package homework_9;
class Accountant implements EmployeeRole {
    private final String position;

    public Accountant(String position) {
        this.position = position;
    }

    @Override
    public void printPosition() {
        System.out.println("Должность: " + position);
    }
}
