package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class UsersDTO {

    private String userid;
    private String username;
    private String userpassword;
    private Integer userage;
    private String useremail;
}
