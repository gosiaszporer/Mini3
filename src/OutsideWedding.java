
public class OutsideWedding extends WeddingEvent implements IOutsideLocation{
	
	private double locationPrice;
	private double tentPrice;

	public OutsideWedding(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public OutsideWedding(String name, EventLocation location) {
		super(name, location);
	}

	@Override
	public double getPrice() {
		return locationPrice + tentPrice;
	}

	@Override
	public double getLocationPrice() {
		// TODO Auto-generated method stub
		return this.locationPrice;
	}

	@Override
	public double getTentPrice() {
		// TODO Auto-generated method stub
		return this.tentPrice;
	}

	@Override
	public void setLocationPrice(double price) {
		this.locationPrice = price;
		
	}

	@Override
	public void setTentPrice(double price) {
		this.tentPrice = price;
		
	}

}
