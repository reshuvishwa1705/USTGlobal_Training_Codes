package com.ustglobal.collection.sorting;

import java.util.Comparator;

public class MarkerSortByColor implements Comparator<Marker> {

	@Override
	public int compare(Marker o1, Marker o2) {
		return o1.clr.compareTo(o2.clr);
	}

}
