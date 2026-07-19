package ac.rs.singidunum.itws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String helloWorld(){
        return "<h1>Hello World from Spring Boot!</h1>";
    }
    @GetMapping(path = "/about")
    public String about(){
        return "<h1>You are in the about page</h1>";
    }
}
