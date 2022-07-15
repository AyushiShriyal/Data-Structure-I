iven an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        if (numRows < 1) {
            return res;
        }
        
        
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        res.add(row1);
        
        if (numRows < 2) {
            return res;
        }
        
        List<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(1);
        res.add(row2);
        
        if (numRows < 3) {
            return res;            
        }
        
        
        for (int i = 2; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
        
            for (int x = 1; x < i; x++) {
                row.add(x, res.get(i-1).get(x-1) + res.get(i-1).get(x));
            }
            row.add(1);
            res.add(row);            
        }
        return res;
    }
}