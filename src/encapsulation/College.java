package encapsulation;
class CollegeInfo{
	 private String collegeName;
	    private int collegeCode;
	    
	    public CollegeInfo(String collegeName, int collegeCode) {
	        this.collegeName = collegeName;
	        this.collegeCode = collegeCode;
	    }
	    public String getCollegeName() {
	        return collegeName;
	    }

	    public int getCollegeCode() {
	        return collegeCode;
	    }

}
public class College {
	public static void main(String[] args) {

        
        CollegeInfo c1 = new CollegeInfo("SIEM College", 101);

        
        System.out.println("College Name : " + c1.getCollegeName());
        System.out.println("College Code : " + c1.getCollegeCode());
	}
}
