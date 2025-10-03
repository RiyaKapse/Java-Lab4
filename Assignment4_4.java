public class Assignment4_4 {
    public static void main(String[] args) {
        String userData = "USERID:riya | FULLNAME:Riya Kapse | ROLE:Admin";

        // Step 1: Extract Full Name
        int fullNameStart = userData.indexOf("FULLNAME:") + "FULLNAME:".length();
        int fullNameEnd = userData.indexOf("|", fullNameStart);
        String fullName = userData.substring(fullNameStart, fullNameEnd).trim();

        // Step 2: Extract Role
        int roleStart = userData.indexOf("ROLE:") + "ROLE:".length();
        String role = userData.substring(roleStart).trim();

        // Bonus: Convert role to lowercase
        role = role.toLowerCase();

        // Step 3: Print results
        System.out.println("Full Name: " + fullName);
        System.out.println("Role: " + role);
    }
}
