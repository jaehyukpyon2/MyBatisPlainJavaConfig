package test;

import lombok.ToString;

@ToString
public class ChildDAO {

    int id;
    String childName;
    int childAge;

    private ParentDAO parentDAO;
}
