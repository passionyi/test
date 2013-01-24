
public class VisitorApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a = new Employee("passion", 2500, 2);
		Employee b = new Employee("zrn", 2500, 3);
		
		IncomeVisitor v1 = new IncomeVisitor();
		VacationVisitor v2 = new VacationVisitor();
		
		a.Accept(v1);
		a.Accept(v2);
		b.Accept(v1);
		b.Accept(v2);
	}

}
