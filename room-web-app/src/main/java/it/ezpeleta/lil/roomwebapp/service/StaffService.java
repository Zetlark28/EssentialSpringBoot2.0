package it.ezpeleta.lil.roomwebapp.service;

import it.ezpeleta.lil.roomwebapp.data.StaffRepository;
import it.ezpeleta.lil.roomwebapp.models.Staff;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<Staff> getAllStaff(){
        return staffRepository.findAll();
    }
}
