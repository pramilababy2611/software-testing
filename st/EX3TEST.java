import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class EX3TEST {

    @Test
    public void testEligibleToVote() {
        assertTrue(VotingEligibilityChecker.isEligibleToVote(18));
        assertTrue(VotingEligibilityChecker.isEligibleToVote(25));
        assertTrue(VotingEligibilityChecker.isEligibleToVote(50));

        // You should add more test cases for eligible ages
    }

    @Test
    public void testNotEligibleToVote() {
        assertFalse(VotingEligibilityChecker.isEligibleToVote(17));
        assertFalse(VotingEligibilityChecker.isEligibleToVote(15));
        assertFalse(VotingEligibilityChecker.isEligibleToVote(12));

        // You should add more test cases for non-eligible ages
    }
}
