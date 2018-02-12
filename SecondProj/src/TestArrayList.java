import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		
		for (String str:args) {
			al.add(str);
		}
		
		System.out.println("Array list is empty:" + al.isEmpty());
		System.out.println("Array list Size is:" + al.size());
		
		//al.add(new Integer(10));
		//al.add(Boolean.TRUE);
		System.out.println("Original : " + al);
		al.remove("Two");
		System.out.println("Now : " + al);
		al.set(1, "New");
		
		System.out.println("Now : " + al);
		
		System.out.println("Contains four : " + al.contains("four"));
		al.clear();
		System.out.println("Now : " + al);
		
	}

}
