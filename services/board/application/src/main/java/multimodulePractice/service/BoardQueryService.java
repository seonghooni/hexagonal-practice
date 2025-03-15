package multimodulePractice.service;

import static me.nettee.board.application.exception.BoardQueryErrorCode.BOARD_NOT_FOUND;

import java.util.Set;
import lombok.RequiredArgsConstructor;
import me.nettee.board.application.domain.type.BoardStatus;
import me.nettee.board.application.model.BoardQueryModels.BoardDetail;
import me.nettee.board.application.model.BoardQueryModels.BoardSummary;
import me.nettee.board.application.port.BoardQueryPort;
import me.nettee.board.application.usecase.BoardReadByStatusesUseCase;
import me.nettee.board.application.usecase.BoardReadUseCase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardQueryService implements BoardReadUseCase, BoardReadByStatusesUseCase {

    private final BoardQueryPort boardQueryPort;

    @Override
    public BoardDetail getBoard(Long id) {
        return boardQueryPort.findById(id)
                .orElseThrow(BOARD_NOT_FOUND::exception);
    }

    @Override
    public Page<BoardSummary> findByStatuses(Set<BoardStatus> statuses, Pageable pageable) {
        return boardQueryPort.findByStatusesList(statuses, pageable);
    }
}
