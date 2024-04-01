package ma.enset.hospital.security;

import org.springframework.web.bind.annotation.GetMapping;

public class SecurityController {
    @GetMapping("/notAuthorized")
    public String notAuthorized(){
        return "notAuthorized";
    }

}
