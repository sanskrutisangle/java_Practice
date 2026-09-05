package setCollection;

import java.util.HashSet;

public class PredictHashSetOutput {
	public static void main(String[] args) {
		HashSet<String>set=new HashSet<>();
		
		set.add(new String("sanskruti"));
		set.add(new String("sanskruti"));
		set.add("sanskruti");
		
		System.out.println("HashSet: " + set);
        System.out.println("Size: " + set.size());
        //String overrides equals() and hashCode(), so HashSet identifies all three as equal values and keeps only one.
	}

}
