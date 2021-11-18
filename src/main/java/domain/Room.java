package domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
public class Room {

    private String gener;
    private float meters;
    private int value;
    private boolean allInclusive;
    private boolean active;
    private String price;

}
