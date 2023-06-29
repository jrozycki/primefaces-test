package org.primefaces.test;

public enum ToggleValue {
//0=?,1=yes, 2=no, 3=na, 4=resolved
    //@formatter:off
    NO("No"), 
    NOa("No"), 
    RESOLVED("Resolved"),
    YES("Yes"), 
    NO_MAJOR("Major No Finding"), 
    NO_MINOR("Minor No Finding"),
    NO_MAJOR_TEMP("Major No Finding"), 
    NO_MINOR_TEMP("Minor No Finding"), 
    NA("Not Applicable"), 
    RESOLVED_MAJOR("Major No Finding"),
    RESOLVED_MINOR("Minor No Finding");
    //@formatter:on

    private String label;

    private ToggleValue(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}