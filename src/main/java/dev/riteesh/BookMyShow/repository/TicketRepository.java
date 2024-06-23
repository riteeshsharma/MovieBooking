package dev.riteesh.BookMyShow.repository;

import dev.riteesh.BookMyShow.model.Theatre;
import dev.riteesh.BookMyShow.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
