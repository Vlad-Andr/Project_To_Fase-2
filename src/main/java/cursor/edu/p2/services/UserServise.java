package cursor.edu.p2.services;

import cursor.edu.p2.model.User;

public interface UserServise {

    void addNewUser(User user);

    void deleteUser(Long idUser);

    void updateUser(Long idUser, User newUser);

}

