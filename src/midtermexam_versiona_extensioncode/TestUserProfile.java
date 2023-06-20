import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the User Profile Creator!");

        // Get user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display the list of possible genres
        System.out.println("Select your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Sci-Fi");
        System.out.println("5. Thriller");

        // Get user's choice of genre
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();

        String genre;

        // Assign the selected genre based on the user's choice
        switch (genreChoice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Comedy";
                break;
            case 3:
                genre = "Drama";
                break;
            case 4:
                genre = "Sci-Fi";
                break;
            case 5:
                genre = "Thriller";
                break;
            default:
                genre = "Unknown";
                break;
        }

        // Display the user profile creation message
        System.out.println("\nUser Profile Created!");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + genre);
    }
}
