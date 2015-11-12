package hello;

import org.springframework.stereotype.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class Application {

	@RequestMapping(value="/")
	public String hello() {
		return "redirect:/hello.html";
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
