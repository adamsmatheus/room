package controller;


import domain.Room;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @PostMapping
    public void createUser(@RequestBody Room user) {
       // Room createdUser = userRepository.save(user);
        //return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

  //  @GetMapping
    //public Iterable<User> findAll() {
    //    return userRepository.findAll();
   // }

}
