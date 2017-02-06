package de.budde.straightAndWrong;

public class D<T> extends C<T> {
	public D<T> decr1() {
		x--;
		return this;
	}
	
	public T decr2() {
		x--;
		return (T) this;
	}
}
