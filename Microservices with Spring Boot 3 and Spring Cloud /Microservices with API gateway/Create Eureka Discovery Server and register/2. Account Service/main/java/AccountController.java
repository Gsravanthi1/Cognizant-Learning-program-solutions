@RestController
@RequestMapping("/account")
public class AccountController {
    @GetMapping
    public String getAccount() {
        return "Account details";
    }
}
