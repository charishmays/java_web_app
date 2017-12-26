

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigServlet
 */
public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfigServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    InputStream baseStream = this.getClass().getClassLoader().getResourceAsStream("base.properties");
	    	Properties baseProps = new Properties();
	    	baseProps.load(baseStream);
	    
	    	InputStream configStream = this.getClass().getClassLoader().getResourceAsStream("config.properties");
	    	Properties configProps = new Properties();
	    	configProps.load(configStream);
	    	String siteName = (String) configProps.get("site_name");
	    	String version = (String) baseProps.get("version");
	    	
		response.getWriter().append("Served at: ").append(siteName).append(", version : " ).append(version);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
