import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static List<String> myRecipes = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("==== Recipe Management System ====");

            System.out.println("1. Add a New Recipe");
            System.out.println("2. View All Recipes");
            System.out.println("3. Search Recipe by Name");
            System.out.println("4. Delete a Recipe");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");

            int choices = scanner.nextInt();
            scanner.nextLine();

            // i want to modify this later
            switch (choices) {
                case 1:
                    AddRecipe();
                    break;
                case 2:
                    ShowAllRecipies();
                    break;
                case 3:
                    DeleteRecipe();
                    break;
                default:
                    System.out.println("Invalid choice, please choose again");
            }
        }
    }


    static void AddRecipe() {

        System.out.println("Enter recipe name: ");
        String recName = scanner.nextLine();

        myRecipes.add(recName);
    }

    // will see back all of these functions
    static void ShowAllRecipies() {

        for (int i = 0; i < myRecipes.size(); i++) {
            System.out.println("All Recipes: " + myRecipes.get(i));
        }
    }

    static void DeleteRecipe() {

        System.out.println("Enter which number of recipe u would like to delete: ");
        String foodDel = scanner.nextLine();

        for (int i = 0; i < myRecipes.size(); i++) {
            if (myRecipes.get(i) == foodDel) {
                myRecipes.remove(foodDel);
            }
        }
    }

}


