package it.ezpeleta.lil.roomwebapp.data;

import it.ezpeleta.lil.roomwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
