import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VotingAgeCheckerTest {
    
    @Test
    public void testVotingAgeCheckerWithValidAge() {
        // Arrange
        int age = 20; // Tuổi đủ để bầu cử
        
        // Act
        String result = VotingAgeChecker.checkVotingAge(age);
        
        // Assert
        assertEquals("Bạn đã đủ tuổi để bầu cử.", result);
    }
    
    @Test
    public void testVotingAgeCheckerWithInvalidAge() {
        // Arrange
        int age = 16; // Tuổi không đủ để bầu cử
        
        // Act
        String result = VotingAgeChecker.checkVotingAge(age);
        
        // Assert
        assertEquals("Bạn chưa đủ tuổi để bầu cử.", result);
    }
}
