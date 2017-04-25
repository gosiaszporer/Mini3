
public class Employee {
	private static int counter = 0;
	
	private int id;
	private String name;
	private String surname;
	
	// Dziedziczenie overlapping oraz dynamic za pomoca kompozycji
	private Photograph photograph;
	private GraphicDesigner designer;
	
	public Employee(String name, String surname, EmployeeType type) throws Exception {
		counter++;
		this.id = counter;
		setName(name);
		setSurname(surname);
		
		if(type == EmployeeType.PHOTOGRAPH){
			this.photograph = new Photograph(this);
			this.designer = null;
		}	
		else if(type == EmployeeType.GRAPHICDESIGNER){
			this.photograph = null;
			this.designer = new GraphicDesigner(this);
		}
		else if(type == EmployeeType.PHOTOGRAPH_GRAPHICDESIGNER){
			this.photograph = new Photograph(this);
			this.designer = new GraphicDesigner(this);
		}
		else{
			this.photograph = null;
			this.designer = null;
		}
	}
	
	//gettery i settery
	public static int getCount(){
		return counter;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	//Dziedziczenie overlapping oraz dynamic
	public void becomePhotograph() throws Exception{
		if(!isPhotograph())
			this.photograph = new Photograph(this);
	}
	public void stopBeingPhotograph(){
		if(isPhotograph())
			this.photograph = null;
	}
	public void becomeDesigner() throws Exception{
		if(!isDesigner())
		this.designer = new GraphicDesigner(this);
	}
	public void stopBeingDesigner(){
		if(isDesigner()){
			this.designer = null;
		}
	}
	public boolean isPhotograph(){
		if(this.photograph == null)
			return false;
		return true;
	}
	public boolean isDesigner(){
		if(this.designer == null)
			return false;
		return true;
	}
}

