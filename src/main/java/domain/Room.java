package domain;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;


@EqualsAndHashCode
@Setter
@Getter
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String gener;
    private float meters;
    private int value;
    private boolean allInclusive;
    private boolean active;
    private String price;
    @ManyToOne
    private List<Adress> adress = new ArrayList<>();
    private User user;

    public Room(Integer id, String gener, float meters, int value, boolean allInclusive, boolean active, String price) {
        this.id = id;
        this.gener = gener;
        this.meters = meters;
        this.value = value;
        this.allInclusive = allInclusive;
        this.active = active;
        this.price = price;
    }
}
