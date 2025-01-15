package com.example.MovieTime.Dao;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.MovieTime.Entity.Ticket;
@RepositoryRestResource(path="ticket")
@CrossOrigin("http://localhost:4200")
public interface TicketDao extends JpaRepository<Ticket, Integer>{
	
	Page<Ticket> findByTicketMovieId(@RequestParam("ticket_Movie_Id") Integer ticketMovieId, Pageable pageable);
	public List<Ticket> findByTicketId(Integer ticketId );
	


}
