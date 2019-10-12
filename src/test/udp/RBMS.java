package test.udp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class RBMS {
private int request_id;
private LocalDate date;
private LocalTime time;
private int minimum_participants; 
private ArrayList<Participants> participants_list;
private int rooms = 1;

	public RBMS(int id, LocalDate d, LocalTime t, int min, ArrayList<Participants> list ) {
		
		this.request_id = id;
		this.date = d;
		this.time = t;
		this.minimum_participants = min;
		this.participants_list = list;
	}
}
