public class DistributeCandies {
    /*
    Given an integer array with even length, where different numbers in this array represent different kinds of candies. Each number means one candy of the corresponding kind. You need to distribute these candies equally in number to brother and sister. Return the maximum number of kinds of candies the sister could gain.
    */
    public int distributeCandies(int[] candies) {
        int unique = 0;
        int size = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < candies.length; i++) {
            set.add(candies[i]);
        }
        unique = set.size();
        size = candies.length/2;
        if (size <= unique) {
            return size;
        }
        return unique;
    }

}
