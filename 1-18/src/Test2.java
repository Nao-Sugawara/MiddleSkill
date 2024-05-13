
public class Test2 {

	public static void main(String[] args) {

		Test1 test1 = new Test1();

		String a = "こんにちは";
		String b = "こんばんわ";

		test1.setFirst_name(a);

		System.out.println(test1.getFirst_name());

		test1.setFirst_name(b);

		System.out.println(test1.getFirst_name());

	}
}