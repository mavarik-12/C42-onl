package homework_10;

public class Main {
    public static void main(String[] args){
        User user1 = new User("john_doe", "john@example.com", 25);
        User user2 = new User("john_doe", "john@example.com", 25);
        User user3 = new User("jane_doe", "jane@example.com", 20);

        System.out.println("user1.equals(user2): " + user1.equals(user2));
        System.out.println("user1.equals(user3): " + user1.equals(user3));
        System.out.println("hashCode(user1) == hashCode(user2): " +
                (user1.hashCode() == user2.hashCode()));
    }
}

