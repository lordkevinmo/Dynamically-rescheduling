/**
 * 
 */
package fr.utbm.info.ia51.ar.requirements;

/**
 * @author Koffi AGBENYA
 * 
 * This class defines the generic of Tuple type. For simplicity and related to 
 * the aim of the project we define here the 2-uple (Pair).
 * A pair is composed by two element and it's immutable. 
 * 
 * Tuple<T, D> T and D are generic type. They can be any type.
 *
 */
public class Tuple<T, D> {

	private T first;
	private D second;
	
	/**
	 * Default Constructor
	 * @param f first element of the pair
	 * @param s second element of the pair
	 */
	public Tuple(T f, D s) {
		this.first = f;
		this.second = s;
	}
	
	/**
	 * 
	 * @return the first element in the Pair
	 */
	public T getFirst() {
		return this.first;
	}
	
	/**
	 * 
	 * @return the second element in the Pair
	 */
	public D getSecond() {
		return this.second;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tuple<?, ?> other = (Tuple<?, ?>) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}
	
/* Because Tuple are immutable, we can't change the value of one of their element after initialization.	
	/**
	 * 
	 * @param first element which we set to the first element in the pair.
	 */
/*	
	public void setFirst(T first) {
		this.first = first;
	}
	
	/**
	 * 
	 * @param second element which we set to the second element in the pair.
	 */
/*	
	public void setSecond(D second) {
		this.second = second;
	}
*/	
}
