package Mondai14.copy;

public class Bar extends Foo {
	public void print(Foo f) {
		super.print();
		print();
		f.print();
	}

	public void print() {
		System.out.println("I am Bar");
	}
}
