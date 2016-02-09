import java.util.ArrayList;

public class StringArrayList {

	public static void main(String[] args) {

		ArrayList<String> myStringList = new ArrayList<String>();

		myStringList.add("Frog");
		myStringList.add("Snake");
		myStringList.add("Tiger");

		// size?
		System.out.println(myStringList.size());

		// contains?
		System.out.println(" contains Cow? " + myStringList.contains("Cow"));

		System.out.println(" contains Snake? " + myStringList.contains("Snake"));

		// Frog wird aus der Liste gelöscht
		myStringList.remove("Frog");

		System.out.println(" contains Frog? " + myStringList.contains("Frog"));

		// size erneut abfragen
		System.out.println(myStringList.size());

		// myStringList.add(new Integer(10)); funktioniert nicht, immer nur das
		// was am anfang genommen wurde, also String

		// for-each
		for (String animal : myStringList) {
			System.out.println(animal);
		}

	}

}
