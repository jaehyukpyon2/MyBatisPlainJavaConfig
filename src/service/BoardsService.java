package service;

import dto.BoardsDTO;
import factory.MyBatisSqlSessionFactory;
import mapper.BoardsMapper;
import org.apache.ibatis.session.SqlSession;
import vo.BoardsVO;

import java.util.List;

public class BoardsService {

    public List<BoardsVO> getAllBoardsList() {
        BoardsMapper mapper = MyBatisSqlSessionFactory.getSqlSession().getMapper(BoardsMapper.class);
        List<BoardsVO> allBoardsList = mapper.getAllBoardsList();
        return allBoardsList;
    }

    public int insertBoard(BoardsDTO dto) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        BoardsMapper mapper = sqlSession.getMapper(BoardsMapper.class);
        BoardsVO vo = new BoardsVO(dto);
        int result = mapper.insertBoard(vo);

        if (result == 1) {
            sqlSession.commit();
        }
        return result;
    }

    public BoardsVO readBoard(Integer bno) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        BoardsMapper mapper = sqlSession.getMapper(BoardsMapper.class);
        BoardsVO vo = mapper.readBoard(bno);
        return vo;
    }

    public int update(BoardsDTO board) {
        BoardsVO vo = new BoardsVO(board);
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        BoardsMapper mapper = sqlSession.getMapper(BoardsMapper.class);
        int result = mapper.updateBoard(vo);
        if (result == 1) {
            sqlSession.commit();
        }
        return result;
    }

    public void deleteBoard(Integer bno) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        BoardsMapper mapper = sqlSession.getMapper(BoardsMapper.class);
        int result = mapper.deleteBoard(bno);
        if (result == 1) {
            System.out.println("게시물 삭제 성공.");
            sqlSession.commit();
        } else {
            System.out.println("게시물 삭제 실패.");
        }
    }

    public void truncateBoardsTable() {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        sqlSession.delete("mapper.BoardsMapper.truncateBoardsTable");
        sqlSession.commit();
    }
}
