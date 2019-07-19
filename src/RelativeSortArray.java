public class RelativeSortArray {
/*
Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.  Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.



Example 1:

Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]
*/

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], map.getOrDefault(arr2[i], -1) + 1);
        }


        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) +1);
            }
            else {
                list.add(arr1[i]);
            }
        }

        Collections.sort(list);
        int index = 0;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = index; j < map.get(arr2[i]) + index; j++) {
                answer[j] = arr2[i];

            }
            index += map.get(arr2[i]);
        }

        for (int i = 0 ; i < list.size(); i++) {
            answer[index++] = list.get(i);
        }

        return answer;

    }

}
