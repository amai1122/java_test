package test;

public class Mondai5 {

	public static void main(String[] args) {
		int result = 0;
		int i = 0;
		while (i < 5) {
			i++;
			if (i % 2 == 0) {
				continue;
			}
			result = result + i;
		}
		System.out.println("result=" + result);

	}

}
