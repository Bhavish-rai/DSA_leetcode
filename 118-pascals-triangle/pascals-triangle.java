class Solution {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            int coeff = 1;   

            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0) {
                    coeff = 1;
                } else {
                    coeff = coeff * (i - j + 1) / j;  
                }
                row.add(coeff);
            }
            triangle.add(row);
        }


        
        return triangle;
    }
}