import java.util.*;
/**
 * Main Class
 *
 */
public class PolygonCheck {
	/**
	 * This method checks whether a polygon can be formed with given side lengths
	 * @param arrLen The array that contains the lengths of sides of polygon
	 * @return whether the polygon can be formed or not
	 */
	public static boolean polyCheck(int[] arrLen) {
		int max_val = 0, sum = 0;
		for(int i=0;i<arrLen.length;i++) {
			sum += arrLen[i];
			max_val = Math.max(max_val, arrLen[i]);
		}
	if((sum-max_val)>max_val)
		return true;
	return false;
	}
	/**
	 * Check whether the formed polygon is regular or not
	 * @param arrLen  The array that contains the lengths of sides of polygon
	 * @return whether is polygon is regular or not
	 */
	public static boolean checkRegPoly(int[] arrLen) {
		boolean poly = polyCheck(arrLen);
		if(poly){
			int first = arrLen[0];
			for(int i=1;i<arrLen.length;i++){
				if(arrLen[i]!=first)
					return false;
			}
		}
		return true;
	}
	/**
	 * Function to perform operations on regular polygons
	 * @param arrLen  The array that contains the lengths of sides of polygon
	 */
	public static void regPoly(int[] arrLen) {
		int n=arrLen.length;
		int sum = 0;
		for(int i=0;i<arrLen.length;i++) {
			sum += arrLen[i];
		}
		double area, perimeter, interior, exterior,side = arrLen[0];
		area = (n*Math.pow(side, 2))/4*(Math.tan((Math.PI)/n));
		perimeter = side*n;
		interior = (n-2)*180;
		exterior = 360/n;
		System.out.println("Area - " + area + "\nPerimeter - " + perimeter + "\nSum of Interior Angles - " + interior + "\nSum of Exterior Angles - " + exterior);
	}
	/**
	 * Function to perform operations on non regular polynomials
	 * @param arrLen  The array that contains the lengths of sides of polygon
	 */
	public static void irregPoly(int[] arrLen) {
		int n=arrLen.length;
		int sum = 0;
		for(int i=0;i<arrLen.length;i++) {
			sum += arrLen[i];
		}
		double perimeter, diagonals;
		perimeter = sum;
		diagonals = (Math.pow(n, 2) - 3*n)/2;
		System.out.println("\nPerimeter - " + perimeter + "\nNumber of Diagonals " + diagonals);
	}
	/**
	 * Driver Function
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] sides = new int[n];
		for(int i=0;i<n;i++) {
			sides[i] = sc.nextInt();
		}
		boolean isPoly = polyCheck(sides);
		if(isPoly){
			boolean regular = checkRegPoly(sides);
			if(regular)
				regPoly(sides);
			else
				irregPoly(sides);
		}
	}
}
