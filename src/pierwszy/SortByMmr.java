package pierwszy;

import java.util.Comparator;

public class SortByMmr implements Comparator<Gamer> {

	public int compare (Gamer b, Gamer a) {
		/*float test=(a.getMmr()-b.getMmr())*10;
		return (int)test;*/
		return Float.compare(a.getMmr(), b.getMmr());
	}

}
