import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập username");
        String username = scanner.nextLine();
        System.out.println("Nhập password");
        String password = scanner.nextLine();

        String usernameSystem = "techmaster";
        String passwordSystem = "hoclacoviec";

        if (!username.equals(usernameSystem) || !password.equals(passwordSystem)) {
            System.out.println("Tài khoản không tồn tại, vui lòng thử lại");
        } else {
            System.out.println("Đăng nhập thành công");
        }
    }
}
