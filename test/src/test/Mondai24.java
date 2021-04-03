package test;

import java.util.ArrayList;
import java.util.List;

public class Mondai24 {

	public static void main(String[] args) {
		List<MyBean> beanList = new ArrayList<MyBean>();

		MyBean bn1= new MyBean();
		bn1.setName("佐藤");
		bn1.setAge(20);
		beanList.add(bn1);
		MyBean bin2 =new MyBean();
		bin2.setName("鈴木");
		bin2.setAge(25);
		beanList.add(bin2);

		for(MyBean bean:beanList) {
			System.out.println("名前:"+bean.getName());
			System.out.println("年齢:"+bean.getAge());
		}

	}

}
