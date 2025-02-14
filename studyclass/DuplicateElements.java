import java.util.HashSet;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3};
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.println("Duplicate found: " + num);
            }
        }
    }
}
