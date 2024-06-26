package com.amdocs.flightproject;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Flights flights = new Flights();
		Main.seedFlights(flights);
		Main.seedPassengers();
		flights.showFlightsOnDate(LocalDate.of(2024, 6, 23));
	}
	
	private static void seedFlights(Flights flights) {
		flights.create(LocalDate.of(2024, 6, 23));
		flights.create(LocalDate.of(2024, 6, 24));
		flights.create(LocalDate.of(2024, 6, 23));
		flights.create(LocalDate.of(2024, 6, 23));
		flights.create(LocalDate.of(2024, 6, 24));
		flights.create(LocalDate.of(2024, 6, 25));
	}
	
	private static void seedPassengers() {
		List<String> names = Arrays.asList(
				"Miachel Jackson",
				"Tupac",
				"Jay-Z",
				"Lil Wayne",
				"Eminem",
				"Kendrick Lamar",
				"Future",
				"Travis Scott"
		);
		for(String name: names) {
			Passenger p = new Passenger(name);
			Passengers.add(p);
		}
	}

}
