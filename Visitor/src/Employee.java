
public class Employee extends Element {

	private String _name;
	private double _income;
	private int _vacationDays;
	
	public Employee(String name, double income, int vacationDays){
		_name = name;
		_income = income;
		_vacationDays = vacationDays;
	}
	
	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public double get_income() {
		return _income;
	}

	public void set_income(double _income) {
		this._income = _income;
	}

	public int get_vacationDays() {
		return _vacationDays;
	}

	public void set_vacationDays(int _vacationDays) {
		this._vacationDays = _vacationDays;
	}

	@Override
	public void Accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
