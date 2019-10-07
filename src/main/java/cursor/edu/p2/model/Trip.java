package cursor.edu.p2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "trips")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trip")
    private Long id;

    @Column(name = "trip_name", unique = true)
    private String nameOfTrip;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "placesForTrips", joinColumns = @JoinColumn(name = "id_place"), inverseJoinColumns = @JoinColumn(name = "id_trip"))
    private List<Place> placesForTrips;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

}
