class Solution {
    public double angleClock(int hour, int minutes) {
        double result=0.0;
        double angle1=(hour%12)*30+minutes*0.5;

        double angle2=minutes*6;
        result=Math.abs(angle1-angle2);
        result=Math.min(result,360-result);
        return result;
    }
}