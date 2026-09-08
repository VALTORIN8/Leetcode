class Solution {
    public int findMinDifference(List<String> timePoints) {
        //how?//for loop se diff nikalte jayenge ig//oh
        //min diff //ai help lu? 
        //ye string ke ques merese sahi se hote nhi princess chill maar//jo princess bole
        int arr[] = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            String s = timePoints.get(i);
            int hour = Integer.parseInt(s.substring(0, 2));
            int min = Integer.parseInt(s.substring(3, 5));
            arr[i] = hour * 60 + min;

        }
        Arrays.sort(arr);//plk wrong answer a rha pal pal pal glt ans
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            ans = Math.min(ans, arr[i] - arr[i - 1]);
        }
        ans = Math.min(ans, 1440 - arr[arr.length - 1] + arr[0]);

        return ans;
    }
}