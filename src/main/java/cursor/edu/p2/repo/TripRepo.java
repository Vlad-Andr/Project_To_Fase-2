package cursor.edu.p2.repo;

import cursor.edu.p2.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TripRepo extends JpaRepository<Trip, Long> {
    List<Trip> findAllByUserId(Long idUser);
}

