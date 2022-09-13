package com.exampletime.demotime;

// import javax.validation.constraints.Max;  // TO work you need dependency spring-boot-starter-validation !!!!!!
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Profile {

    @Min(3)
   // @Max(12)

    private String forename;

 

    private String gender;

    // @Pattern ("^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$")
    // private String email;
    
    // @NotBlank
    @NotNull
    private String etnicity;

   // G&S

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }
}
