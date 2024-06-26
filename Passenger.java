package com.amdocs.flightproject;

import java.util.ArrayList;

public class Passenger {
	private int id;
	private String name;
	private ArrayList<Booking> bookings = new ArrayList<Booking>();
	
	public Passenger(String name) {
		this.name = name;
		this.id = UniqueId.generate(UniqueId.Slug.PASSENGER);
	}
	public void addBooking(Booking booking) {
		this.bookings.add(booking);
		System.out.println("Your flight was successfully booked!");
	}
	
	public int getId() {
		return this.id;
	}
}
