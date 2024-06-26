package com.amdocs.flightproject;

import java.util.HashMap;

public class Passengers {
	private static HashMap<Integer, Passenger> map = new HashMap<Integer, Passenger>();
	
	public static Passenger get(int id) {
		return Passengers.list.get(id);
	}
	
	public static void add(Passenger passenger) {
		map.put(passenger.getId(), passenger);
	}
}
