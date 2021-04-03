package test;

public class mondai10_2 {

	public static void main(String[] args) {
		String str1 = "aaaaa";
		String str2 = new String(str1);
		String str3 = "aaaaa";
		if (str1 == str2) {
			System.out.println("str1とstr2は等しい");
		} else {
			System.out.println("str1とstr2は等しくない");
		}
		if (str1 == str3) {
			System.out.println("str1とstr3は等しい");
		} else {
			System.out.println("str1とstr3は等しくない");
		}
		if (str1.equals(str2)) {
			System.out.println("str1とstr2は等しい");
		} else {
			System.out.println("str1とstr2は等しくない");
		}

	}

}
