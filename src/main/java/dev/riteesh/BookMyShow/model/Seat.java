package dev.riteesh.BookMyShow.model;

import dev.riteesh.BookMyShow.model.constant.SeatStatus;
import dev.riteesh.BookMyShow.model.constant.SeatType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    @Column(name ="seat_row")
    private int row;
    @Column(name ="seat_col")
    private int col;
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @Enumerated(EnumType.STRING)
    private SeatStatus status;
}
