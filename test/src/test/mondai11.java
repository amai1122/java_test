package test;

import java.time.LocalDateTime;

public class mondai11 {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();

		String str = "年,月,日";

		String[] splStr = str.split(",");

		for (String s : splStr) {

			System.out.println(s);

		}
		int year = ldt.getYear();
		int month = ldt.getMonthValue();
		int day = ldt.getDayOfMonth();

		System.out.println(year + splStr[0] + month + splStr[1] + day + splStr[2]);

	}

}
