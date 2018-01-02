package etc.immutablecollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ImmutableCollectionTest {

	public static void main(String[] args) {
		List<Object> emptyImmutableList = List.of();
		//emptyImmutableList.add("Hello");// UnsupportedOperationException
		System.out.println(emptyImmutableList);
		
		List<String> notEmptyImmutableList = List.of("Hello Immutable List");
		System.out.println(notEmptyImmutableList);
		
		Map<Object, Object> emptyImmutableMap = Map.of();
		System.out.println(emptyImmutableMap);
		Map<Integer, String> notEmptyImmutableMap = Map.of(1, "one", 2, "two", 3, "three");
		System.out.println(notEmptyImmutableMap);
	}
}