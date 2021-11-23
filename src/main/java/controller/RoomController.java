package controller;


import domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.RoomRepository;
import service.RoomService;

import java.util.Optional;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

   /* @PostMapping
    public ResponseEntity<Room> createRoom(@RequestBody Room room) {
        Room newroom = roomService.save(room);
        return new ResponseEntity<>(newroom, HttpStatus.CREATED);
    }*/

   /* @GetMapping
    public Iterable<Room> findAll() {
        return roomService.findAll();
    }*/

    @GetMapping("{/id}")
    public Room findById(@PathVariable Integer id) {
        return roomService.buscar(id);
    }


}
