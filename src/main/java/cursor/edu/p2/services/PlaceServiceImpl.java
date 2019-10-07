package cursor.edu.p2.services;

import cursor.edu.p2.model.Comment;
import cursor.edu.p2.model.Place;
import cursor.edu.p2.repo.CommentRepo;
import cursor.edu.p2.repo.PlaceRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlaceServiceImpl implements PlaceService {

    private final PlaceRepo placeRepo;

    @Override
    public void addNewPlace(Place place) {
        placeRepo.save(place);
    }

    @Override
    public void deletePlace(Long idPlace) {
        placeRepo.deleteById(idPlace);
    }

    @Override
    public List<Place> findAllPlaces() {
        return placeRepo.findAll();
    }

    @Override
    public Optional<Place> findPlacesById(Long idPlace) {
        return placeRepo.findById(idPlace);
    }

}
