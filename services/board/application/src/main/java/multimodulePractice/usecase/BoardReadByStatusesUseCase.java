package multimodulePractice.usecase;

import java.util.Set;
import multimodulePactice.BoardQueryModels.BoardSummary;
import multimodulePractice.type.BoardStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardReadByStatusesUseCase {

    Page<BoardSummary> findByStatuses(Set<BoardStatus> statuses, Pageable pageable);
}

