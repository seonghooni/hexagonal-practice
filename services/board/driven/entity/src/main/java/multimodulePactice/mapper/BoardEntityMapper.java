package multimodulePactice.mapper;

import java.util.Optional;
import multimodulePactice.BoardEntity;
import multimodulePactice.BoardQueryModels.BoardDetail;
import multimodulePactice.BoardQueryModels.BoardSummary;
import multimodulePractice.Board;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BoardEntityMapper {

    Board toDomain(BoardEntity boardEntity);

    BoardEntity toEntity(Board board);

    BoardDetail toBoardDetail(BoardEntity boardEntity);

    BoardSummary toBoardSummary(BoardEntity boardEntity);

    default Optional<Board> toOptionalDomain(BoardEntity boardEntity) {
        return Optional.ofNullable(toDomain(boardEntity));
    }

    default Optional<BoardDetail> toOptionalBoardDetail(BoardEntity boardEntity) {
        return Optional.ofNullable(toBoardDetail(boardEntity));
    }
}
