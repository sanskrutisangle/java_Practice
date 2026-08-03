package markerInterface;
@interface test{
	
}
@test
class Demo{
	void display() {
        System.out.println("Marker Annotation Example");
    }
}
public class MarkerAnnotation {
	 public static void main(String[] args) {

	        Demo d = new Demo();
	        d.display();
	    }

}
