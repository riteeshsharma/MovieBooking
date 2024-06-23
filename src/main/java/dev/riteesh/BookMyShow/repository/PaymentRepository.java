package dev.riteesh.BookMyShow.repository;

import dev.riteesh.BookMyShow.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
