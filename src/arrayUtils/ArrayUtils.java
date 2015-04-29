package arrayUtils;
public class ArrayUtils {

	static double[] intToDouble(int[] source) {
		int length = source.length;
		double[] doubleArray = new double[length];

		for (int i = 0; i < doubleArray.length; i++) {
			doubleArray[i] = source[i];
		}

		return doubleArray;

	}

	static int[] doubleToInt(double[] source) {

		int length = source.length;

		int[] intArray = new int[length];

		for (int i = 0; i < length; i++) {
			intArray[i] = (int) source[i];
		}

		return intArray;

	}

	static int[] concat(int[] s1, int[] s2) {

		int length = (s1.length) + (s2.length);
		int[] con = new int[length];

		for (int i = 0; i < s1.length; i++) {
			con[i] = s1[i];
		}

		for (int i = s1.length; i < con.length; i++) {
			con[i] = s2[i - s1.length];
		}

		return con;

	}

}
