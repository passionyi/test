
public class VacationVisitor extends Visitor{
	@Override
	public void visit(Element element) {
		// TODO Auto-generated method stub
		Employee employee = (Employee)element;
		employee.set_vacationDays(employee.get_vacationDays()+3);
		System.out.printf("%s vacation is %d\n", employee.get_name(), employee.get_vacationDays());
	}
	
}
