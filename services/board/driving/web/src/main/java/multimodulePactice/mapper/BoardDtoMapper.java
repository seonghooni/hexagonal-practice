package multimodulePactice.mapper;

import multimodulePactice.BoardQueryModels.BoardDetail;
import multimodulePactice.dto.BoardCommandDto.BoardCreateCommand;
import multimodulePactice.dto.BoardCommandDto.BoardUpdateCommand;
import multimodulePactice.dto.BoardQueryDto.BoardDetailResponse;
import multimodulePractice.Board;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BoardDtoMapper {

    Board toDomain(BoardCreateCommand command);

    Board toDomain(Long id, BoardUpdateCommand command);

    BoardDetailResponse toDtoDetail(BoardDetail board);
}
