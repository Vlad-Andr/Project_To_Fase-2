package cursor.edu.p2.controller;

import cursor.edu.p2.model.Comment;
import cursor.edu.p2.model.Place;
import cursor.edu.p2.services.PlaceServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PlaceController {

    private final PlaceServiceImpl placeService;

    @GetMapping("place")
    public ResponseEntity<List<Place>> findAllPlaces() {
        placeService.findAllPlaces();
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @GetMapping("place/{id}")
    public ResponseEntity<List<Place>> findPlaceById(@PathVariable(name = "id") Long idPlace) {
        placeService.findPlacesById(idPlace);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PostMapping("place/comment")
    public ResponseEntity comment(@RequestBody Comment comment) {
        placeService.commentForPlace(comment);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    @PostMapping("place")
    public ResponseEntity addPlace(@RequestBody Place place) {
        placeService.addNewPlace(place);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    @DeleteMapping("place")
    public ResponseEntity deletePlace(@PathVariable(name = "id") Long idPlace) {
        placeService.deletePlace(idPlace);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }
}
