package cursor.edu.p2.services;

import cursor.edu.p2.model.Comment;
import cursor.edu.p2.model.Place;

import java.util.List;
import java.util.Optional;

public interface PlaceService {

    void addNewPlace(Place place);
    void deletePlace(Long idPlace);
    void commentForPlace(Comment comment);
    List<Place> findAllPlaces();
    Optional<Place> findPlacesById(Long idPlace);

}
