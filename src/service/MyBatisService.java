package service;

import dao.Employee;
import dao.MyBatisDAO;
import factory.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MyBatisService {

    private MyBatisDAO dao;

    public MyBatisService() {
        this.dao = new MyBatisDAO();
    }

    public List<Employee> selectAll() {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        List<Employee> list = null;
        try {
            list = dao.selectAll(sqlSession);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("selectAll() executed.");
        }
        return list;
    }

    public Employee selectOne(int employeeId) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        Employee employee = null;
        try {
            employee = dao.selectByEmployeeId(sqlSession, employeeId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("selectOne() executed.");
        }
        return employee;
    }
}
