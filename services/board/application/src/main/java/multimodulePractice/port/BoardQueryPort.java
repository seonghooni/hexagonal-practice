package multimodulePractice.port;

import java.awt.print.Pageable;
import java.util.Optional;
import java.util.Set;
import multimodulePactice.BoardQueryModels.BoardDetail;
import multimodulePactice.BoardQueryModels.BoardSummary;
import multimodulePractice.type.BoardStatus;
import org.springframework.data.domain.Page;

public interface BoardQueryPort {

    Optional<BoardDetail> findById(Long id);

    Page<BoardSummary> findAll(Pageable pageable);

    Page<BoardSummary> findByStatusesList(Set<BoardStatus> statuses, Pageable pageable);
}
    