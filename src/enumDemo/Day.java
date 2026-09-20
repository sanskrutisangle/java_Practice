package enumDemo;

public enum Day {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;
	
	public boolean isWeekend() {
		return this==SUNDAY || this==SATURDAY;//this means the current enum constant on which the method is called.
	}
}
