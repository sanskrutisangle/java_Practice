package streamApi;
import java.util.*;
public class FlattenStudentNames {
	public static void main(String[] args) {
		List<List<String>> student=List.of(
				List.of("samiskah","om"),
				List.of("sanskruti","kunal","soham")
				);
		
		student.stream()
		.flatMap(list->list.stream())
		.forEach(System.out::println);
	}

}
//If you used:
//
//.map(list -> list.stream())
//
//you would get:
//
//Stream<Stream<String>>
//
//That means a stream containing other streams.
//
//But flatMap() takes those inner streams and combines them into one stream:
//
//Stream<List<String>>
//        ↓
//   flatMap()
//        ↓
//Stream<String>