import java.util.Scanner;

public class ToDo {
    public static void PopulateItemArray(Item[] itemArray) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < itemArray.length; ++i) {
            Item item = new Item();
            System.out.print("Task #" + (i + 1) + ": ");
            item.task = scanner.nextLine();
            System.out.print("Priority from 1 (highest) to 5 (lowest): ");
            item.priority = scanner.nextInt();
            scanner.nextLine();
            itemArray[i] = item;
        }
    }

    public static void PrintItemArray(Item[] itemArray) {
        for (int i = 1; i < 6; ++i) {
            for (Item j : itemArray) {
                if (j.priority == i) {
                    System.out.print(j.priority + " ");
                    System.out.println(j.task);
                }
            }
        }
    }

    public static void main(String[] args) {
        int itemObjects = (args.length != 0) ? Integer.parseInt(args[0]) : 5;
        
        Item[] itemArray = new Item[itemObjects];

        PopulateItemArray(itemArray);
        PrintItemArray(itemArray);
    }
}