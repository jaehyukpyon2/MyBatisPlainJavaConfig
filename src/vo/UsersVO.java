package vo;

import dto.UsersDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class UsersVO {

    private String userid;
    private String username;
    private String userpassword;
    private Integer userage;
    private String useremail;

    public UsersVO(UsersDTO dto) {
        this.userid = dto.getUserid();
        this.username = dto.getUsername();
        this.userpassword = dto.getUserpassword();
        this.userage = dto.getUserage();
        this.useremail = dto.getUseremail();
    }
}
