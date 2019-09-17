package cursor.edu.p2.services;

import cursor.edu.p2.model.Trip;

import java.util.List;
import java.util.Optional;

public interface TripService {

    void addNewTrip(Trip trip);
    void deleteTrip(Long idTrip);
    void updateTrip(Long idTrip, Trip newTrip);
    List<Trip> findAllTrips();
    Optional<Trip> findTripById(Long idTrip);
    List<Trip> findByUserId(Long idUser);

}
