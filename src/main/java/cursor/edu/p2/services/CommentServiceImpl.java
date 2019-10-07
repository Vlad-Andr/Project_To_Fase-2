package cursor.edu.p2.services;

import cursor.edu.p2.model.Comment;
import cursor.edu.p2.repo.CommentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {
    private final CommentRepo commentRepo;

    @Override
    public void commentForPlace(Comment comment) {
        commentRepo.save(comment);
    }
}
