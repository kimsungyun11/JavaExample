package generic.genericType;

public class GenericExample2 {
	public static void main(String[] args) {

		Box box1 = new Box();
		box1.content = "100";

		Box box2 = new Box();
		box2.content = "100";

		Box box3 = new Box();
		box3.content = 100;

		// box의 내용물 비교
		boolean result1 = box1.compare(box2);
		System.out.println("result : " + result1);

		// box의 내용물 비교
		boolean result2 = box1.compare(box3);
		System.out.println("result : " + result2);
	}
}
