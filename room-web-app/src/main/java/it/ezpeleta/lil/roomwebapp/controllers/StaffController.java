package it.ezpeleta.lil.roomwebapp.controllers;

import it.ezpeleta.lil.roomwebapp.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staff")
public class StaffController {

    public final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }


    @GetMapping
    public String getAllRoomsa(Model model){
        model.addAttribute("staff", staffService.getAllStaff());
        return "staff";
    }
}
