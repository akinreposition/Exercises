/**
 * 
 */
package inherit;

/**
 * @author user
 *
 */
public class TestBaseCommission {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommissionEmployee comm = new CommissionEmployee();
		BasePlusCommissionEmployee objNew = new BasePlusCommissionEmployee();
		comm.setFirstName("akin");
		comm.setLastName("lolu");
		comm.setSocialSecurityNumber("AKD234LD");
		
		objNew.setBaseSalary(1000);
		
		System.out.printf("First name : %s%n", comm.getFirstName(), "Last name : %s%n",comm.getLastName(),"Social Security Number : %s%n", comm.getSocialSecurityNumber());
		
		
	}

}