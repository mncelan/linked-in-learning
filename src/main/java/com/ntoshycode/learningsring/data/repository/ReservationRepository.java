package com.ntoshycode.learningsring.data.repository;

import com.ntoshycode.learningsring.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    Iterable<Reservation> findReservationByReservationDate(Date date);

}
