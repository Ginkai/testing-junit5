import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testSumEvenNumbersGreaterThan10() {
        // Arrange
        int[] numbers = {2, 4, 6};
        int expectedSum = 12;

        // Act
        int actualSum = Main.calculateSumOfEvenNumbers(numbers);

        // Assert
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumEvenNumbersLessThanOrEqualTo10() {
        // Arrange
        int[] numbers = {1, 2, 3, 4};
        int expectedSum = 6;

        // Act
        int actualSum = Main.calculateSumOfEvenNumbers(numbers);

        // Assert
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumWithNoEvenNumbers() {
        // Arrange
        int[] numbers = {1, 3, 5};
        int expectedSum = 0;

        // Act
        int actualSum = Main.calculateSumOfEvenNumbers(numbers);

        // Assert
        assertEquals(expectedSum, actualSum);
    }
}
