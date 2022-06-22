class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
               HashMap<Integer, Integer> duplicates = new HashMap<>();
        ArrayList<Integer> intersect = new ArrayList<Integer>();
        for (int j = 0; j < nums1.length; j++) {
            if (!duplicates.containsKey(nums1[j])) {
                duplicates.put(nums1[j], 0);
            }
        }
        for (int j = 0; j < nums2.length; j++) {
            if (duplicates.containsKey(nums2[j])) {
                if (duplicates.get(nums2[j]) == 0) {
                    intersect.add(nums2[j]);
                    duplicates.replace(nums2[j], -1);
                }
            }
        }
        return intersect.stream().mapToInt(x -> x).toArray();

    }
}