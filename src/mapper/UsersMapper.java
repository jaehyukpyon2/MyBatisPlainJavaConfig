package mapper;

import org.apache.ibatis.annotations.Mapper;
import vo.UsersVO;

import java.util.List;

@Mapper
public interface UsersMapper {

    List<UsersVO> getAllUsersList();

    int insertUser(UsersVO vo);
}
