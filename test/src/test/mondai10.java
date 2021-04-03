package test;

public class mondai10 {//クラス名がFOOにしていない

	public static void main(String[] args) {
		String str1 = "aaaaa";
		String str2 = new String(str1);
		if (str1 == str2) {
			System.out.println("str1とstr2は等しい");
		} else {
			System.out.println("str1とstr2は等しくない");

		}

	}

}
