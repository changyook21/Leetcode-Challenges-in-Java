public class NestedListWeightSum {

/*
Given a nested list of integers, return the sum of all integers in the list weighted by their depth.

Each element is either an integer, or a list -- whose elements may also be integers or other lists.
*/


    public int depthSum(List<NestedInteger> nestedList) {
        return getNested(nestedList, 1);

    }
    public int getNested(List<NestedInteger> nestedList, int level) {
        int total = 0;

        while (nestedList.size() != 0) {
            if (nestedList.get(0).isInteger()) {
                total += nestedList.get(0).getInteger() * level;
                nestedList.remove(0);
            }
            else {
                total += getNested(nestedList.get(0).getList(), level + 1);
                nestedList.remove(0);
            }
        }
        return total;

    }

}
