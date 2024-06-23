package dev.riteesh.BookMyShow.repository;

import dev.riteesh.BookMyShow.model.Show;
import dev.riteesh.BookMyShow.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer> {
}
