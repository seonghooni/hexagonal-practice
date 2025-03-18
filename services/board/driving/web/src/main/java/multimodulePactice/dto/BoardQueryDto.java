package multimodulePactice.dto;

import lombok.Builder;
import multimodulePactice.BoardQueryModels.BoardDetail;

public final class BoardQueryDto {
    private BoardQueryDto() {}

    @Builder
    public record BoardDetailResponse(
            BoardDetail board
    ){}
}
