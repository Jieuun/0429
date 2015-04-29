package arrayUtils;

public class ArrayUtilsTest {

	public static void main(String[] args) {
		int[] intArray1 = {10, 20, 39,46 ,74};
		int[] intArray2 = {3,4,5,2,5,7};
		double [] doubleArray1 = {3.0,4.0};
		
		
		double [] doubleArray2 =  ArrayUtils.intToDouble(intArray1);
		
		int length = doubleArray2.length;
		for(int i =0 ; i<length ; i++){
			System.out.println(doubleArray2[i]);
		}
		
		
		int [] int1 = ArrayUtils.doubleToInt(doubleArray1);
		
		for(int i =0 ; i<int1.length ; i++){
			System.out.println(int1[i]);
		}
		
		int [] con = ArrayUtils.concat(intArray1, intArray2);
		
		for(int i =0 ; i < con.length ; i++){
			System.out.print(con[i]+"\t");
		}
		
		
	}
}
