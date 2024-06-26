package com.amdocs.flightproject;
import java.time.LocalDateTime;

public class Booking {
	private int id;
	private int passengerId;
	private int flightId;
	private LocalDateTime createdAt;
	
	public Booking(int passengerId, int flightId) {
		this.passengerId = passengerId;
		this.flightId = flightId;
		this.id = UniqueId.generate(UniqueId.Slug.BOOKING);
		this.createdAt = LocalDateTime.now();
	}
}
