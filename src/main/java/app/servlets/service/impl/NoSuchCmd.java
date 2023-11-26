package app.servlets.service.impl;

import javax.servlet.http.HttpServletRequest;
import app.servlets.controller.JspPageName;
import app.servlets.service.CommandException;
import app.servlets.service.ICommand;

public class NoSuchCmd implements ICommand{
    @Override
    public String execute(HttpServletRequest request) throws CommandException{
        return JspPageName.ERR_PAGE;
    }
}
