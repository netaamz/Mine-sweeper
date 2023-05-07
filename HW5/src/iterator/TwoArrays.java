package iterator;

import java.util.Iterator;

public class TwoArrays implements Iterable<Integer>{
	// class of 2 arrays which we can iterate over them
	private int[] a1, a2;
	public TwoArrays(int[] a1, int[] a2)
	{
		// Constructor
		this.a1 = a1;
		this.a2 = a2;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		// return new instance of iterator 
		return new Iterator1();
	}
	
	private class Iterator1 implements Iterator<Integer>{
		// class to represents an iterator on those arrays
		private int index1 = 0, index2 = 0, turn = 0; 	// every iterator holds its own pointer
														// turn: 0 means a1, 1 means a2
		@Override
		public boolean hasNext() { 
			// checks if there are still more items to return
			// from any array
			return (index1 < a1.length || index2 < a2.length);
		}

		@Override
		public Integer next() {
			// generate the next item based on index
			
			if(turn == 0 && index1 < a1.length) {
				turn++;
				return a1[index1++];
			}
			turn = 0;
			return a2[index2++];
		}
		
	}
	
	
}
