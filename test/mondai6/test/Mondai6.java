package test;

public class Mondai6 {

	public static void main(String[] args) {
		String star = "☆";
		int height = 10;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < (height - i); j++) {
				System.out.print("　");
			}
			for (int j = 0; j < (i * 2 + 1); j++) {
				System.out.print(star);
			}
			System.out.println("");

		}

	}

}
