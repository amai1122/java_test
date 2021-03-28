package techfun.matefialmanagement.purchase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetSupplierName {

	public static void main(String[] args) {

		System.out.println("プログラム「GetSupplierName」の処理を開始します");

		//納品予定ファイルを読みだしてListとbeanに格納
		GetSupplierName newDeli=new GetSupplierName();
		newDeli.yomikomiList();

		//仕入れ先情報を読みだしてMapに格納
		newDeli.yomikomiMap();

		//マップとbeanから納品予定ファイルを更新する
		newDeli. newShiire();



		//更新した納品予定ファイルをファイルに書き出す

		//


		System.out.println("プログラム「GetSupplierName」の処理を終了します");
	}

	void yomikomiList() {//納品予定ファイルの読込
		//リストのインスタンス化
		List<DeliveryBean> deliList = new ArrayList<DeliveryBean>();

		BufferedReader br1 = null;//読込バッファの初期化

		try {
			//納品予定ファイルを読み込み

			br1 = new BufferedReader(new FileReader(
					"C:\\Users\\P056_amai\\Documents\\java研修\\01_TechFun\\02_実践演習\\01_Java基礎\\使用ファイル\\実習1\\DELIVERY_PLANS.txt"));
			String str = null;//読み出し行の初期化
			while ((str = br1.readLine()) != null) {//strに1行入れて内容がある間ループ
				DeliveryBean bean1 = new DeliveryBean();//beanのインスタンス化（beanには１ライン分のデータを格納するためループ内にインスタンス化が必要）
				String[] splbean = str.split(",");//strを,で区切って配列splbeanに格納
				//配列をbeanに格納
				bean1.setBuyerCd(splbean[0]);
				bean1.setComponentCd(splbean[1]);
				bean1.setSupplierCd(splbean[2]);
				bean1.setSupplierNe(splbean[3]);
				bean1.setOrderQty(Integer.parseInt(splbean[4]));//発注数量はint型なのでintに変換して格納

				deliList.add(bean1);//リストに１ライン分のデータをbeanで入れる
			}

		} catch (IOException e) {
			//納品予定ファイルオープン時の読込失敗時の例外処理
			e.printStackTrace();

		} finally {
			if (br1 != null) {//バッファに何もないことを確認して閉じる
				try {
					br1.close();//読み込んだファイルを閉じる
				} catch (IOException e) {
					//納品予定ファイルクローズ時の例外処理内容を表示
					e.printStackTrace();
				}
			}

		}

	}

	void yomikomiMap() {//仕入れ先情報の読込

		String supplierCD = null;
		String supplierNm = null;

		//マップのインスタンス化
		Map<String, String> deliMap = new HashMap<String, String>();
		BufferedReader br2 = null;//読込バッファの初期化

		try {
			//仕入れ先ファイルの読込(インスタンス化も同時に行っている)
			br2 = new BufferedReader(new FileReader(
					"C:\\Users\\P056_amai\\Documents\\java研修\\01_TechFun\\02_実践演習\\01_Java基礎\\使用ファイル\\実習1\\SUPPLIER.txt"));
			String delstr = null;

			while ((delstr = br2.readLine()) != null) {//delstrにデータを１ライン入れてデータがある間ループ
				supplierCD = delstr.substring(0, 8);//substring(取り出し開始インデックス」,終了文字数)
				supplierNm = delstr.substring(8, 48);

				deliMap.put(supplierCD, supplierNm);//マップに格納
			}
		} catch (IOException e) {
			//読込時の例外処理
			e.printStackTrace();
		} finally {
			if (br2 != null) {
				try {
					br2.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
	void newShiire() {

//		for(DeliveryBean deliveryBean) {

//		}
	}


}
