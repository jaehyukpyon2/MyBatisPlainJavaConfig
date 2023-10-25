package main;

import dto.BoardsDTO;
import service.BoardsService;
import vo.BoardsVO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BoardsTest {

    private static BoardsService service;

    static {
        service = new BoardsService();
    }

    public static void main(String[] args) {
        /*BoardsDTO boardsDTO = new BoardsDTO("title1", "content1", "writer1", "filename1", "filedata1");
        int result = service.insertBoard(boardsDTO);

        System.out.println("----------------------");*/

        List<BoardsVO> allBoardsList = service.getAllBoardsList();
        allBoardsList.forEach(System.out::println);
        System.out.println("================");

        String formatted = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(formatted);
    }
}
