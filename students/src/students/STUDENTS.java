package students;
public class STUDENTS {
	private String name;
	private int idnumber;
	private String major;
	private int grade;
	private int credit;
	
	public STUDENTS(String name, int idnumber, String major, int grade, int credit) {
		this.name = name;
		this.idnumber = idnumber;
		this.major = major;
		this.grade = grade;
		this.credit = credit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(int idnumber) {
		this.idnumber = idnumber;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	@Override
	public String toString() {
		return "이름 : " + name + " , 학번 : " + idnumber + " , 전공 : " + major + " , 학년 : " + grade + " , 이수학점 : " + credit;
	}
	
}
