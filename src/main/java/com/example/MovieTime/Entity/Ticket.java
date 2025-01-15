package com.example.MovieTime.Entity;

import java.time.LocalDateTime;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="TicketTable")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ticket_Id")
	private int ticketId;
	
	@Column(name="ticket_Seats" , nullable = false)
	private int ticketSeats;
	
	@Column(name="ticket_TotalPrice" ,nullable = false)
	private float ticketTotalPrice;
	
	@Column(name="ticket_MovieTimeDate" ,nullable = false)
//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime ticketMovieTimeDate;
	
	@Column(name="ticket_Movie_Id", nullable = false)
	private int ticketMovieId;
	
	@Column(name="ticket_Movie_Name")
	private String ticketMovieName;
	
	@Column(name="ticket_TheaterName")
	private String ticketTheaterName;
	
	@Column(name="ticket_TheaterLocation")
	private String ticketTheaterLocation;
	
	
	@ManyToOne(targetEntity=Movie.class,fetch=FetchType.EAGER)
	@JoinColumn(name="ticket_Movie_Id",insertable=false,updatable=false)
	private Movie movie;
	
	/*@ManyToOne(targetEntity=Movie.class,fetch=FetchType.EAGER)
	@JoinColumn(name="ticket_Movie_Name",insertable=false,updatable=false)
	private Movie movi;*/


	@OneToMany(mappedBy="ticket", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Booking>booking;
	
	public Ticket() {
		
	}

	public Ticket(int ticketId, int ticketSeats, float ticketTotalPrice, LocalDateTime ticketMovieTimeDate,
			int ticketMovieId, String ticketMovieName, String ticketTheaterName, String ticketTheaterLocation
			) {
		super();
		this.ticketId = ticketId;
		this.ticketSeats = ticketSeats;
		this.ticketTotalPrice = ticketTotalPrice;
		this.ticketMovieTimeDate = ticketMovieTimeDate;
		this.ticketMovieId = ticketMovieId;
		this.ticketMovieName = ticketMovieName;
		this.ticketTheaterName = ticketTheaterName;
		this.ticketTheaterLocation = ticketTheaterLocation;
		
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getTicketSeats() {
		return ticketSeats;
	}

	public void setTicketSeats(int ticketSeats) {
		this.ticketSeats = ticketSeats;
	}

	public float getTicketTotalPrice() {
		return ticketTotalPrice;
	}

	public void setTicketTotalPrice(float ticketTotalPrice) {
		this.ticketTotalPrice = ticketTotalPrice;
	}

	public LocalDateTime getTicketMovieTimeDate() {
		return ticketMovieTimeDate;
	}

	public void setTicketMovieTimeDate(LocalDateTime ticketMovieTimeDate) {
		this.ticketMovieTimeDate = ticketMovieTimeDate;
	}

	public int getTicketMovieId() {
		return ticketMovieId;
	}

	public void setTicketMovieId(int ticketMovieId) {
		this.ticketMovieId = ticketMovieId;
	}

	public String getTicketMovieName() {
		return ticketMovieName;
	}

	public void setTicketMovieName(String ticketMovieName) {
		this.ticketMovieName = ticketMovieName;
	}

	public String getTicketTheaterName() {
		return ticketTheaterName;
	}

	public void setTicketTheaterName(String ticketTheaterName) {
		this.ticketTheaterName = ticketTheaterName;
	}

	public String getTicketTheaterLocation() {
		return ticketTheaterLocation;
	}

	public void setTicketTheaterLocation(String ticketTheaterLocation) {
		this.ticketTheaterLocation = ticketTheaterLocation;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", ticketSeats=" + ticketSeats + ", ticketTotalPrice="
				+ ticketTotalPrice + ", ticketMovieTimeDate=" + ticketMovieTimeDate + ", ticketMovieId="
				+ ticketMovieId + ", ticketMovieName=" + ticketMovieName + ", ticketTheaterName=" + ticketTheaterName
				+ ", ticketTheaterLocation=" + ticketTheaterLocation
				+ "]";
	}

	
	


	

	
	
	

}
