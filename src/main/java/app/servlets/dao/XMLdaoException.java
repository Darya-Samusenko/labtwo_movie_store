package app.servlets.dao;

import app.servlets.exception.ProjectException;
public class XMLdaoException extends ProjectException {
    private static final long serialVersionUID = 1L;
    public XMLdaoException(String msg){
        super(msg);
    }
    public XMLdaoException(String msg, Exception e){
        super(msg, e);
    }
}

