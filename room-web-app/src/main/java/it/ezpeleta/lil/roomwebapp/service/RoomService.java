package it.ezpeleta.lil.roomwebapp.service;

import it.ezpeleta.lil.roomwebapp.data.RoomRepository;
import it.ezpeleta.lil.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//service : all logic for retrieve data to pass in controller -> view
@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }
}
