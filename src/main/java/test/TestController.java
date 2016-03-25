package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	
	@RequestMapping(value="view/showMessage")
	public showMessage(@RequestParam(value="name") String name)
	{
		String message="岑尹皓";
		
		
	}

}
