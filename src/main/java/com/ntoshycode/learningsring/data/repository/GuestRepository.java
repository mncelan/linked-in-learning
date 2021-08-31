package com.ntoshycode.learningsring.data.repository;

import com.ntoshycode.learningsring.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
