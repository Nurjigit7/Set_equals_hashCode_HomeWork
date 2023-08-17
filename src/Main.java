import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        Set<Integer> set = new HashSet<>();
        set.add(0);
        set.add(1);
        set.add(2);
        System.out.println(symmetricDifference(integers, set));

    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();
        for (Integer s1 : set1) {
            if (!set2.contains(s1)) {
                result.add(s1);
            }
        }
        for (Integer s2 : set2) {
            if (!set1.contains(s2)) {
                result.add(s2);
            }
        }
        return result;
    }
}
