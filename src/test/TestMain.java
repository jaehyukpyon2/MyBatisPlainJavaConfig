package test;

import java.util.List;

public class TestMain {
    
    private static ChildService childService = new ChildService();
    
    public static void main(String[] args) {
        List<ChildDAO> allChildList = childService.getAllChildWithParent();
        System.out.println(allChildList);
        System.out.println("end-");

        List<ChildDAO> allChild = childService.getAllChild();
        System.out.println(allChild);
        System.out.println();
    }
}
