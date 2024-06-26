package com.amdocs.flightproject;

import java.util.HashMap;

public class UniqueId {
	public static enum Slug{
		FLIGHT,
		PASSENGER,
		BOOKING
	}
	
	private static HashMap<UniqueId.Slug, Integer> idMap = new HashMap<UniqueId.Slug, Integer>();
	
	static {
		idMap.put(UniqueId.Slug.FLIGHT, 1);
		idMap.put(UniqueId.Slug.BOOKING, 1);
		idMap.put(UniqueId.Slug.PASSENGER, 1);
	}
	
	public static int generate(UniqueId.Slug slug) {
		int id = idMap.get(slug);
		idMap.put(slug, id+1);
		return id;
	}
}
