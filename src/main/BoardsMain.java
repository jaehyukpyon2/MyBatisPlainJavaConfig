package main;

import dto.BoardsDTO;
import service.BoardsService;
import service.UsersService;
import vo.BoardsVO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class BoardsMain {

    private Scanner scanner = new Scanner(System.in);
    private static BoardsService boardsService;
    private static UsersService usersService;

    static {
        boardsService = new BoardsService();
        usersService = new UsersService();
    }

    public void list() {
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-36s%-60s\n", "no", "writer", "date", "title");
        System.out.println("-----------------------------------------------------------------------");

        List<BoardsVO> allBoardsList = boardsService.getAllBoardsList();
        allBoardsList.forEach(boardsVO -> {
            System.out.printf("%-6s%-12s%-36s%-60s\n", boardsVO.getBno(), boardsVO.getBtitle(), boardsVO.getBdate(),
                    boardsVO.getBwriter(), boardsVO.getBtitle());
        });
        mainMenu();
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("메인메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴선택: ");
        String menuNo = scanner.nextLine();
        System.out.println();

        switch (menuNo) {
            case "1":
                create();
                break;
            case "2":
                read();
                break;
            case "3":
                clear();
                break;
            case "4":
                exit();
                break;
        }
    }

    public void create() {
        BoardsDTO board = new BoardsDTO();
        System.out.println("*** create 메소드 실행됨");

        System.out.println("[새 게시물 입력]");
        System.out.print("제목: ");
        board.setBtitle(scanner.nextLine());
        System.out.print("내용: ");
        board.setBcontent(scanner.nextLine());
        System.out.print("글쓴이: ");
        board.setBwriter(scanner.nextLine());

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("보조메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴선택: ");
        String menuNo = scanner.nextLine();

        if (menuNo.equals("1")) {
            int result = boardsService.insertBoard(board);
            if (result == 1) {
                System.out.println("성공적으로 저장되었습니다.");
            } else {
                System.out.println("새로운 게시글 생성 오류.");
            }
        }
        list();
    }

    public void read() {
        System.out.println("[게시물 읽기]");
        System.out.print("bno: ");
        int bno = Integer.parseInt(scanner.nextLine());

        BoardsVO board = boardsService.readBoard(bno);
        System.out.println("번호: " + board.getBno());
        System.out.println("제목: " + board.getBtitle());
        System.out.println("내용: " + board.getBcontent());
        System.out.println("쓴이: " + board.getBwriter());
        System.out.println("날짜: " + board.getBdate());

        System.out.println("-------------------------------------------------------------------");
        System.out.println("보조메뉴: 1.Update | 2.Delete | 3.List");
        System.out.print("메뉴선택: ");
        String menuNo = scanner.nextLine();
        System.out.println();
        if(menuNo.equals("1")) {
            update(board);
        } else if(menuNo.equals("2")) {
            delete(board);
        }
        list();
    }

    private void delete(BoardsVO board) {
        boardsService.deleteBoard(board.getBno());
    }

    public void update(BoardsVO vo) {
        BoardsDTO board = new BoardsDTO(vo);
        System.out.println("[수정 내용 입력]");
        System.out.print("제목: ");
        board.setBtitle(scanner.nextLine());
        System.out.print("내용: ");
        board.setBcontent(scanner.nextLine());
        System.out.print("글쓴이: ");
        board.setBwriter(scanner.nextLine());

        System.out.println("-------------------------------------------------------------------");
        System.out.println("보조메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴선택: ");
        String menuNo = scanner.nextLine();
        if(menuNo.equals("1")) {
            int result = boardsService.update(board);
            if (result == 1) {
                System.out.println("게시물 업데이트 완료.");
            } else {
                System.out.println("게시물 업데이트 중 오류.");
            }
        }
        list();
    }

    public void clear() {
        System.out.println("[게시물 전체 삭제]");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("보조메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴선택: ");
        String menuNo = scanner.nextLine();
        if(menuNo.equals("1")) {
            boardsService.truncateBoardsTable();
        }
        list();
    }

    public void exit() {
        System.exit(0);
    }

    public static void main(String[] args) {
        BoardsMain boardsMain = new BoardsMain();
        boardsMain.list();
    }
}
