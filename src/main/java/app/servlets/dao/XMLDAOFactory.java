package app.servlets.dao;
import app.servlets.dao.impl.*;
public class XMLDAOFactory {
    private final static XMLDAOFactory instance = new XMLDAOFactory();
    public static XMLDAOFactory getInstance() {
        return instance;
    }
    public XMLdao getDAO(DAOType type) throws XMLdaoException {
        XMLdao dao;
        switch (type) {
            case SAX:
                return SaxXMLdao.getInstance();
            default:
                throw new XMLdaoException("No such DAO");
        }
    }
    public enum DAOType {
        SAX, STAX, DOM;
    }
}

