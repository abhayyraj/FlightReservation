package com.amdocs.flightproject;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Flight {
	
	private int id;
	private LocalDate date;
	private int m=4, n=3;
	final int capacity = m*n;
	private ArrayList<ArrayList<Boolean>> availableSeats = new ArrayList<ArrayList<Boolean>>(m);
	
	Flight(LocalDate date){
		this.id = UniqueId.generate(UniqueId.Slug.FLIGHT);
		
		
		for(int i=0;i<m;i++) {
			ArrayList<Boolean> row = new ArrayList<Boolean>(Collections.nCopies(n, true));
			availableSeats.add(row);
		}
		this.date = date;
	}
	
	private static String getCharForNumber(int i) {
		return i >= 0 && i < 27 ? String.valueOf((char) ('a' + i )) : null;
	}
	
	public void showSeats() {
		System.out.print("  ");
		for(int j=0;j<n;j++) {
			System.out.print(getCharForNumber(j) + " ");
		}
		System.out.println();
		
		for(int i=0;i<m;i++) {
			final ArrayList<Boolean> row = availableSeats.get(i);
			System.out.print((i+1) + " " );
			for(int j=0;j<n;j++) {
				final Boolean seat = row.get(j);
				System.out.print((seat ? "O" : "X") + " ");
			}
			System.out.println();
		}
	}
	
	public int getId() {
		return this.id;
	}
	
	public LocalDate getDate() {
		return this.date;
	}
}
