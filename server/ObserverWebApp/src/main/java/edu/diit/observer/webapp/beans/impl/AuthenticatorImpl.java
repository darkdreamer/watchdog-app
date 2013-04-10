/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.diit.observer.webapp.beans.impl;

import edu.diit.observer.webapp.beans.AuthenticatorBean;
import edu.diit.observer.webapp.beans.ServiceDao;
import edu.diit.observer.webapp.entities.UserSession;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dreamer
 */
@Component
public class AuthenticatorImpl implements AuthenticatorBean {
    
    private static final int SESSION_LIFETIME_MS=30* 60* 1000;
    
    @Autowired
    private ServiceDao serviceDao;

    @Override
    @Transactional(propagation= Propagation.REQUIRED)
    public boolean checkSession(String sessionId) {
        UserSession session = serviceDao.getSession(sessionId);
        if(session==null)
            return false;
        
        int lastTs = session.getLastPingTimestamp();
        long delta = System.currentTimeMillis()-lastTs;
        
        if(delta>SESSION_LIFETIME_MS){
            serviceDao.closeSession(sessionId);
            return false;
        }else{
            session.setLastPingTimestamp((int)System.currentTimeMillis());
            Session hibernate = serviceDao.getHibernateSessionFactory().getCurrentSession();
            hibernate.persist(session);
            return true;
        }
        
    }

    @Override
    public UserSession startSession(String login, String password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void stopSession(String sessionId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
