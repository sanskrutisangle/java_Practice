package enumDemo;

public enum Size {
	SMALL(900), MEDIUM(566), LARGE(234);
	
	private int price;
	
	Size(int price){
		this.price=price;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	
	@Override
	public String toString() {
		if(this==LARGE) {
			return name()+" so you have to pay extra for that also";
		}
		return name();
	}
	
}
