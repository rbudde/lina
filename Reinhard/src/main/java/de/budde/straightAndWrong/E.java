package de.budde.straightAndWrong;

public class E<T> extends D<T> {
	public E<T> add1(int a) {
		x+=a;
		return this;
	}
	
	public T add2(int a) {
		x+=a;
		return (T) this;
	}
}
