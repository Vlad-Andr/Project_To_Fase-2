package cursor.edu.p2.services;

import cursor.edu.p2.model.Trip;
import cursor.edu.p2.repo.TripRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TripServiceImpl implements TripService {

    private final TripRepo tripRepo;

    @Override
    public void addNewTrip(Trip trip) {
        tripRepo.save(trip);
    }

    @Override
    public void deleteTrip(Long idTrip) {
        tripRepo.deleteById(idTrip);
    }

    @Override
    public void updateTrip(Long idTrip, Trip newTrip) {
        tripRepo.deleteById(idTrip);
        tripRepo.save(newTrip);
    }

    @Override
    public List<Trip> findAllTrips() {
        return tripRepo.findAll();
    }

    @Override
    public Optional<Trip> findTripById(Long idTrip) {
        return tripRepo.findById(idTrip);
    }

    @Override
    public List<Trip> findByUserId(Long idUser) {
        return tripRepo.findAllByUserId(idUser);
    }
}
