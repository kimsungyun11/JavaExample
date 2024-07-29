package inheritance.override;

public class Override1 {

	public static void main(String[] args) {
		int r = 10;

		OverrideParent calculator = new OverrideParent();
		System.out.println( "원 면적 : " + calculator.areaCircle(r) );
		System.out.println();

		OverrideChildren computer = new OverrideChildren();
		System.out.println( "원 면적 : " + computer.areaCircle(r) );

	}

}
