// Custom checked exception
class MinorAgeException extends Exception {
    public MinorAgeException(String message) {
        super(message);
    }
}
class VotingMachine {
    // Method to check age and cast vote
    public void castVote(int age) throws MinorAgeException {
        if (age < 18) {
            throw new MinorAgeException("Voter is not eligible to vote.");
        } else {
            System.out.println("Vote cast successfully.");
        }
    }
}


public class Assignment4_3 {
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();

        try {
            vm.castVote(16);  // Underage voter
        } catch (MinorAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
