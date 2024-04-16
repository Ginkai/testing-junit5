public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        // Vòng lặp tính tổng các số chẵn trong mảng
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        // Kiểm tra tổng và in ra kết quả
        if (sum > 10) {
            System.out.println("Tổng các số chẵn lớn hơn 10");
        } else {
            System.out.println("Tổng các số chẵn nhỏ hơn hoặc bằng 10");
        }
    }
}
