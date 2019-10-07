package cursor.edu.p2.controller;

import cursor.edu.p2.model.Comment;
import cursor.edu.p2.model.Place;
import cursor.edu.p2.services.CommentServiceImpl;
import cursor.edu.p2.services.PlaceServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("place")
public class PlaceController {

    private final PlaceServiceImpl placeService;
    private final CommentServiceImpl commentService;

    @GetMapping
    public ResponseEntity<List<Place>> findAllPlaces() {
        placeService.findAllPlaces();
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Place>> findPlaceById(@PathVariable(name = "id") Long placeId) {
        placeService.findPlacesById(placeId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PostMapping("/comment")
    public ResponseEntity comment(@RequestBody Comment comment) {
        commentService.commentForPlace(comment);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    @PostMapping
    public ResponseEntity addPlace(@RequestBody Place place) {
        placeService.addNewPlace(place);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    @DeleteMapping
    public ResponseEntity deletePlace(@PathVariable(name = "id") Long placeId) {
        placeService.deletePlace(placeId);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }
}
