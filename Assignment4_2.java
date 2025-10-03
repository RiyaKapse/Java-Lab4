  
public class Assignment4_2 {

    // Method to check speed
    public void checkSpeed(int speed) {
        if (speed > 100) {
            // Throw an exception if rule is broken
            throw new ArithmeticException("Speed limit exceeded!");
        } else {
            System.out.println("Speed is normal.");
        }
    }

    
    public static void main(String[] args) {
        SpeedController sc = new SpeedController();

        try {
            // Safe speed
            sc.checkSpeed(80);

            // Unsafe speed
            sc.checkSpeed(120);
        } catch (ArithmeticException e) {
            // Handle the thrown exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}
