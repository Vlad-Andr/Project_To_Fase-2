package cursor.edu.p2.services;

import cursor.edu.p2.model.User;
import cursor.edu.p2.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserServise {

    private final UserRepo userRepo;

    @Override
    public void addNewUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void deleteUser(Long idUser) {
        userRepo.deleteById(idUser);
    }

    @Override
    public void updateUser(Long idUser, User newUser) {
        userRepo.deleteById(idUser);
        userRepo.save(newUser);
    }
}
