package it.ezpeleta.lil.roomwebapp.service;

import it.ezpeleta.lil.roomwebapp.models.Room;
import it.ezpeleta.lil.roomwebapp.models.Staff;
import it.ezpeleta.lil.roomwebapp.models.StaffPosition;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService {

    public List<Staff> getAllStaff(){
        List<Staff> staff = new ArrayList<>();
        List<String> firstNames = List.of("Maria", "Mario", "Giacomo", "Giuseppe");
        List<String> lastNames = List.of("Rossi", "Bianchi", "Verdi", "Neri");
        List<StaffPosition> positions = List.of(StaffPosition.values());

        for(int i=0; i<10; i++){
            int randomIndexFirstName = (int) ((Math.random() * (firstNames.size() - 1)) + 0);
            int randomIndexLastName = (int) ((Math.random() * (firstNames.size() - 1)) + 0);
            int randomIndexPosition = (int) ((Math.random() * (firstNames.size() - 1)) + 0);
            staff.add(new Staff(i, firstNames.get(randomIndexFirstName), lastNames.get(randomIndexLastName),
                    positions.get(randomIndexPosition)));
        }
        return staff;
    }
}
