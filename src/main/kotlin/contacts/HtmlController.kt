
import org.springframework.stereotype.Controller
import contacts.ContactService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.ui.Model

@Controller
class HtmlController(private val contactService: ContactService) {
    

    @GetMapping("/")
    fun contacts(model: Model): String {
        model.addAttribute("contactCount", contactService.getContactCount())
        return "index"
    }
}