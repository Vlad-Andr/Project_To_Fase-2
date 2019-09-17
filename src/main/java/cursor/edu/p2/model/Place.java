package cursor.edu.p2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "places")
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_place")
    private Long id;

    @Column(name = "regionOfWorld", nullable = false)
    private String region;

    @Column(name = "place_name", nullable = false, unique = true)
    private String nameOfPlace;

    @Column(name = "rate", nullable = false)
    private Double placeRate;

    @JsonIgnore
    @ElementCollection
    @CollectionTable(name = "commentsAtUsers", joinColumns = @JoinColumn(name = "id_comment"))
    @Column(name = "commentsFromVisitors")
    private List<String> usersComments = new ArrayList<>();

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private Trip trip;

}
