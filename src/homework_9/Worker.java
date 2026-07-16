package homework_9;
  class Worker implements EmployeeRole {
      private final String position;

      public Worker(String position) {
          this.position = position;
      }

      @Override
      public void printPosition() {
          System.out.println("Должность: " + position);
      }
  }

