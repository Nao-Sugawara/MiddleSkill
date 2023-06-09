import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");

		//問題1:下記の条件を使ってfor文と条件文を組み合わせ結果が同じになるよう出力しなさい。for文ネスト3回（3回forを書くこと）
		//strArray1でfor文を回し3文字目(k)以降のものをstrArray2に格納する(1個目のfor文)
		//strArray2でfor文を回しkとaとoの物だけでstrArray3に格納する(2個目のfor文)
		//strArray3でfor文を回し「kakao」となるようにstrArray4に格納しstrArray4を出力する。(3個目のfor文)
		List<String> strArray1 = new ArrayList<>(
				Arrays.asList("f", "u", "k", "u", "d", "a", "k", "a", "n", "e", "k", "o"));
		List<String> strArray2 = new ArrayList<>();
		List<String> strArray3 = new ArrayList<>();
		List<String> strArray4 = new ArrayList<>();

		for (int i = 2; i < strArray1.size(); i++) {
			strArray2.add(strArray1.get(i));

			for (String s : strArray2) {
				if (s.equals("k") || s.equals("a") || s.equals("o")) {
					strArray3.add(s);
				}

				for (int i2 = 0; i2 < strArray3.size() - 3; i2++) {
					if (strArray3.get(i2).equals("k") && strArray3.get(i2 + 1).equals("a")
							&& strArray3.get(i2 + 2).equals("k")
							&& strArray3.get(i2 + 3).equals("o")) {
						strArray4.add("kakao");
					}
				}
			}
		}

		System.out.println(strArray4);
	}
}
