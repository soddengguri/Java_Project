package students;
public class StudentsTest {
	public static void main(String[] args) {
		STUDENTS a = new STUDENTS("신소연", 2019111613, "디지털미디어학과", 2, 48);
		System.out.println(a);
		Undergraduate b = new Undergraduate("김동희", 2019012345, "체육학과", 2, 50, "펜싱");
		System.out.println(b);
		Graduate c = new Graduate("황윤하", 2011678901, "미디어커뮤니케이션학과", 3, 140, "교육조교", 0.7);
		System.out.println(c);
	}
}
