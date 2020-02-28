import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		addnames(names);
		System.out.println(names);
		// 1 print names with length more than 6
		List<String> nameList = names.stream().filter(s -> s.length() > 6).collect(Collectors.toList());

		System.out.println(nameList);
		System.out.println("******name with length more than 6******");
		nameList.forEach(System.out::println);

		// 2.names in uppercase
		List<String> nameUpper = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("******NAMES IN UPPERCASE******");
		nameUpper.forEach(System.out::println);

		long count = names.stream().count();
		System.out.println("list count is :" + count);
		Stream<Integer> data = Stream.of(1, 11, 111, 1111, 11111);
		System.out.println("data count : " + data.count());

		Stream<String> language = Stream.of("C", "C++", "JAVA", "ANGULAR", "PYTHAN");
		List<String> lang = language.filter(s -> s.length() > 4).collect(Collectors.toList());
		lang.forEach(System.out::println);

		// 3. to concat into list
		 List<String> plang = language.map(s->s.concat(" programming")).collect(Collectors.toList());
		plang.forEach(System.out::println);

		// 4.FOR SORTING
		 List<String> sorting = language.sorted().collect(Collectors.toList());
		 sorting.forEach(System.out::println);

		//5. FOR SORTING in descending oreder
		System.out.println("**** sorting in descending order***");
		List<String> sorting2 = language.sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		sorting2.forEach(System.out::println);
	}

	private static void addnames(ArrayList<String> names) {

		names.add("aditi");
		names.add("ankita");
		names.add("bhawna");
		names.add("vanshika");
		names.add("aishwarya");

	}

}
