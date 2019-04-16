package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.InfoDao;
import com.Util.pachongUtil;
import org.json.JSONArray;
import org.json.JSONObject;


/**
 * Servlet implementation class pachong
 */
@WebServlet("/pachong")
public class pachong extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pachong() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("GBK"); 
		
	  	response.setContentType("text/html;charset=GBK");          
        /* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");  


        String word = request.getParameter("word");
        pachongUtil pachong = new pachongUtil();
        String result = pachong.word("大数据");
    	JSONArray jsonArray = new JSONArray();
		PrintWriter out = response.getWriter();

			Map<String, Object> map = new HashMap<String, Object>();
			map.put("result", result);
			JSONObject wordjson = new JSONObject(map);
			jsonArray.put(wordjson);

	
		response.getWriter().print(jsonArray.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
