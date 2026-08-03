package homework_9_abstract_interf;
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

