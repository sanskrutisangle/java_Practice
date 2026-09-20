package enumDemo;

public class Price {
	public static void main(String[] args) {
		Size[] s= Size.values();
		for(Size data: s) {
			
			System.out.println(data);
		}
		
//		Size.valueOf("SMALL");
		
		Size p=Size.SMALL;
		System.out.println(p.ordinal());
		
		
//		System.out.println(s.getPrice());
	}
	
}
