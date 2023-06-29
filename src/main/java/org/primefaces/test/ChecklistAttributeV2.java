package org.primefaces.test;

public class ChecklistAttributeV2 {

    private Long id;

    private AttributeV2 attribute;

    private AttributeCategoryV2 attributeCategory;

    private String questionNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuestionNumber(String questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestionNumber() {
        return questionNumber;
    }

    public AttributeV2 getAttribute() {
        return attribute;
    }

    public void setAttribute(AttributeV2 attribute) {
        this.attribute = attribute;
    }

    public AttributeCategoryV2 getAttributeCategory() {
        return attributeCategory;
    }

    public void setAttributeCategory(AttributeCategoryV2 attributeCategory) {
        this.attributeCategory = attributeCategory;
    }

}
