package esprit.tn.candidature;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic3/candidature")
public class CandudatureRestApi {
    @GetMapping("/hello")
    public String sayHello() {

        return "Hello Im microservice 3!";
    }
}
