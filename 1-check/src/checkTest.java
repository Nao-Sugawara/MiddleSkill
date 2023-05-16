+import java.util.Scanner;
import java.util.logging.Logger;

public class checkTest {

	//問7用
	private static final Logger LOGGER = Logger.getLogger(checkTest.class.getName());

	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問1 リソースを開く(ファイル名)ショートカットキーは何ですか？
		//        command+shift+R
		//改行
		System.out.println("問２");
		//問2 リファクタリングをする時のショートカットキーは何ですか？
		//        command+option+T
		//改行
		System.out.println("問３");
		//問3 デバッグを行う方法を簡潔に記載してください
		//		動きを確認したい箇所にブレークポイントを置き、デバッカを使用
		//改行
		System.out.println("問４");
		//問4 Javaのバージョン8と11の違いを簡潔に答えてください
		//		varを使用して、ローカル変数の型推論が出来る様になった
		//改行
		System.out.println("問５");
		//問5　Road博物館の入場料金は、一人1000円であるが、10人以上のチームなら一人820円、20人以上の団体なら一人700円である。人数を入力し、入場料の合計を計算するプログラムを作成せよ。(if文で上記文章を作ってください)

		Scanner scanner = new Scanner(System.in);
		int people = scanner.nextInt();
		int ahumanprice = 1000;
		int totalPrice = 0;

		if (people >= 20) {
			ahumanprice = 700;
		} else if (people >= 10) {
			ahumanprice = 820;
		}

		totalPrice = people * ahumanprice;

		System.out.println("入場料金は" + totalPrice + "円です。");
	}

	{

		//改行
		System.out.println("問６");
		//問6　コメントアウトされている箇所にどう言った処理が行われているか記載してください
		Scanner scn = new Scanner(System.in);
		int[] score = new int[5];
		int i, sum;
		double ave;

		//入力された5つのデータをを拡張for文を使用して出力している
		for (i = 0; i < score.length; i++) {
			System.out.print("得点を入力してください = ");
			score[i] = scn.nextInt();
		}

		//入力されたデータを5回受けとり加算している
		sum = 0;
		for (i = 0; i < score.length; i++) {
			sum += score[i];
		}

		//入力データの合計を要素数５で割り、平均値を算出している
		ave = sum / (double) score.length;
		//平均値を出力している
		System.out.println("平均値 = " + ave);

		//改行
		System.out.println("問７");
		//問7　ログ出力が行えるように下記コードを修正してください
		String message = "Hello World!";
		LOGGER.info("The message is: " + message);

		//改行
		System.out.println("問８");
		//問8　問題：
		//入力された文字列を整数に変換し、その結果を出力するプログラムを作成してください。ただし、以下の場合には例外を発生させてください。(Scannerメソッドを使用すること)
		//1.入力された文字列がnullの場合（NullPointerExceptionが発生する）
		//2.入力された文字列が空文字列の場合（Exceptionが発生する）
		//3.入力された文字列が整数に変換できない場合（NumberFormatExceptionが発生する）

		//改行
		System.out.println("問９");
		//問9 Java編終わった感想と改善点もしございましたらお願いします。
		//『ここに書いてね』
		//とっても難しかったですがここ最近楽しくなってきました。こんな気持ちにさせて頂いて感謝の気持ちで胸がおっぱいです。もう一度言います。おっぱいです。
		//改善点はありません！100点満点です！
	}
}