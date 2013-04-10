/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.diit.observer.webapp.beans;

/**
 *
 * @author dreamer
 */
public class AnalysisCriterion {
    private String name;
    private int value;
    private int maxValue;

    public AnalysisCriterion() {
    }

    public AnalysisCriterion(String name, int value, int maxValue) {
        this.name = name;
        this.value = value;
        this.maxValue = maxValue;
    }
    
    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "AnalysisCriterion{" + "name=" + name + ", value=" + value + ", maxValue=" + maxValue + '}';
    }
    
    
}
