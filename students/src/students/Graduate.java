package students;
public class Graduate extends STUDENTS{
	
	private String assistant;
	private boolean x;
	private double scholarship;
	private Object str;
	public Graduate(String name, int idnumber, String major, int grade, int credit, String assistant, double scholarship)
	{
		super(name, idnumber, major, grade, credit);
		this.assistant=assistant;
		if (scholarship <= 1.0 || 0.0 <= scholarship) {
			this.scholarship = scholarship;}
	}
	public String getAssistant() {
		return assistant;
	}
	public void setAssistant(String assistant) {
		if(str.equals("교육조교"))
			x = true;
		else
			x = false;
		
		this.assistant=assistant;
	}
	public double getScholarship() {
		return scholarship;
	}
	public void setScholarship(double scholarship) {
		if (scholarship <= 1.0 || 0.0 <= scholarship) {
			this.scholarship=scholarship;
		}
	}
	@Override
	public String toString() {
		return super.toString() + "\n, 조교 유형(교육조교 or  연구조교): " + assistant + ", 장학금 비율(0.0 ~ 0.1) : " + scholarship;
	}
}
