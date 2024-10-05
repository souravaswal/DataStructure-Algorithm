/**
Need to find out, if a vehicle would be able to travel with the amount of fuel
**/

public class GasStation {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int canCompleteCircuit(final int[] A, final int[] B) {
        for(int i=0; i<A.length; i++)
        {
            int amountOfGas = 0;
            int gasNeeded = 0;
            int length = 0;
            int j = i;
            
            // As we are being greedy hence, we will return the first index which satisfies our need
            while(length != B.length)
            {
                if(j >= B.length)
                {
                    j = j%B.length;
                }
                //Adding gas from each station & adding it in amountOfGas & check for each gas pump
                amountOfGas+=A[j];
                gasNeeded+=B[j];
                if(amountOfGas < gasNeeded)
                {
                    break;
                }
                j++;
                length++;
            }
            // Checks if amountOfGas was more than gasNeeded at the end of the loop.
            if(amountOfGas >= gasNeeded)
            {
                return i;
            }
        }
        return -1;
    }
}