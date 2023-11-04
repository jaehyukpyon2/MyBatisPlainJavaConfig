package test;

import factory.MyBatisSqlSessionFactory;

import java.util.List;

public class ChildService {

    public List<ChildDAO> getAllChildWithParent() {
        ChildMapper mapper = MyBatisSqlSessionFactory.getSqlSession().getMapper(ChildMapper.class);
        List<ChildDAO> all = mapper.getAllChildWithParent();
        return all;
    }

    public List<ChildDAO> getAllChild() {
        ChildMapper mapper = MyBatisSqlSessionFactory.getSqlSession().getMapper(ChildMapper.class);
        List<ChildDAO> all = mapper.getAllChild();
        return all;
    }
}
