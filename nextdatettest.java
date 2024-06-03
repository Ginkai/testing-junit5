public class NextDayCalculatorTest {

    public static void main(String[] args) {
        // Các trường hợp kiểm thử
        int[][] testCases = {
            {15, 6, 2021, 16, 6, 2021},   // Ngày bình thường
            {31, 1, 2021, 1, 2, 2021},    // Cuối tháng 1
            {30, 4, 2021, 1, 5, 2021},    // Cuối tháng 4
            {31, 12, 2021, 1, 1, 2022},   // Cuối tháng 12
            {28, 2, 2021, 1, 3, 2021},    // Tháng 2 không phải năm nhuận
            {28, 2, 2020, 29, 2, 2020},   // Tháng 2 năm nhuận
            {29, 2, 2020, 1, 3, 2020},    // Ngày cuối cùng của tháng 2 trong năm nhuận
            {10, 11, 2021, 11, 11, 2021}  // Ngày bình thường trong tháng 11
        };

        for (int i = 0; i < testCases.length; i++) {
            int[] testCase = testCases[i];
            int d = testCase[0];
            int m = testCase[1];
            int y = testCase[2];
            int expectedD = testCase[3];
            int expectedM = testCase[4];
            int expectedY = testCase[5];

            int[] result = NextDayCalculator.nextDay(d, m, y);

            assert result[0] == expectedD && result[1] == expectedM && result[2] == expectedY :
                "Test case " + (i + 1) + " failed: (" + d + ", " + m + ", " + y + ") -> (" +
                result[0] + ", " + result[1] + ", " + result[2] + "), expected (" +
                expectedD + ", " + expectedM + ", " + expectedY + ")";

            System.out.println("Test case " + (i + 1) + " passed.");
        }
    }
}
