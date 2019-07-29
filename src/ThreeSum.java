public class ThreeSum {
    /*
    Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

    Note:

    The solution set must not contain duplicate triplets.

    Example:

    Given array nums = [-1, 0, 1, 2, -1, -4],

    A solution set is:
    [
      [-1, 0, 1],
      [-1, -1, 2]
    ]
    */
    public List<List<Integer>> threeSum(int[] nums) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        List<List<Integer>> total = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(j);
                map.put((nums[i] + nums[j]), list);

            }


            for (int j = 0; j < nums.length; j++) {
                int val = -nums[j];

                if (map.containsKey(val) && !map.get(val).contains(j)) {
                    map.get(val).add(j);

                    for (int k = 0; k < 3; k++) {
                        map.get(val).set(k, nums[map.get(val).get(k)]);
                    }

                    Collections.sort(map.get(val));
                    if (total.contains(map.get(val))) {
                        map.remove(val);
                        continue;
                    }
                    total.add(map.get(val));
                    map.remove(val);
                }
            }
        }
        return total;
    }

}
