package hw3.task1;

public class PasswordVerifier {
    public static void verification(String password) throws VerificationPasswordException {
        if (password.length() < 8) {
            throw new VerificationPasswordException("Пароль должен быть не менее 8 символов");
        }
        if (!password.matches("(?=.*[0-9]).*")) {
            throw new VerificationPasswordException("В пароль должна быть хотя бы одна цифра");
        }
        if (!password.matches("(?=.*[A-Z]).*")) {
            throw new VerificationPasswordException("В пароле должна быть хотя бы одна заглавная буква");
        }
    }
}

