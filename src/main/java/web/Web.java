package web;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
class Web {
	@GetMapping("/")
	String showHome() {
		return "home";
	}
}