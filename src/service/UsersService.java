package service;

import dto.UsersDTO;
import factory.MyBatisSqlSessionFactory;
import mapper.UsersMapper;
import org.apache.ibatis.session.SqlSession;
import vo.UsersVO;

import java.util.List;

public class UsersService {

    public List<UsersVO> getAllUsersList() {
        UsersMapper mapper = MyBatisSqlSessionFactory.getSqlSession().getMapper(UsersMapper.class);
        List<UsersVO> allUsersList = mapper.getAllUsersList();
        return allUsersList;
    }

    public int insertUser(UsersDTO dto) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class);
        UsersVO vo = new UsersVO(dto);
        int result = mapper.insertUser(vo);
        if (result == 1) {
            sqlSession.commit();
        }
        return result;
    }
}
