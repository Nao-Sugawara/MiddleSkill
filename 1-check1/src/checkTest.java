public class checkTest {
	private static int class_average;

	public static void main(String[] args) {
		//改行
		System.out.println("問1-1");
		//問1 Eclipseでキャメルケース／スネークケースの変換を行うショートカットキーは何ですか？
		//		Ctrl+Alt+K
		//改行
		System.out.println("問2-1");
		//問2 Windowsでファイルを作成する時のショートカットキーは何ですか？
		//       Ctrl + Shift + N
		//改行
		System.out.println("問3-1");
		//問3 対象ファイル”A”を検索するLinuxコマンド
		//		$ find　A
		//改行
		System.out.println("問4-1");
		//問4 アクセス修飾子publicとprivateの違いを簡潔に答えてください
		//		publicなメンバーはどのクラスからでもアクセスでき、privateなメンバーは同じクラス内からのみアクセスできる為、スコープの範囲が大きく違う。
		//改行
		System.out.println("問5-1");
		//問5　あなたはテストを受け、その結果に基づいて成績を付けられます。90点以上ならA、80点以上ならB、70点以上ならC、60点以上ならD、それ以下はFと評価されます。あなたのテストの点数が85点だった場合、あなたの成績は何になりますか？(三項演算子を使用して上記文章を解いてください)
		int score = 85;
		char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
		System.out.println("私の成績は " + grade + " です。");

		//改行
		System.out.println("問6-1");
		//問6　2つの整数を受け取って、それらの割り算の結果を表示するものです。しかし、引数が足りなかったり、整数でなかったり、ゼロ除算が発生した場合には例外が発生します。引数が足りない場合には、「2つのパラメータを指定してください！」と表示する。
		//引数が整数でない場合には、「2つの整数を入力してください！」と表示する。
		//ゼロ除算が発生した場合には、「ゼロ除算が行われました！」と表示する。
		//それ以外の例外が発生した場合には、「その他の例外が発生しました！」と表示する。
	}

	public static void divide(int num1, int num2) {
		try {
			if (num2 == 0) {
				throw new ArithmeticException("ゼロ除算が行われました！");
			}
			int result = num1 / num2;
			System.out.println("割り算の結果: " + result);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("その他の例外が発生しました！");
		}

		{
			//改行
			System.out.println("問7-1");
			//問7　コメントアウトされている箇所にどう言った処理が行われているか記載してください
			class Employee1 {
				private String name;
				private int salary;

				// 
				public void show() {
					System.out.print("私の名前は、" + this.name + "です。");
					System.out.println("私の給与は、" + this.salary + "円です。");
				}

				public Employee1(String name, int salary) {
					this.name = name;
					this.salary = salary;
				}
			}
			// 

			class Sample1 {
				public static void main(String[] args) {
					// 
					Employee1 tanaka = new Employee1("田中一郎", 250000);
					Employee1 suzuki = new Employee1("鈴木花子", 300000);
					// 
					tanaka.show();
					suzuki.show();
				}
			}

			//改行
			System.out.println("問8-1");
			//問8　for文ネストを使用して下記のように出力されるようにコーディングしてください。
			System.out.println("①");

			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}

			System.out.println("②");

			for (int i = 5; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
			//①
			//1
			//12
			//123
			//1234
			//12345

			//②
			//12345
			//1234
			//123
			//12
			//1
		}
	}
}
