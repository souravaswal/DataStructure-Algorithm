import java.util.*;
public class HexBinOctConvert {
	/**
	 * Function that converts the number to Octal
	 * @param s The resultant number
	 * @return Octal Representation of the resultant number
	 */
	public static String converttoOctal(int s) {
		return (Integer.toOctalString(s));
	}
	/**
	 * Function that converts the number to Hexadecimal
	 * @param s The resultant number
	 * @return Hexadecimal Representation of the resultant number
	 */
	public static String converttoHex(int s) {
		return (Integer.toHexString(s));
	}
	/**
	 * Function that converts the number to binary
	 * @param s The resultant number
	 * @return Binary Representation of the resultant number
	 */
	public static String converttoBin(int s) {
		return (Integer.toBinaryString(s));
	}
	/**
	 * Function to perform required mathematical operations i.e. trigonometric or logarithmic
	 * @param s the resultant number
	 */
	public static void mathOperations(int s) {
		Double d1= Double.valueOf(s);
		if(s%2==0) {
			System.out.println(Math.sin(Math.toRadians(d1)));
			System.out.println(Math.cos(Math.toRadians(d1)));
			System.out.println(Math.tan(Math.toRadians(d1)));
		}
		else {
			System.out.println(Math.log(d1));
			System.out.println(Math.log10(d1));
		}
	}
	/**
	 * Function to get the resulting number from the string
	 * @param s The actual string
	 * @return the resultant number after extraction and concatenation
	 */
	public static int getResultingNumber(String s) {
		char[] str = s.toCharArray();
		String resNumber="";
		for(int i=0;i<str.length;i++) {
			if(Character.isDigit(str[i])) {
				resNumber=resNumber + Character.toString(str[i]);
			}
		}
		int finalNumber = Integer.parseInt(resNumber);
		return finalNumber;
	}
	/**
	 * The driver function
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		sc.close();
		String octal,hex,binary;
		int number = getResultingNumber(s1);
		octal = converttoOctal(number);
		hex = converttoHex(number);
		binary = converttoBin(number);
		System.out.print(octal + "\n" + hex + "\n" + binary + "\n");
		mathOperations(number);
	}
}
