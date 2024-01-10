import java.util.*;

public class listExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        System.out.println(fruits);

        String[] arr = {"Banana", "Orange", "mango"};
        //        for(String str:arr){
//            fruits.add(str);
//        }
        fruits.addAll(Arrays.asList(arr));


        System.out.println(fruits);

        fruits.add(2, "Graphs");
        System.out.println(fruits);
        fruits.remove("Banana");
        System.out.println(fruits);
        int size = fruits.size();
        System.out.println("Size: "+size);
        fruits.set(0, "Peach");
        String elementAtIndex = fruits.get(1);
        boolean isEmpty = fruits.isEmpty();
        System.out.println(isEmpty);
        boolean containsMango = fruits.contains("Mango");
        System.out.println(containsMango);

        int indexOfMango = fruits.indexOf("Mango");
        System.out.println(indexOfMango);

        List<String> sublist = fruits.subList(1,3);
        System.out.println(sublist);

    }
}
