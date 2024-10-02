package generic.wildCardType;

public class Course {
	// 모든 사람이면 등록 가능
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println( applicant.kind.getClass().getSimpleName() + "이 course1을 등록" );
	}
	// 학생만 등록
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println( applicant.kind.getClass().getSimpleName() + "이 course2을 등록" );
	}
	// 직장인 및 일반인 등록 가능
	// worker타입 상위 타입만 가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println( applicant.kind.getClass().getSimpleName() + "이 course3을 등록" );
	}
}
