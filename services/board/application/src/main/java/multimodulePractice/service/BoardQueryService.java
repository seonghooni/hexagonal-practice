package multimodulePractice.service;


import static multimodulePactice.BoardQueryErrorCode.BOARD_NOT_FOUND;

import java.util.Set;
import lombok.RequiredArgsConstructor;
import multimodulePactice.BoardQueryModels.BoardDetail;
import multimodulePactice.BoardQueryModels.BoardSummary;
import multimodulePractice.port.BoardQueryPort;
import multimodulePractice.type.BoardStatus;
import multimodulePractice.usecase.BoardReadByStatusesUseCase;
import multimodulePractice.usecase.BoardReadUseCase;
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
