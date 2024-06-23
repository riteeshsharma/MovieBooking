package dev.riteesh.BookMyShow.repository;

import dev.riteesh.BookMyShow.model.Seat;
import dev.riteesh.BookMyShow.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer> {
}
