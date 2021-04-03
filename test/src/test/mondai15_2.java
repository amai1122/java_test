package test;

public class mondai15_2 extends mondai15_1 {

	public int[] multiplyResult() {
		int[] arr = super.multiplyResult();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 2;
		}
		return arr;
	}

}
