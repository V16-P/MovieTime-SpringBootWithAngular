package com.example.MovieTime.Dao;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.MovieTime.Entity.Booking;
import com.example.MovieTime.Entity.Ticket;

@RepositoryRestResource(path="booking")
@CrossOrigin("http://localhost:4200")
public interface BookingDao extends JpaRepository<Booking, Integer> {
	
	Page<Booking> findByBookingTicketId(@RequestParam("booking_Ticket_Id") Integer bookingTicketId,Pageable pageable);
	public List<Booking> findByBookingId(Integer bookingId );

}
