
public class Event {

	private static int counter = 0;
	
	private int id;
	private String name;
	private Location location;
	
	public Event(String name){
		counter++;
		this.id = counter;
		setName(name);
		this.location = new InsideLocation();
	}
	
	public Event(String name, EventLocation location){
		counter++;
		this.id = counter;
		setName(name);
		if(location == EventLocation.INSIDE){
			this.location = new InsideLocation();
		} else {
			this.location = new OutsideLocation();
		}
	}
	
	//gettery i settery
	public static int getCount(){
		return counter;
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
