package cursor.edu.p2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id;

    @Column(name = "user_name")
    private String nameOfUser;

    @Column(name = "phone_number")
    private String phone;

    private String password;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private Trip trip;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "tripOfThisUser", joinColumns = @JoinColumn(name = "id_trip"), inverseJoinColumns = @JoinColumn(name = "id_user"))
    private List<Trip> tripUsers = new ArrayList<>();

}
