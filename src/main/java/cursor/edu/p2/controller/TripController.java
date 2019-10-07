package cursor.edu.p2.controller;

import cursor.edu.p2.model.Trip;
import cursor.edu.p2.services.TripServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("trip")
public class TripController {

    private final TripServiceImpl tripService;

    @GetMapping
    public ResponseEntity<List<Trip>> findAllTrips() {
        tripService.findAllTrips();
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @GetMapping("/{tripId}")
    public ResponseEntity<Optional<Trip>> findTripById(@PathVariable(name = "tripId") Long tripId){
        tripService.findTripById(tripId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Trip>> showTripsByUser(@PathVariable(name = "userId") Long userId) {
        tripService.findByUserId(userId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PostMapping
    public ResponseEntity addTrip(@RequestBody Trip trip) {
        tripService.addNewTrip(trip);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteTrip(@PathVariable(name = "id") Long tripId) {
        tripService.deleteTrip(tripId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity UpdateTrip(@PathVariable(name = "id") Long tripId, @RequestBody Trip newTrip) {
        tripService.updateTrip(tripId, newTrip);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }
}
