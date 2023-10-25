package mapper;

import org.apache.ibatis.annotations.Mapper;
import vo.BoardsVO;
import vo.UsersVO;

import java.util.List;

@Mapper
public interface BoardsMapper {

    List<BoardsVO> getAllBoardsList();

    int insertBoard(BoardsVO vo);

    BoardsVO readBoard(Integer bno);

    int updateBoard(BoardsVO vo);

    int deleteBoard(Integer bno);

    void truncateBoardsTable();
}
