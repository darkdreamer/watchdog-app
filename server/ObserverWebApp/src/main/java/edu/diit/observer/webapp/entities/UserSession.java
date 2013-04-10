/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.diit.observer.webapp.entities;

/**
 *
 * @author dreamer
 */
public class UserSession {
    String userName;
    String sessionId;
    int lastPingTimestamp;
    String workingProject;

    public int getLastPingTimestamp() {
        return lastPingTimestamp;
    }

    public void setLastPingTimestamp(int lastPingTimestamp) {
        this.lastPingTimestamp = lastPingTimestamp;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getWorkingProject() {
        return workingProject;
    }

    public void setWorkingProject(String workingProject) {
        this.workingProject = workingProject;
    }
    
}
