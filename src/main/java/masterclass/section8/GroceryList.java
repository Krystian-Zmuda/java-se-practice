package masterclass.section8;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " elements");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);

    }

    public void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
        boolean exists = groceryList.contains(searchItem);
        if (exists) {
            return "Item " + searchItem + " exists";
        } else {
            return searchItem + "does not exist";
        }
    }
}
