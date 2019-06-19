public class PascalTriangle {
    /*
    Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.

    Note that the row index starts from 0.
    */
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> array = new ArrayList<>();
        if (numRows == 0) {
            return pascal;
        }
        array.add(1);
        pascal.add(array);

        if (numRows == 1){
            return pascal;
        }
        array = new ArrayList<>();
        array.add(1);
        array.add(1);
        pascal.add(array);

        if (numRows == 2){
            return pascal;
        }

        int index = 1;

        while (index <= numRows-2) {
            List<Integer> loop = pascal.get(index);
            array = new ArrayList<>();
            array.add(1);
            for (int i = 0; i < loop.size()-1; i++) {
                int num = loop.get(i) + loop.get(i+1);
                array.add(num);
            }
            array.add(1);
            pascal.add(array);
            index++;

        }


        return pascal;

    }

}
