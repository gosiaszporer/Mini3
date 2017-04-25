
public class OutsideLocation extends Location implements IOutsideLocation {
	
	private double locationPrice;
	private double tentPrice;
	
	public OutsideLocation(double locationPrice, double tentPrice) {
		super();
		setLocationPrice(locationPrice);
		setTentPrice(tentPrice);
	}
	
	public OutsideLocation() {
		setLocationPrice(0);
		setTentPrice(0);
	}

	@Override
	public double getPrice() {
		return locationPrice + tentPrice;
	}
		
	//gettery i settery
	public double getLocationPrice(){
		return this.locationPrice;
	}
	
	public void setLocationPrice(double price){
		this.locationPrice = price;
	}
	
	public double getTentPrice(){
		return this.tentPrice;
	}
	
	public void setTentPrice(double price){
		this.tentPrice = price;
	}

}
