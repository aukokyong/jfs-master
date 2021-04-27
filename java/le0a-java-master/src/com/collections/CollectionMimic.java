package com.collections;

public class CollectionMimic {

}

interface CollectionM{
	// Generic operations on a collection
}
interface SetM extends CollectionM{
//	no duplicate items
}
interface SortedSetM extends SetM{
//	sorted items in Sort Order
}

class TreeSetM implements SortedSetM{
//	sorted items in Sort Order
}

interface ListM extends CollectionM{
//	duplicate items with insertion order
}
