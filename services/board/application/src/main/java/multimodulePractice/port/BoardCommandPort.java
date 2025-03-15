package multimodulePractice.port;

import java.util.Optional;
import multimodulePractice.Board;
import multimodulePractice.type.BoardStatus;

public interface BoardCommandPort {

    Optional<Board> findById(Long id);

    Board create(Board board);

    Board update(Board board);

    void updateStatus(Long id, BoardStatus status);
}
