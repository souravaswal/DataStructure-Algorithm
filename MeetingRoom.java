// Meeting room solution
public class Solution {
    public int solve(int[][] A) {
        int startTime[] = new int[A.length];
        int endTime[] = new int[A.length];
        for(int i=0; i<A.length; i++)
        {
            startTime[i] = A[i][0];
            endTime[i] = A[i][1];
        }
        Arrays.sort(startTime);
        Arrays.sort(endTime);
        int i = 1;
        int j = 0;
        int onGoingMeetings = 1;
        int minRoomsNeeded = 1;
        while(i < startTime.length && j < startTime.length)
        {
            if(startTime[i] < endTime[j])
            {
                onGoingMeetings++;
                if(minRoomsNeeded < onGoingMeetings)
                {
                    minRoomsNeeded = onGoingMeetings;
                }
                i++;
            }
            else
            {
                onGoingMeetings--;
                j++;
            }
            
        }
        return minRoomsNeeded;
    }
}
