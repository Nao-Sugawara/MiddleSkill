import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) throws ParseException {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		//改行
		System.out.println("問１");
		//問題1:現在の時刻を出力してください
		//Dateを生成する
		Date date = new Date();

		//現在の日時を出力する
		System.out.println(date.toString());
		//改行
		System.out.println("問２");
		//問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		Date shinyaDate = format.parse(shinyaBirthday);
		Date minamiDate = format.parse(minamiBirthday);

		// 誕生日を比較して、早い方の日付を文字列型で出力する
		if (shinyaDate.before(minamiDate)) {
			System.out.println(shinyaBirthday);
		} else {
			System.out.println(minamiBirthday);
		}
		//改行
		System.out.println("問３");
		//問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
		// furuyamaBirthdayを日付型に変換する
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd");
		Date furuyamaDate = format2.parse(furuyamaBirthday);

		// Calendarクラスを利用して、5年2ヶ月追加する
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(furuyamaDate);
		calendar.add(Calendar.YEAR, 5);
		calendar.add(Calendar.MONTH, 2);

		// 追加後の日付を文字列型で出力する
		Date newDate = calendar.getTime();
		String newBirthday = format2.format(newDate);
		System.out.println(newBirthday);

	}
}
