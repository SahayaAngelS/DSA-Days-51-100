import java.util.Arrays;

public class eraseOverlapIntervals {
    public int EraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int count=0;
        int preval=Integer.MIN_VALUE;
        for(int []inter:intervals)
        {
            if(inter[0]>=preval)
            {
                count++;
                preval=inter[1];
            }
        }
        return intervals.length-count;
    }
}
