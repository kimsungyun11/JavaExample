package inheritance;


public class OverrideChildren extends OverrideParent {

    // 메소드 오버라이딩
    @Override
    public double areaCircle(double r) {
        System.out.println("children객체의 메소드 실행");
        return Math.PI * r * r;
    }

}