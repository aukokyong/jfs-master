package com.fundamentals;

public class PrimitiveDataTypes {
	byte bvar;
	short shortvar;
	int intvar;
	long longvar;
	float floatvar;
	double doublevar;
	char charvar;
	boolean booleanvar;

	public static void main(String[] args) {
//		byte bvar;
//		short shortvar;
//		int intvar;
//		long longvar;
//		float floatvar;
//		double doublevar;
//		char charvar;
//		boolean booleanvar;
//		create a reference
		PrimitiveDataTypes primitiveDataTypes;
//		create the memory
		primitiveDataTypes = new PrimitiveDataTypes();
		System.out.println(primitiveDataTypes.bvar);
		System.out.println(primitiveDataTypes.shortvar);
		System.out.println(primitiveDataTypes.intvar);
		System.out.println(primitiveDataTypes.floatvar);
		System.out.println(primitiveDataTypes.doublevar);
		System.out.println(primitiveDataTypes.charvar);
		System.out.println(primitiveDataTypes.booleanvar);
	}
}
