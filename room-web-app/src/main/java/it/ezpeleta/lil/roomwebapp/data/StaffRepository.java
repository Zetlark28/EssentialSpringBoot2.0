package it.ezpeleta.lil.roomwebapp.data;

import it.ezpeleta.lil.roomwebapp.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, String> {
}
