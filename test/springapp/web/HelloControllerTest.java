package springapp.web;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;

import junit.framework.TestCase;

public class HelloControllerTest extends TestCase {
	protected final Log logger = LogFactory.getLog(getClass());
	
	public void testHandleRequest () throws ServletException, IOException {
		HelloController controller = new HelloController();
		ModelAndView modelAndView = controller.handleRequest(null, null); 
		assertEquals("hello", modelAndView.getViewName());
		assertNotNull(modelAndView.getModel());
		String nowValue = (String)modelAndView.getModel().get("now");
		assertNotNull(nowValue);
	}

}
