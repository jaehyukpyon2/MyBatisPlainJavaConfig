import dao.Employee;
import service.MyBatisService;

import java.util.List;

public class MyBatisTest {

    public static void main(String[] args) {
        MyBatisService myBatisService = new MyBatisService();
        List<Employee> employees = myBatisService.selectAll();
        System.out.println();

        /*for (Employee employee : employees) {
            System.out.println(employee);
        }*/
        Employee employee = myBatisService.selectOne(153);
        System.out.println(employee);
    }
}
