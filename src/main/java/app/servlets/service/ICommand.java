package app.servlets.service;

import javax.servlet.http.HttpServletRequest;
public interface ICommand {
    public String execute(HttpServletRequest request) throws CommandException;
}
