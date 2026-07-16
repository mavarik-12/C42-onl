package homework_9;
class Director implements EmployeeRole {
    private final String position;

    public Director(String position) {
        this.position = position;
    }

    @Override
    public void printPosition() {
        System.out.println("Должность: " + position);
    }
}
