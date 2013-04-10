/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.diit.observer.webapp.beans;

import edu.diit.observer.webapp.entities.UserSession;

/**
 *
 * @author dreamer
 */
public interface AuthenticatorBean {
    UserSession startSession(String login,String password);
    void stopSession(String sessionId);
    boolean checkSession(String sessionId);
}
