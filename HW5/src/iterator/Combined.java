package iterator;

import java.util.Iterator;

public class Combined<E> implements Iterable<E> {
	// class of combined elements, generic
	private Iterator<E> first, second;
	public Combined(Iterable<E> first, Iterable<E> second) 
	{
		// Constructor
		this.first = first.iterator();
		this.second = second.iterator();
		
	}
	
	@Override
	public Iterator<E> iterator() {
		return new Iterator2();
	}

	private class Iterator2 implements Iterator<E>{
		// Class to represents an generic iterator 
		private int turn = 0;  // local turn for every iterator
		
		@Override
		public boolean hasNext() {
			return (first.hasNext() || second.hasNext());
		}

		@Override
		public E next() {
			// class to return the next item based on turn
			if(turn == 0 && first.hasNext()) {
				turn++;
				return first.next();
			}
			if(turn == 1 && !second.hasNext())
				return first.next();
			turn = 0;
			return second.next();
		}
		
	}
	
		

}
