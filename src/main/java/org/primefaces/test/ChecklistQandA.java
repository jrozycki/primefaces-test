package org.primefaces.test;

public class ChecklistQandA {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String failReason;
    private String resolvedRationale;

    private ChecklistAttributeV2 checklistAttribute;

    private ToggleValue toggleValue;

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public String getResolvedRationale() {
        return resolvedRationale;
    }

    public void setResolvedRationale(String resolvedRationale) {
        this.resolvedRationale = resolvedRationale;
    }

    public ToggleValue getToggleValue() {
        return toggleValue;
    }

    public void setToggleValue(ToggleValue toggleValue) {
        this.toggleValue = toggleValue;
    }

    public ChecklistAttributeV2 getChecklistAttribute() {
        return checklistAttribute;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setChecklistAttribute(ChecklistAttributeV2 checklistAttribute) {
        this.checklistAttribute = checklistAttribute;
    }

}
