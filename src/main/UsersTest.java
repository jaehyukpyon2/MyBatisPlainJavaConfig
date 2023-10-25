package main;

import service.UsersService;

public class UsersTest {

    private static UsersService usersService;

    static {
        usersService = new UsersService();
    }

    public static void main(String[] args) {
        /*List<UsersVO> allUsersList = usersService.getAllUsersList();
        allUsersList.forEach(System.out::println);

        System.out.println("----------");

        UsersDAO dao = new UsersDAO("test1", "test1name",
                "12345", 26, "test1@gmail.com");
        int result = usersService.insertUser(dao);
        if (result == 1) {

        }
        System.out.println("result: " + result);

        System.out.println("==========");
        List<UsersVO> allUsersList2 = usersService.getAllUsersList();
        allUsersList2.forEach(System.out::println);*/
    }
}
