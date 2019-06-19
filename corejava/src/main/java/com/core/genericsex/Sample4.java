package com.core.genericsex;

public class Sample4 {
	// Determine if an object is in array
	static <T extends Comparable<T>, V extends T> boolean isInArray(T x, V[] y) {
		for (int i = 0; i < y.length; i++)
			if (x.equals(y[i]))
				return true;

		return false;
	}
}
// The type parameters are declared before the return type of the method. Also
// note that T extends Comparable<T>. Comparable is an interface declared in
// java.lang. A class that implement s Comparable defines object s that can be
// ordered. Thus, requiring an upper bound of Comparable ensures that i sIn( )
// can be used only with object s that are capable of being compared.
// Comparable
// is generic, and its type parameter speci fies the type of object s that i
// t compares.
// (Shortly, you will see how to create a generic interface.) Next , not ice
// that the
// type V is upper-bounded by T. Thus, V must either be the same as type T, or
// a
// subclass of T. This relationship enforces that isIn( ) can be called only
// with
// argument s that are compatible with each other. Also not ice that isIn( )
// is static,
// enabling i t to be called independently of any object . Understand,
// though, that
// generic methods can be either static or non-static. There is no restrict
// ion in this
// regard.
// Now, notice how isIn( ) is called within main( ) by use of the normal
// call
// syntax, without the need to specify type argument s. This is because the
// types of
// the arguments are automatically discerned, and the types of T and V are
// adjusted accordingly.