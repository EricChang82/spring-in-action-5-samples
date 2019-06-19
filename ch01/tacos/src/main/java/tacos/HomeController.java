package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller            // <1>

/*In fact, a handful of other annotations (including @Component , @Service , and
@Repository ) serve a purpose similar to @Controller . You could have just as effec-
tively annotated HomeController  with any of those other annotations, and it would
have still worked the same. The choice of @Controller  is, however, more descriptive
of this component’s role in the application.
The home()  method is as simple as controlle
//@Component 
 实测 替换后会异常。 
*/public class HomeController {

  @GetMapping("/")     // <2>
  public String home() {
    return "home";     // <3>
  }

}
