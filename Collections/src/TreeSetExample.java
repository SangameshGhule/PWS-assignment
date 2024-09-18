import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(10);

        // Displaying the TreeSet
        System.out.println("TreeSet elements: " + treeSet);

        // Adding a duplicate element
        boolean added = treeSet.add(6); // This will not be added
        System.out.println("Element 8 added successfully? " + added);

        // Checking if an element exists
        boolean contains = treeSet.contains(2);
        System.out.println("TreeSet contains element 2? " + contains);

        // Removing an element
        boolean removed = treeSet.remove(5);
        System.out.println("Element 5 removed successfully? " + removed);

        // Displaying the TreeSet after modifications
        System.out.println("TreeSet elements after modifications: " + treeSet);


        int index = 2; // Index we want to fetch (3rd element in 0-based index)

        Iterator<Integer> iterator = treeSet.iterator();
        int i=0;
        while(i<=index){
            if (iterator.hasNext()) {
                int element = iterator.next();
                if (i == index) {
                    treeSet.remove(i);
                    System.out.println("Element at index " + index + ": " + element);
                    break;
                }
            } else {
                System.out.println("Index " + index + " is out of bounds.");
                break;
            }
            i++;
        }


        // Convert TreeSet to an array
        Object[] arr = treeSet.toArray();

        // Accessing element at index 2
        if (index >= 0 && index < arr.length) {
            int element = (int) arr[index];
            System.out.println("Element at index " + index + ": " + element);
        } else {
            System.out.println("Index " + index + " is out of bounds.");
        }


        Set<Integer> treeSet1 = new CopyOnWriteArraySet<>();
        treeSet1.add(1);
        treeSet1.add(2);
        treeSet1.add(3);

        Iterator<Integer> iterator1 = treeSet1.iterator();
        while (iterator1.hasNext()) {
            Integer element = iterator1.next();
            if (element == 2) {
                // This will throw ConcurrentModificationException
                treeSet1.remove(element);
            }
        }

    }



}
