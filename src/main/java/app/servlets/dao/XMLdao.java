package app.servlets.dao;
import java.util.List;
public interface XMLdao {
    List<Object> parse(String resourceName) throws XMLdaoException;
}

