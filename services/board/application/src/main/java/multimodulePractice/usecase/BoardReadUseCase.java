package multimodulePractice.usecase;


import multimodulePactice.BoardQueryModels.BoardDetail;

public interface BoardReadUseCase {

    BoardDetail getBoard(Long id);
}