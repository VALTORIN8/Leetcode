class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String op : operations) {
            X += op.contains("+") ? 1 : -1;
        }
        return X;
    }
}