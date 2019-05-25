import java.util.HashMap;

public class FindAnagramMappings {
    /* Given two lists A and B, and B is an anagram of A. B is an anagram of A means B is made by randomizing the order of the elements in A.

We want to find an index mapping P, from A to B. A mapping P[i] = j means the ith element in A appears in B at index j.

These lists A and B may contain duplicates. If there are multiple answers, output any of them.
*/



    public int[] anagramMappings(int[] A, int[] B) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] array = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            hash.put(B[i] , i);
        }
        int t = 0;
        for (int i = 0; i < A.length; i++) {

            array[t] = hash.get(A[i]);
            t++;


        }
        return array;

    }
}

