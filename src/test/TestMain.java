package test;

import java.util.List;

public class TestMain {
    
    private static ChildService childService = new ChildService();
    
    public static void main(String[] args) {
        List<ChildDAO> allChildList = childService.getAllChildList();
        System.out.println(allChildList);
        System.out.println("end-");
        System.out.println("end-");
    }
}
