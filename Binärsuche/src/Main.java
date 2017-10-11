
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class Main {

	public static void main(String[] args) {
		
		

		ArrayList<Integer> l = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			l.add(i);
		}

		System.out.println("Zu suchender Wert: " + binarySearch(34, l));
		System.out.println("Schritte bis zum Finden des Wertes: " + s);

	}
	
	public static int s = 0;
	

	public static int binarySearch(int i, List<Integer> list) {
		
		s++;
		
		if(list.size() == i){
			return i;
		}
		

		if (list.size() == 1) {
			return -1;
		}

		if (i < list.get(list.size() / 2)) {
			return binarySearch(i, list.subList(0, list.size() / 2));
		}

		if (i > list.get(list.size() / 2)) {
			return binarySearch(i, list.subList(list.size() / 2, list.size()));
		}

		return list.get(list.size() / 2);

	}
	
	
}

