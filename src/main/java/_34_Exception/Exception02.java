package _34_Exception;

class LoginFailedException extends Exception {
    public LoginFailedException(String message) { // 2
        super(message);
        System.out.println("예외가 발생했습니다."); // 3
    }
}

public class Exception02 {
    public static void login(String id, String pw) throws LoginFailedException { // throws 는 책임전가로 생각하면 됨 / 4
        String correctId = "admin";
        String correctPw = "1q2w3e4r";

        if (!id.equals(correctId) || pw.equals(correctPw)) {
            // 예외 발생
            throw new LoginFailedException("ID 또는 PW 가 틀렸습니다."); // 1
        }
    }

    public static void main(String[] args) {
        String inputId = "admin";
        String inputPw = "1234qwer";

        try {
            login(inputId, inputPw); // 5 예외 터짐
        } catch (LoginFailedException e) {
            System.out.println("로그인 실패 : " + e.getMessage()); // 6
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}