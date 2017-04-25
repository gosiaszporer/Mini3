
public class InsideLocation extends Location{

	private double locationPrice;
	
	public InsideLocation() {
		setLocationPrice(0);
	}
	
	public InsideLocation(double price) {
		setLocationPrice(price);
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return getLocationPrice();
	}
	
	//gettery i settery
		public double getLocationPrice(){
			return this.locationPrice;
		}
		
		public void setLocationPrice(double price){
			this.locationPrice = price;
		}

}
