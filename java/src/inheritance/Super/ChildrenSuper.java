package inheritance.Super;

public class ChildrenSuper extends ParentSuper {

	// 상수 선언
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    // 상태 필드 선언
    public int flymode = NORMAL;

    // 메소드 재정의
    @Override
    public void fly() {
        if (flymode == SUPERSONIC) {
            System.out.println("초음속 비행");
        } else {
            // 부모 객체의 fly() 메소드 호출
            super.fly();
        }
    }


}
