package domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter
@Entity
@NoArgsConstructor
public class Adress {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String street;
    private Integer number;
    private String district;
    private String state;
    private String city;
    @ManyToOne
    private User userId;

    public Adress(Long id, String type, String street, Integer number, String district, String state, String city) {
        this.id = id;
        this.type = type;
        this.street = street;
        this.number = number;
        this.district = district;
        this.state = state;
        this.city = city;
    }
}
