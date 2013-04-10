/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.diit.observer.webapp.beans;

import java.util.List;

/**
 *
 * @author dreamer
 */
public interface SourceAnalyserBean {
    String getAnalysisClass();
    List<AnalysisCriterion> analyseSource(String sourceFile);
}
