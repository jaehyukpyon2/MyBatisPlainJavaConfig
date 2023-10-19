package dao;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MyBatisDAO {

    public List<Employee> selectAll(SqlSession sqlSession) {
        List<Employee> employeeList = sqlSession.selectList("selectAll");
        return employeeList;
    }

    public Employee selectByEmployeeId(SqlSession sqlSession, int employeeId) {
        return sqlSession.selectOne("selectOne", employeeId);
    }
}
