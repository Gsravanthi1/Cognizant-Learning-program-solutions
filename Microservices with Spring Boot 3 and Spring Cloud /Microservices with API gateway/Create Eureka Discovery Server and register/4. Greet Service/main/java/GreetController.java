@RestController
@RequestMapping("/greet")
public class GreetController {
    @GetMapping
    public String greet() {
        return "Hello World";
    }
}
