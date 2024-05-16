package services;
import entities.Session;
import java.util.List;
import java.util.ArrayList;
import core.Services;

public class SessionService implements Services<Session>{
    List <Session> sessions = new ArrayList<>();
    @Override
    public boolean save(Session session) {
        sessions.add(session);
        return true;
    }

    @Override
    public List<Session> show() {
        return sessions;
    }

    @Override
    public Session findById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public int count() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }
    
}
