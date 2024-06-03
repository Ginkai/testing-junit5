public class NextDayCalculator {

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int[] nextDay(int d, int m, int y) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Kiểm tra năm nhuận
        if (isLeapYear(y)) {
            daysInMonth[1] = 29;
        }

        // Tính ngày tiếp theo
        d += 1;
        if (d > daysInMonth[m - 1]) {
            d = 1;
            m += 1;
            if (m > 12) {
                m = 1;
                y += 1;
            }
        }

        return new int[]{d, m, y};
    }

    public static void main(String[] args) {
        // Các trường hợp kiểm thử
        int[][] testCases = {
            {28, 2, 2020, 29, 2, 2020},  // Năm nhuận, tháng 2
            {29, 2, 2020, 1, 3, 2020},   // Năm nhuận, kết thúc tháng 2
            {28, 2, 2021, 1, 3, 2021},   // Không phải năm nhuận, tháng 2
            {31, 1, 2021, 1, 2, 2021},   // Kết thúc tháng 1
            {30, 4, 2021, 1, 5, 2021},   // Kết thúc tháng 4
            {31, 12, 2021, 1, 1, 2022},  // Kết thúc năm
            {15, 6, 2021, 16, 6, 2021}   // Ngày bình thường
        };

        for (int i = 0; i < testCases.length; i++) {
            int[] testCase = testCases[i];
            int d = testCase[0];
            int m = testCase[1];
            int y = testCase[2];
            int expectedD = testCase[3];
            int expectedM = testCase[4];
            int expectedY = testCase[5];

            int[] result = nextDay(d, m, y);

            assert result[0] == expectedD && result[1] == expectedM && result[2] == expectedY :
                "Test case " + (i + 1) + " failed: (" + d + ", " + m + ", " + y + ") -> (" +
                result[0] + ", " + result[1] + ", " + result[2] + "), expected (" +
                expectedD + ", " + expectedM + ", " + expectedY + ")";

            System.out.println("Test case " + (i + 1) + " passed.");
        }
    }
}
