import java.util.Scanner;

public class ToDo {
    public static void PopulateItemArray(Item[] itemArray) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < itemArray.length; ++i) {
            
            System.out.print("Task #" + (i + 1) + ": ");
            String itemTask = scanner.nextLine();
            System.out.print("Priority from 1 (highest) to 5 (lowest): ");
            int itemPriority = scanner.nextInt();
            scanner.nextLine();
            Item item = new Item(itemTask, itemPriority);
            itemArray[i] = item;
        }
    }

    public static void PrintItemArray(Item[] itemArray) {
        for (int i = 1; i < 6; ++i) {
            for (Item j : itemArray) {
                if (j.isPriority(i)) {
                    System.out.println(j);
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