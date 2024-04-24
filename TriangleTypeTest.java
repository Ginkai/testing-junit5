import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTypeTest {

    @Test
    public void testEquilateralTriangle() {
        assertTrue(TriangleType.isEquilateral(3, 3, 3));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertTrue(TriangleType.isIsosceles(3, 3, 2));
    }

    @Test
    public void testRightTriangle() {
        assertTrue(TriangleType.isRightTriangle(3, 4, 5));
    }

    @Test
    public void testScaleneTriangle() {
        assertFalse(TriangleType.isEquilateral(3, 4, 5));
        assertFalse(TriangleType.isIsosceles(3, 4, 5));
        assertFalse(TriangleType.isRightTriangle(3, 4, 5));
    }

    @Test
    public void testNotATriangle() {
        assertFalse(TriangleType.isTriangle(1, 2, 10));
    }
}
