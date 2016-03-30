import com.ilya.restapi.DAO;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Илья on 30.03.2016.
 */
@javax.servlet.annotation.WebServlet(name = "AllBuildingsServlet", urlPatterns = "/all_buildings")
public class AllBuildingsServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        /*try {
            request.setAttribute("buildings_list", DAO.getAllBuildings());
        } catch (SQLException   | ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        try {
            String arr = DAO.getAllBuildingsJSON().toString();
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            PrintWriter out = response.getWriter();
            out.print(arr);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }


       // request.getRequestDispatcher("/all_buildings.jsp").forward(request, response);
    }
}
