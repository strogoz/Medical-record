package Servlets;

import Client.User;

import javax.management.relation.Role;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthController extends HttpServlet {
    private static String URL = "jdbc:mysql://localhost:3306/hospital_db";
    private static String USERNAME = "root";
    private static String PASSWORD = "1234";
    private static final String SELECT = "SELECT * FROM hospital_db.users WHERE login = ?; ";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        User user = new User();

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(SELECT);
            preparedStatement.setString(1,login);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                user.setLogin(resultSet.getString("login"));
                user.setPassword(resultSet.getString("password"));
                user.setRole(Role.valueOf(resultSet.getString("role")));
            }
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        req.getSession().setAttribute("user",user);
        if(login.equals(user.getLogin()) && password.equals(user.getPassword()) && "admin".equals(String.valueOf(user.getRole()))){
            req.getRequestDispatcher("webapp/pages/chooseActionAdmin.jsp").forward(req,resp);
        } else if (login.equals(user.getLogin()) && password.equals(user.getPassword()) && "doctor".equals(String.valueOf(user.getRole()))){
            req.getRequestDispatcher("webapp/pages/chooseActionDoctor");
        } else if (login.equals(user.getLogin()) && password.equals(user.getPassword())){
            req.getRequestDispatcher("webapp/pages/chooseActionPatient");
        } else {
            req.setAttribute("errorMessage","Login or password is incorrect");
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }
    }
}
