package com.amdocs.flightproject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Flights {
	HashMap<LocalDate, ArrayList<Flight>> flights = new HashMap<LocalDate, ArrayList<Flight>>();
	
	public void create(LocalDate date) {
		final Flight newFlight = new Flight(date);
		
		if(flights.containsKey(date)) {
			ArrayList<Flight> flightsOnDate = flights.get(date);
			flightsOnDate.add(newFlight);
		}
		else {
			ArrayList<Flight> flightsOnDate = new ArrayList<Flight>();
			flightsOnDate.add(newFlight);
			flights.put(date, flightsOnDate);
		}
	}
	
	public void showFlightsOnDate(LocalDate date) {
		ArrayList<Flight> flightsOnDate = flights.get(date);
		flightsOnDate.forEach(f->{
			System.out.println(f.getId());
			System.out.println(f.getDate());
		});
	}
}
