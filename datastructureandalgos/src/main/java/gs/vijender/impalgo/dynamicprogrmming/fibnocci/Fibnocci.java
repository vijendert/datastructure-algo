package gs.vijender.impalgo.dynamicprogrmming.fibnocci;
import java.util.HashMap;
import java.util.Map;
public class Fibnocci {
	/**
	 * This is just the resursive way of fibnocci
	 * The base cases will be n=0and n=1
	 * A case n=4
	 * 01123 So the answer is 3
	 * fin(3)->fib(2)->fib(1)
	 * 1+0
	 * @param n
	 */
	private Map<Integer,Integer> holder ;
	public Fibnocci() {
		holder = new HashMap<Integer, Integer>();
		holder.put(0, 0);
		holder.put(1, 1);
		
	}
	public int fibnocciNaive(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fibnocciNaive(n-1)+fibnocciNaive(n-2);	
	}
	/**
	 * This need to store the value 
	 * memotization
	 * @param n
	 * @return
	 */
	public int fibnocciDp(int n) {
		if(holder.containsKey(n)) {
			return holder.get(n);
		}
		int newVal = fibnocciDp(n-1) + fibnocciDp(n-2);
		holder.put(n, newVal);
		return holder.get(n);	
	}
}
