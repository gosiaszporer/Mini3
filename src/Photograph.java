
public class Photograph {
	
	private Employee employee;

	public Photograph(Employee employee) throws Exception {
		if(employee == null) {
			throw new Exception("Fotograf nie moze istniec bez pracownika");
		}
		this.employee = employee;
	}

}
