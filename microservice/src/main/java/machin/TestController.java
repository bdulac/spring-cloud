package machin;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Service de test.
 */
@RestController
@RequestMapping("/test")
public class TestController {
	
	private static final Logger log = Logger.getLogger(TestController.class.getName());
	
	@RequestMapping(method=RequestMethod.GET)
	public String get() {
		log.info("TEST SENT");
		return "Test réussi";
	}

}
