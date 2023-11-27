package app.servlets.dao.impl;
import java.util.ArrayList;
import java.util.List;
import app.servlets.dao.XMLdao;
import app.servlets.dao.XMLdaoException;

public final class SaxXMLdao implements XMLdao{
    private final static SaxXMLdao instance = new SaxXMLdao();
    public static XMLdao getInstance(){
        return instance;
    }
    @Override
    public List<Object> parse(String resourceName) throws XMLdaoException{
// stub
        List<Object> list = new ArrayList<>();
        list.add("First string from SAX DAO");
        list.add("Second string from SAX DAO");
        //разобраться, зачем
        return list;
    }

}
