package service;

import domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RoomRepository;

import java.util.Optional;
// aqui na camada de service, fica toda a regra de negócios do projeto

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;


    public Room buscar(Integer id) {
        Optional<Room> room =  roomRepository.findById(id);
        return room.orElse(null);
    }

}
