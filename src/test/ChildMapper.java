package test;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChildMapper {
    List<ChildDAO> getAllChildWithParent();
    List<ChildDAO> getAllChild();
}
