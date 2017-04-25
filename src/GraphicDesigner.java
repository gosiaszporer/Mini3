
public class GraphicDesigner {
	
	private Employee employee;

	public GraphicDesigner(Employee employee) throws Exception {
		if(employee == null) {
			throw new Exception("Fotograf nie moze istniec bez pracownika");
		}
		this.employee = employee;
	}

}
