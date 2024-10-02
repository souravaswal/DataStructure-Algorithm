import java.util.*;
/**
 * The class declaration for the second question
 * Program to shift the characters of the string based on the index of a substring
 */
public class ShiftCharacters{
	/**
	 * The function encode is used for shifting the string by 'k' characters
	 * 'k' is defined as the index of the substring sub in string s1 
	 * @param sub is the substring
	 * @param s1 is the main string
	 * @return returns the final string after shifting the characters
	 */
	public static String encode(String sub, String s1){
        int size = 0;
        // Fetch positions of the sub-string in the Actual string
        for (int i = 0; i < s1.length() - sub.length() + 1; i++) {
            if (s1.substring(i, i + sub.length()).equals(sub)) {
                size++;
            }
        }     
        int pos[] = new int[size];
        int inc = 0;
        for (int i = 0; i < s1.length() - sub.length() + 1; i++) {
            // Condition to check if pattern matches
            if (s1.substring(i, i + sub.length()).equals(sub)) {
                pos[inc] = i;
                ++inc;
            }
        }
        // Logic to increment the value of characters of the array
        int count = 0;
        char[] array = s1.toCharArray();
        for(int i=0; i<s1.length(); i++){
            if(count <= pos.length-1 && i==pos[count]) 
            {
                count++;
            } 
            array[i]=(char)(s1.charAt(i) + count);
  
        }
        return String.valueOf(array);  
        }

    /**
     * The driver function for the program
     * @param args
     */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String sub = sc.nextLine();
		sc.close();
	    System.out.println(encode(sub, s1));
	}
}
