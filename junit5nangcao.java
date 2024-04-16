import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Tạo một số ngẫu nhiên từ 1 đến 100
        int randomNumber = (int) (Math.random() * 100) + 1;

        // Tạo một đối tượng Scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo biến để lưu số đoán của người dùng
        int guessedNumber = 0;

        // Vòng lặp để cho người dùng đoán số và kiểm tra
        while (guessedNumber != randomNumber) {
            // Nhập số đoán từ người dùng
            System.out.print("Nhập một số từ 1 đến 100: ");
            guessedNumber = scanner.nextInt();

            // Kiểm tra số đoán và hiển thị thông báo phản hồi
            if (guessedNumber < randomNumber) {
                System.out.println("Số bạn đoán nhỏ hơn số cần tìm.");
            } else if (guessedNumber > randomNumber) {
                System.out.println("Số bạn đoán lớn hơn số cần tìm.");
            } else {
                System.out.println("Chúc mừng! Bạn đã đoán đúng số.");
            }
        }

        // Đóng đối tượng Scanner sau khi sử dụng
        scanner.close();
    }
}
