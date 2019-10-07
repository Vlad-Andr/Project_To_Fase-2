package cursor.edu.p2.repo;

import cursor.edu.p2.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepo extends JpaRepository<Place, Long> {
}
