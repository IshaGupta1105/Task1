import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;

public class MergeLists {
    public static void main(String[] args) {

        // Sample ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        // Sample LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");

        // Use HashSet to avoid duplicates
        HashSet<String> set = new HashSet<>();

        // Add all elements
        set.addAll(arrayList);
        set.addAll(linkedList);

        // Convert merged unique data back into LinkedList
        LinkedList<String> finalList = new LinkedList<>(set);

        // Print final list
        System.out.println("Merged LinkedList without duplicates: " + finalList);
    }
}

