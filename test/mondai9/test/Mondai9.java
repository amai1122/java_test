package test;

public class mondai9 {//クラス名"FOO"にしていない

	public static void main(String[] args) {
		int x = 1;
		mondai9 a = new mondai9();

		a.addBar(x);

		System.out.println(x);

		System.out.println(a.getBar());

	}

	private int bar;

	/* コンストラクタ*/
	public mondai9() {
		bar = 0;
	}

	/**フィールドbarに引数を加算する*/
	public void addBar(int bar) {
		this.bar = this.bar + bar;
	}

	/*フィールドbarを取得「する*/
	public int getBar() {
		return bar;
	}

}
