import java.util.*;

public class IntersectionArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> intersection = new ArrayList<>();

        // Count frequency of elements in nums1
        for (int num : nums1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find common elements and update frequency
        for (int num : nums2) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                intersection.add(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }

        // Convert list to array
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        IntersectionArrays solution = new IntersectionArrays();

        // Test cases
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(solution.intersect(nums1, nums2)));

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(solution.intersect(nums3, nums4))); 
    }
}
