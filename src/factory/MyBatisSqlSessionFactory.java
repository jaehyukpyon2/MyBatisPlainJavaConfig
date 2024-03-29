package factory;

import config.MyBatisConfig;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class MyBatisSqlSessionFactory {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        //System.out.println("MyBatisSqlSessionFactory static block loaded.");
        sqlSessionFactory = MyBatisConfig.getSqlSessionFactory();
    }

    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
