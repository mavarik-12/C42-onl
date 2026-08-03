package homework_13_regex_except;

public class AuthValidator {
    public static boolean validate(String login, String password, String confirmPassword)
        throws WrongLoginException, WrongPasswordException {
        if (login == null || login.length() >= 20 || login.contains(" ")){
            throw new WrongLoginException("Ошибка логина: должен быть короче 20 символов и без пробелов.");
        }
        boolean hasDigit = false;
        for (char c : password.toCharArray()){
            if (Character.isDigit(c)){
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit){
            throw  new WrongPasswordException("Ошибка пароля: должен содержать хотя бы одну цифру.");
        }
        if (!password.equals(confirmPassword)){
            throw  new WrongPasswordException("Ошибка: пароль и подтверждение не совпадают. ");
        }
        return true;
    }

}
