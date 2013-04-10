/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.diit.observer.webapp.beans;

import edu.diit.observer.webapp.entities.UserInfo;
import edu.diit.observer.webapp.entities.UserSession;
import org.hibernate.SessionFactory;

/**
 *
 * @author dreamer
 */
public interface ServiceDao {
    UserInfo createUser(String userLogin,String userPasswordSha1,char role,String passwordSalt);
    UserSession createSession(UserInfo userInfo);
    void selectProject(String userSession,String project);
    void closeSession(String sessionId);
    UserSession getSession(String sessionId);
    UserInfo getUserInfo(String login);
    SessionFactory getHibernateSessionFactory();
}
