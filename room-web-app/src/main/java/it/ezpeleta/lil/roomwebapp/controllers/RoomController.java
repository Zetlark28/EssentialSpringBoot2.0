package it.ezpeleta.lil.roomwebapp.controllers;

import it.ezpeleta.lil.roomwebapp.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//controller: intermediate from service and view
@Controller
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String getAllRoomsa(Model model){
        model.addAttribute("rooms", roomService.getAllRooms());
        return "rooms";
    }
}
