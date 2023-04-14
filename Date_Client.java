public class Date_Client {
	
	public static void main(String[] args) {
		Date d1 = new Date(1899, 3, 3);
		System.out.println(d1.isLeapYear());
		d1.addWeeks(50);
		System.out.println(d1.isLeapYear());
		System.out.println(d1.toString());
		System.out.println(d1.getYear());
		System.out.println(d1.getMonth());
		System.out.println(d1.getDay());
		Date d2 = new Date(1995, 4, 27);
		System.out.println("d1.daysTo(d2): " + d1.daysTo(d2));
		System.out.println("d2.daysTo(d1): " + d2.daysTo(d1));
	}//eo main
	
}//eo Date_Client