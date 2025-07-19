@RestController
@RequestMapping("/loan")
public class LoanController {
    @GetMapping
    public String getLoan() {
        return "Loan details";
    }
}
