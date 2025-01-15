package com.example.MovieTime.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="BookingTable")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_Id")
	private int bookingId;
	
	@Column(name="booking_PaymentType",nullable = false)
	private String bookingPaymentType;
	
	@Column(name="booking_TotalAmount",nullable = false)
	private Float bookingTotalAmount;
	
	
	@Column(name="booking_Ticket_Id",nullable = false)
	private int bookingTicketId;
	
	
	@ManyToOne(targetEntity=Ticket.class,fetch=FetchType.EAGER)
	@JoinColumn(name="booking_Ticket_Id",insertable=false,updatable=false)
	private Ticket ticket;
	
	


	public Booking() {
	}




	public Booking(int bookingId, String bookingPaymentType, Float bookingTotalAmount, int bookingTicketId) {
		super();
		this.bookingId = bookingId;
		this.bookingPaymentType = bookingPaymentType;
		this.bookingTotalAmount = bookingTotalAmount;
		this.bookingTicketId = bookingTicketId;
	}




	public int getBookingId() {
		return bookingId;
	}




	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}




	public String getBookingPaymentType() {
		return bookingPaymentType;
	}




	public void setBookingPaymentType(String bookingPaymentType) {
		this.bookingPaymentType = bookingPaymentType;
	}




	public Float getBookingTotalAmount() {
		return bookingTotalAmount;
	}




	public void setBookingTotalAmount(Float bookingTotalAmount) {
		this.bookingTotalAmount = bookingTotalAmount;
	}




	public int getBookingTicketId() {
		return bookingTicketId;
	}




	public void setBookingTicketId(int bookingTicketId) {
		this.bookingTicketId = bookingTicketId;
	}




	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingPaymentType=" + bookingPaymentType
				+ ", bookingTotalAmount=" + bookingTotalAmount + ", bookingTicketId=" + bookingTicketId + "]";
	}




	
	
	

	

}
