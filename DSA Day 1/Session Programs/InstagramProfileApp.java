import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {

    private final long userId;
    private final String username;
    private final String fullName;
    private final String bio;
    private final boolean privateAccount;

    public User(
            long userId,
            String username,
            String fullName,
            String bio,
            boolean privateAccount
    ) {
        this.userId = userId;
        this.username = username;
        this.fullName = fullName;
        this.bio = bio;
        this.privateAccount = privateAccount;
    }

    public String getUsername() {
        return username;
    }

    public void displayProfile() {
        System.out.println("\n---------------------------");
        System.out.println("User ID: " + userId);
        System.out.println("Username: @" + username);
        System.out.println("Full Name: " + fullName);
        System.out.println("Bio: " + bio);

        if (privateAccount) {
            System.out.println("Account Type: Private");
        } else {
            System.out.println("Account Type: Public");
        }

        System.out.println("---------------------------");
    }
}

public class InstagramProfileApp {

    /*
     * username -> User object
     *
     * Example:
     * "nidhish" -> User information
     */
    private static final Map<String, User> usersByUsername =
            new HashMap<>();

    private static long nextUserId = 1001;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Mini Instagram =====");
            System.out.println("1. Create Profile");
            System.out.println("2. Search Profile");
            System.out.println("3. Display All Profiles");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {

                case 1:
                    createProfile(scanner);
                    break;

                case 2:
                    searchProfile(scanner);
                    break;

                case 3:
                    displayAllProfiles();
                    break;

                case 4:
                    System.out.println("Application closed.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Please choose an option from 1 to 4.");
            }
        }
    }

    private static void createProfile(Scanner scanner) {

        System.out.print("Enter username: ");
        String username = scanner.nextLine()
                .trim()
                .toLowerCase();

        if (!isValidUsername(username)) {
            System.out.println(
                    "Username must contain at least 3 characters. "
                            + "Only letters, digits and underscore are allowed."
            );
            return;
        }

        /*
         * HashMap containsKey() checks whether the username
         * already exists.
         *
         * Average time complexity: O(1)
         */
        if (usersByUsername.containsKey(username)) {
            System.out.println("This username is already taken.");
            return;
        }

        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine().trim();

        System.out.print("Enter bio: ");
        String bio = scanner.nextLine().trim();

        System.out.print("Make account private? Enter yes or no: ");
        String privateInput = scanner.nextLine().trim();

        boolean privateAccount =
                privateInput.equalsIgnoreCase("yes");

        User newUser = new User(
                nextUserId,
                username,
                fullName,
                bio,
                privateAccount
        );

        /*
         * Store the User object using username as the key.
         */
        usersByUsername.put(username, newUser);

        nextUserId++;

        System.out.println("Profile created successfully.");
        newUser.displayProfile();
    }

    private static void searchProfile(Scanner scanner) {

        System.out.print("Enter username to search: ");

        String username = scanner.nextLine()
                .trim()
                .toLowerCase();

        /*
         * HashMap lookup:
         * username -> User
         *
         * Average time complexity: O(1)
         */
        User user = usersByUsername.get(username);

        if (user == null) {
            System.out.println("Profile not found.");
            return;
        }

        user.displayProfile();
    }

    private static void displayAllProfiles() {

        if (usersByUsername.isEmpty()) {
            System.out.println("No profiles have been created.");
            return;
        }

        System.out.println("\nAll Profiles:");

        for (User user : usersByUsername.values()) {
            user.displayProfile();
        }
    }

    private static boolean isValidUsername(String username) {

        if (username.length() < 3) {
            return false;
        }

        for (char character : username.toCharArray()) {

            boolean validCharacter =
                    Character.isLetterOrDigit(character)
                            || character == '_';

            if (!validCharacter) {
                return false;
            }
        }

        return true;
    }
}