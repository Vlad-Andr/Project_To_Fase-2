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
public class TripController {

    private final TripServiceImpl tripService;

    @GetMapping("trip")
    public ResponseEntity<List<Trip>> findAllTrips() {
        tripService.findAllTrips();
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @GetMapping("trip/{idTrip}")
    public ResponseEntity<Optional<Trip>> findTripById(@PathVariable(name = "idTrip") Long idTrip){
        tripService.findTripById(idTrip);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @GetMapping("trip/{idUser}")
    public ResponseEntity<List<Trip>> showTripsByUser(@PathVariable(name = "idUser") Long idUser) {
        tripService.findByUserId(idUser);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PostMapping("addNewTrip")
    public ResponseEntity addTrip(@RequestBody Trip trip) {
        tripService.addNewTrip(trip);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @DeleteMapping("trip/{id}")
    public ResponseEntity deleteTrip(@PathVariable(name = "id") Long idTrip) {
        tripService.deleteTrip(idTrip);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PatchMapping("trip/{id}")
    public ResponseEntity UpdateTrip(@PathVariable(name = "id") Long idTrip, @RequestBody Trip newTrip) {
        tripService.updateTrip(idTrip, newTrip);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }
}
