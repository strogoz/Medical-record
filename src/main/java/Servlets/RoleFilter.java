package Servlets;

import Client.User;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static Client.User.ADMIN;

@WebFilter(filterName = "RoleFilter")
public class RoleFilter implements Filter{

    public void destroy(){

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException,IOException{
        HttpServletRequest httpRequest = (HttpServletRequest) req;
        HttpServletResponse httpResponce = (HttpServletResponse) resp;

        User user = (User) httpRequest.getSession().getAttribute("user");
        if (user != null && user.getRole() == ADMIN){
            chain.doFilter(req,resp);
        } else {
            httpResponce.sendRedirect("webapp/pages/accesDenied.jsp");
        }
    }

    public void init(FilterConfig config) throws ServletException{

    }

}
