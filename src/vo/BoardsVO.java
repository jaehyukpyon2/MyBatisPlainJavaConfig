package vo;

import dto.BoardsDTO;
import dto.UsersDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@ToString
@NoArgsConstructor
public class BoardsVO {

    private Integer bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private LocalDateTime bdate;
    private String bfilename;
    private String bfiledata;

    public String format() {
        return this.bdate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public BoardsVO(BoardsDTO dto) {
        this.bno = dto.getBno();
        this.btitle = dto.getBtitle();
        this.bcontent = dto.getBcontent();
        this.bwriter = dto.getBwriter();
        this.bdate = dto.getBdate();
        this.bfilename = dto.getBfilename();
        this.bfiledata = dto.getBfiledata();
    }
}
