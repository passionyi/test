
public class IncomeVisitor extends Visitor {

	@Override
	public void visit(Element element) {
		// TODO Auto-generated method stub
		Employee employee = (Employee)element;
		employee.set_income(employee.get_income() * 1.1);
		System.out.printf("%s income is %f\n", employee.get_name(), employee.get_income());
	}
	
}
