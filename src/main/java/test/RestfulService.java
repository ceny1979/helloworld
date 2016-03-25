package test;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;;

@Controller
public class RestfulService {
	
	private final static Logger logger=LoggerFactory.getLogger(RestfulService.class);
	@RequestMapping(value="rest/getmap")
	public Map<String,Object> getRest(@RequestParam(value="parm",defaultValue="haha")  String parm){
		Map<String,Object>map=new HashMap<String,Object>();
		map.put("result", parm+"hello");
		map.put("result2", "helloWorld");
		for(int i=0;i<10;i++)
		{
		logger.info("+++++++岑尹皓");
		}
		
		return map;
	}

}
