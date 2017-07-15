package springapp.web;

import java.io.IOException;

import javax.servlet.ServletException;

import org.springframework.web.servlet.ModelAndView;

import junit.framework.TestCase;

public class HelloControllerTest extends TestCase {
	public void testHandleRequest () throws ServletException, IOException {
		HelloController controller = new HelloController();
		ModelAndView modelAndView = controller.handleRequest(null, null);
		assertEquals("hello.jsp", modelAndView.getViewName());
	}

}
