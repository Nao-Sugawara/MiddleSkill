public class Test1 {
	public static void main(String[] args) {
		String a = null;
		String word = "b";
		//改行
		System.out.println("問１");
		//問題1:下記を条件としたトライキャッチ文を作成しなさい
		//条件：NullPointerExceptionを発生させ「ヌルポが発生しました」と出力する。
		//try文の処理はthrow new を使い強制的に例外を発生させる事。
		try {
			if (a == null)

				throw new NullPointerException();

		} catch (NullPointerException e) {
			System.out.println("ヌルポが発生しました");

		}

		{

			//改行
			System.out.println("問２");
			//問題2:下記を条件としたトライキャッチ文を作成しなさい
			//条件：NumberFormatExceptionを発生させ「数字フォーマットエラーが発生しました」と出力する。
			//またcatch処理後に必ず「例外処理は終了です」と出力されるプログラム構成にする事
			//try文の処理はthrow new を使い強制的に例外を発生させる事。
			//改行
			try {

				int number = Integer.parseInt(word);
				throw new NumberFormatException();

			} catch (Exception e) {

				System.out.println("数字フォーマットエラーが発生しました");

			} finally {

				System.out.println("例外処理は終了です");
			}

			System.out.println("問３");
			//問題3:下記を条件としたトライキャッチ文を作成しなさい
			//条件：NumberFormatExceptionを発生させNumberFormatException意外のExceptionでキャッチし「何らかの例外が発生しました」と出力する。
			//try文の処理はthrow new を使い強制的に例外を発生させる事。
			//改行
			try {

				Integer number = Integer.parseInt(word);
				throw new IllegalArgumentException();

			} catch (Exception e) {

				System.out.println("何らかの例外が発生しました");

			}
			System.out.println("問4");
			//問題4:例外処理を行うメリットを下記にコメント解答欄に記述しなさい
			//回答欄「　例外処理を行うことで、エラーが発生した時点でプログラムの実行を中断させることができ早期対応が可能になる」

		}
	}
}
