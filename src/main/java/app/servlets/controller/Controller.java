package app.servlets.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.servlets.service.ICommand;
import app.servlets.service.CommandHelper;
import app.servlets.service.CommandException;


public class Controller extends HttpServlet{
    private static final long serialVersionUID = 1L;
    public Controller() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String commandName =
                request.getParameter(RequestParameterName.COMMAND_NAME);
        ICommand command = CommandHelper.getInstance().getCommand(commandName);
        String page = null;
        try {
            page = command.execute(request);
        } catch (CommandException e) {
            page = JspPageName.ERR_PAGE;
        } catch (Exception e){
            page = JspPageName.ERR_PAGE;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        if (dispatcher != null){
            dispatcher.forward(request, response);
        } else{
            errorMessageDireclyFromresponse(response);
        }
    }
    private void errorMessageDireclyFromresponse(HttpServletResponse response) throws
            IOException{
        response.setContentType("text/html");
        response.getWriter().println("ERROR occurred");
    }
}