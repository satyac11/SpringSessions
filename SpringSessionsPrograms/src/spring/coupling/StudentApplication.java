/**
 * 
 */
package spring.coupling;

/**
 * @author satya
 *
 */
public class StudentApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Address tomAddress = new Address();
		tomAddress.setHouseNumber("1-3/C/18");
		tomAddress.setStreet("Durgam Cheruvu road");
		tomAddress.setArea("Madhapur");
		tomAddress.setCity("Hyderabad");
		tomAddress.setState("Telangana");
		tomAddress.setCountry("India");
		tomAddress.setPin(500081);
		
		Student st = new Student("tom",27,tomAddress);
		System.out.println(st.toString());
	}

}
