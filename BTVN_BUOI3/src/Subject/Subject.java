package Subject;

public class Subject {
	String id;
	private String subjectName;
	private int studentCount;
	private String timeStart;
	private String timeEnd;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}

	public String getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}

	public String getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(String timeEnd) {
		this.timeEnd = timeEnd;
	}

	public Subject() {
	}

	public Subject(String id, String subjectName, int studentCount, String timeStart, String timeEnd) {
		this.id = id;
		this.subjectName = subjectName;
		this.studentCount = studentCount;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
	}
	
	public void display(){
        System.out.printf("%-12s %-24s %12d %30s" , id , subjectName , studentCount , timeStart);
        System.out.println("-" + timeEnd);
    }
}
