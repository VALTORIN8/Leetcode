class Solution {
    public double largestTriangleArea(int[][] points) {//area 1/2 b*h //--ha
        //ya voh 10th class wala 1/2{|x1(y2-y3)+x2(y3-y1)+x3(y1-y2)|}//ye use hoga??//hmm ig pehle wala perpendicular ka hi hai //ha
        int n=points.length; //3 loop??whi soch rha starrt kha se hoga each loop//ek 0 se ek 1 se ek 2 se ?0 then +1 then +1 /ha 
        double maxArea=0;
        for(int i=0;i<n;i++){
            for(int j=1+i;j<n;j++){
                for(int k=j+1;k<n;k++){//idhar i+2??
                    int x1=points[i][0];//ye shi hai?idk ye dekhna hoga//sahi h ig 
                    int y1=points[i][1];
                    int x2=points[j][0];
                    int y2=points[j][1];
                    int x3=points[k][0];
                    int y3=points[k][1];//ig yha k hi hoga
                    double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) +  x3 * (y1 - y2) );
                    maxArea=Math.max(area,maxArea);
                }
            }
        }
        return maxArea;
    }
}