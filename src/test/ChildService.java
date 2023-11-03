package test;

import factory.MyBatisSqlSessionFactory;

import java.util.List;

public class ChildService {

    public List<ChildDAO> getAllChildList() {
        ChildMapper mapper = MyBatisSqlSessionFactory.getSqlSession().getMapper(ChildMapper.class);
        List<ChildDAO> all = mapper.getAll();
        return all;
    }
}
