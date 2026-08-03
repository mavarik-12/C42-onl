package homework_13_regex_except;

import static sun.security.util.KeyUtil.validate;

public class MyMain {
    public static void main (String[] args){
        System.out.println(" --- Успешная авторизация ---  ");
        testValidation("user", "pass123", "pass123");

        System.out.println("\n --- Логин с пробелом (Ошибка) --- ");
        testValidation("user with space", "pass123", "pass123");

        System.out.println("\n --- Пароль без цифры (Ошибка) --- ");
        testValidation("user", "password", "password");

        System.out.println("\n --- Несовпадение паролей (Ошибка) --- ");
        testValidation("user", "pass123", "wrongpass");
    }

    private static void testValidation(String login, String pass, String confirm) {
        try {
            boolean result = AuthValidator.validate(login, pass, confirm);
            System.out.println("Результат валидации: " + result);
        }catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

    }


}
