package enumDemo;

public enum Planet {
	EARTH, MARS, JUPITER;
	
	public double  print() {
		if(this==EARTH) {
			return 5.97;
		}else if(this==MARS) {
			return 0.642;
		}else {
			return 1898;
		}
	}
}
