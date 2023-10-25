package dto;

import lombok.*;
import vo.BoardsVO;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardsDTO {

    private Integer bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private LocalDateTime bdate;
    private String bfilename;
    private String bfiledata;

    public BoardsDTO(String btitle, String bcontent, String bwriter, String bfilename, String bfiledata) {
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bwriter = bwriter;
        this.bfilename = bfilename;
        this.bfiledata = bfiledata;
    }

    public BoardsDTO(BoardsVO vo) {
        this.bno = vo.getBno();
        this.btitle = vo.getBtitle();
        this.bcontent = vo.getBcontent();
        this.bwriter = vo.getBwriter();
        this.bdate = vo.getBdate();
        this.bfilename = vo.getBfilename();
        this.bfiledata = vo.getBfiledata();
    }
}
