package com.ntoshycode.learningsring.data.repository;

import com.ntoshycode.learningsring.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
