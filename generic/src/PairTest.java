import java.util.Calendar;
import java.util.GregorianCalendar;


public class PairTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar[] birthdays = {
				new GregorianCalendar(1906, Calendar.DECEMBER, 9),
				new GregorianCalendar(1910, Calendar.NOVEMBER, 8)
		};
		Pair<GregorianCalendar> mm = ArrayAlg.minmax(birthdays);
		System.out.println("min = "+mm.getFirst().getTime());
		System.out.println("min = "+mm.getSecond().getTime());
	}

}
