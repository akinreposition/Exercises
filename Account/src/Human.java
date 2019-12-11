import java.util.Date;
public class Human {
	private Date dateOfBirth; // Access modifier, variable type, variable name. 
	
	Date today = new Date(); // use of Date util.Date, used to  collect date

	public Date getDateOfBirth() {
		return dateOfBirth;  // Access modifier variable type , keyword: GET dateOfBirth, which comes with a return
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public Human() {
		dateOfBirth = today;
	}
	
	
	

}
