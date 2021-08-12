package it.ezpeleta.lil.roomwebapp.service;

import it.ezpeleta.lil.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//service : all logic for retrieve data to pass in controller -> view
@Service
public class RoomService {

    public List<Room> getAllRooms(){
        List<Room> rooms = new ArrayList<>();
        for(int i=0 ; i<10;i++){
            rooms.add(new Room(i, "Room " + i, "R"+i, "Q"));
        }
        return rooms;
    }
}
