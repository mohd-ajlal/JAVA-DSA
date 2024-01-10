import java.util.*;
public class setExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(20);
//        value will not repeat but it will be in any order
        System.out.println(set);

        Set<Integer> set1 = new LinkedHashSet<>();
//        value will not repeat
        set1.add(10);
        set1.add(10);
        set1.add(20);
        System.out.println(set1);
        System.out.println(set.contains(10));

        List<Integer> li = new ArrayList<>(set);
//        int num = [10,20,30,10,20,10,20,50];
//        Set<Integer> set2 = new LinkedHashSet<>(num);
        System.out.println(li);
//        System.out.println(set2);
    }
}
