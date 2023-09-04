package example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


@WebServlet("/jab_data.do")
public class job_data extends HttpServlet {
	PrintWriter pw = null;
	private static final long serialVersionUID = 1L;

    public job_data() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/json; charset=utf-8");
		response.setHeader("Access-Control-Allow-Origin","*");
		this.pw =response.getWriter();
		try {		
			String key = request.getParameter("key").intern();
			if(key == null || key == "") {
				this.pw.write("key_error");
			}
			else if(key == "a123456") {
				//this.pw.write("success");
				//대표키 : user+list
				//이름 : user_name
				//성격 : analyze
				String user[][] = {
						{"김승균","박병준","이경선","장진호","최현제"},
						{"INFP","ENIP","EJNP","INTP","ENJP"}	
				};
				JSONObject jo = new JSONObject();
				JSONArray ja = new JSONArray();
				
				int w= 0;
				do {
					int ww =0;
					JSONObject jo2 = new JSONObject();
					while(ww < user.length) {  //2
						if(ww==0) {
							jo2.put("user_name",user[ww][w]);
						}
						else if(ww==1) {
							jo2.put("analyze", user[ww][w]);
						}
						
						System.out.println(user[ww][w]);
						ww++;
					}
					ja.add(jo2);
					//ja.add(user[0][w]);
					//ja.add(user[0][w]);
					w++;
				}while(w<user[0].length); //5
				
				jo.put("user_list", ja);
				this.pw.write(jo.toString()); //데이터 출력 및 Front 전달
				this.pw.close();
				System.out.println(jo);
			}
		}
		catch(Exception e) {
			this.pw.write("error");
		}
	}
}
