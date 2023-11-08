package students;
public class Undergraduate extends STUDENTS {
	private String club;
	public Undergraduate(String name, int idnumber, String major, int grade, int credit, String club) {
		super(name, idnumber, major, grade, credit);
		this.club=club;
	}
	public String getClub() {return club;}
	public void setClub(String club) {this.club=club;}

	@Override
	public String toString() {
		return super.toString() + ", 동아리명 : " + club;
	}
}
