package Util.Pojos;

import Util.Pojos.Address;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FirstUserPOJO {
            private int id;
           private String  name;
            private String username;
              private String email;
          Address AdressObject;




}
