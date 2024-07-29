package Class.Static;

public class StaticBlock {

	static String company = "My Company";
	static String model = "LCD";
	static String info;

	// 단어 연결 후 info 변수에 저장
	static {
		info = company + "-" + model;
	}

}
