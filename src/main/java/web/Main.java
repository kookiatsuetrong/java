package web;
import org.springframework.web.bind.annotation.*;

@RestController
class Service {
	@GetMapping("/test")
	int showTest() {
		return 123;
	}
}