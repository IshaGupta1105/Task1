import java.util.ArrayList;
import java.util.LinkedList;

public class RemoveElements {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("C");
        linkedList.add("E");

        // Remove all elements present in the LinkedList
        arrayList.removeAll(linkedList);

        // Print output
        System.out.println(arrayList);
    }
}
