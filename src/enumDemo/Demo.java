package enumDemo;

public class Demo {
	public static void main(String[] args) {
		
//		Direction d=Direction.EAST;
//		System.out.println(d.getDegree());
		
		
		
		Direction e=Direction.EAST;
		
		e.move();
		// also call using ref variable e.show();
		
		Direction d=Direction.WEST;
		d.move();
		
		// also called using this Direction.NORTH.show();
		
		
	}

}


enum Direction{
//	NORTH(90),
//	SOUTH(45),
//	EAST(180),
//	WEST(360);
//	
	
	//varible and constructor 
	
//	private int degree;
//	
//	 Direction(int degree) {
//		this.degree=degree;
//	}
//	 
//	 public int getDegree() {
//		 return this.degree;
//	 }
	
	//method 
	
	NORTH{
		@Override
		public void move() {
			System.out.println("north");
		}
	},
	SOUTH{
		@Override
		public void move() {
			System.out.println("south");
		}
	},
	EAST{
		@Override 
		public void move() {
			System.out.println("east");
		}
	},
	WEST{
		@Override 
		public void move() {
			System.out.println("west");
		}
	};
	
	
	public abstract void  move();
	
	
	public void show() {
		System.out.println("this is direction");
	}
	
	
	
}