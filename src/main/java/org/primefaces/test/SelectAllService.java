package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class SelectAllService implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<ChecklistQandA> stage1Questions;

    @PostConstruct
    public void init() {
        stage1Questions = new ArrayList<>();

        ChecklistQandA question = new ChecklistQandA();
        ChecklistAttributeV2 checklistAttribute = new ChecklistAttributeV2();
        AttributeCategoryV2 attributeCategory = new AttributeCategoryV2();
        AttributeV2 attribute = new AttributeV2();

        attributeCategory.setId((long) 222);
        attributeCategory.setHeaderText("Section 1a - Model Development: Geometry and Extent");
        checklistAttribute.setId((long) 832);
        checklistAttribute.setQuestionNumber("1a-1");
        attribute.setId((long) 825);
        attribute.setStem("Is the geometry of the item...");
        question.setId((long) 42562);
        checklistAttribute.setAttribute(attribute);
        checklistAttribute.setAttributeCategory(attributeCategory);
        question.setChecklistAttribute(checklistAttribute);
        stage1Questions.add(question);

        question = new ChecklistQandA();
        checklistAttribute = new ChecklistAttributeV2();
        attributeCategory = new AttributeCategoryV2();
        attribute = new AttributeV2();
        attributeCategory.setId((long) 222);
        attributeCategory.setHeaderText("Section 1a - Model Development: Geometry and Extent");
        checklistAttribute.setId((long) 833);
        checklistAttribute.setQuestionNumber("1a-2");
        attribute.setId((long) 826);
        attribute.setStem("Do the model dimensions...");
        question.setId((long) 42607);
        checklistAttribute.setAttribute(attribute);
        checklistAttribute.setAttributeCategory(attributeCategory);
        question.setChecklistAttribute(checklistAttribute);
        stage1Questions.add(question);

        question = new ChecklistQandA();
        checklistAttribute = new ChecklistAttributeV2();
        attributeCategory = new AttributeCategoryV2();
        attribute = new AttributeV2();
        attributeCategory.setId((long) 222);
        attributeCategory.setHeaderText("Section 1a - Model Development: Geometry and Extent");
        checklistAttribute.setId((long) 2270);
        checklistAttribute.setQuestionNumber("1a-3");
        attribute.setId((long) 827);
        attribute.setStem("Is the extent of the model...");
        question.setId((long) 42564);
        checklistAttribute.setAttribute(attribute);
        checklistAttribute.setAttributeCategory(attributeCategory);
        question.setChecklistAttribute(checklistAttribute);
        stage1Questions.add(question);

        question = new ChecklistQandA();
        checklistAttribute = new ChecklistAttributeV2();
        attributeCategory = new AttributeCategoryV2();
        attribute = new AttributeV2();
        attributeCategory.setId((long) 222);
        attributeCategory.setHeaderText("Section 1a - Model Development: Geometry and Extent");
        checklistAttribute.setId((long) 7525);
        checklistAttribute.setQuestionNumber("1a-4");
        attribute.setId((long) 828);
        attribute.setStem("For submodels, is...");
        question.setId((long) 42565);
        checklistAttribute.setAttribute(attribute);
        checklistAttribute.setAttributeCategory(attributeCategory);
        question.setChecklistAttribute(checklistAttribute);
        stage1Questions.add(question);

        question = new ChecklistQandA();
        checklistAttribute = new ChecklistAttributeV2();
        attributeCategory = new AttributeCategoryV2();
        attribute = new AttributeV2();
        attributeCategory.setId((long) 223);
        attributeCategory.setHeaderText("Section 1b - Model Development: Element Selection and Usage");
        checklistAttribute.setId((long) 2271);
        checklistAttribute.setQuestionNumber("1b-1");
        attribute.setId((long) 829);
        attribute.setStem("Are appropriate...");
        question.setId((long) 42566);
        checklistAttribute.setAttribute(attribute);
        checklistAttribute.setAttributeCategory(attributeCategory);
        question.setChecklistAttribute(checklistAttribute);
        stage1Questions.add(question);

        question = new ChecklistQandA();
        checklistAttribute = new ChecklistAttributeV2();
        attributeCategory = new AttributeCategoryV2();
        attribute = new AttributeV2();
        attributeCategory.setId((long) 223);
        attributeCategory.setHeaderText("Section 1b - Model Development: Element Selection and Usage");
        checklistAttribute.setId((long) 2272);
        checklistAttribute.setQuestionNumber("1b-2");
        attribute.setId((long) 830);
        attribute.setStem("Are material...");
        question.setId((long) 42567);
        checklistAttribute.setAttribute(attribute);
        checklistAttribute.setAttributeCategory(attributeCategory);
        question.setChecklistAttribute(checklistAttribute);
        stage1Questions.add(question);

        question = new ChecklistQandA();
        checklistAttribute = new ChecklistAttributeV2();
        attributeCategory = new AttributeCategoryV2();
        attribute = new AttributeV2();
        attributeCategory.setId((long) 223);
        attributeCategory.setHeaderText("Section 1b - Model Development: Element Selection and Usage");
        checklistAttribute.setId((long) 7526);
        checklistAttribute.setQuestionNumber("1b-3");
        attribute.setId((long) 831);
        attribute.setStem("Are cross section...");
        question.setId((long) 42568);
        checklistAttribute.setAttribute(attribute);
        checklistAttribute.setAttributeCategory(attributeCategory);
        question.setChecklistAttribute(checklistAttribute);
        stage1Questions.add(question);

        question = new ChecklistQandA();
        checklistAttribute = new ChecklistAttributeV2();
        attributeCategory = new AttributeCategoryV2();
        attribute = new AttributeV2();
        attributeCategory.setId((long) 224);
        attributeCategory.setHeaderText("Section 1c - Model Development: Connectivity");
        checklistAttribute.setId((long) 7547);
        checklistAttribute.setQuestionNumber("1c-1");
        attribute.setId((long) 2295);
        attribute.setStem("Are boundary conditions...");
        question.setId((long) 42584);
        checklistAttribute.setAttribute(attribute);
        checklistAttribute.setAttributeCategory(attributeCategory);
        question.setChecklistAttribute(checklistAttribute);
        stage1Questions.add(question);

        question = new ChecklistQandA();
        checklistAttribute = new ChecklistAttributeV2();
        attributeCategory = new AttributeCategoryV2();
        attribute = new AttributeV2();
        attributeCategory.setId((long) 224);
        attributeCategory.setHeaderText("Section 1c - Model Development: Connectivity");
        checklistAttribute.setId((long) 7548);
        checklistAttribute.setQuestionNumber("1c-2");
        attribute.setId((long) 2296);
        attribute.setStem("Are constraints...");
        question.setId((long) 42585);
        checklistAttribute.setAttribute(attribute);
        checklistAttribute.setAttributeCategory(attributeCategory);
        question.setChecklistAttribute(checklistAttribute);
        stage1Questions.add(question);

        question = new ChecklistQandA();
        checklistAttribute = new ChecklistAttributeV2();
        attributeCategory = new AttributeCategoryV2();
        attribute = new AttributeV2();
        attributeCategory.setId((long) 224);
        attributeCategory.setHeaderText("Section 1c - Model Development: Connectivity");
        checklistAttribute.setId((long) 7549);
        checklistAttribute.setQuestionNumber("1c-3");
        attribute.setId((long) 2297);
        attribute.setStem("Are discrete...");
        question.setId((long) 42586);
        checklistAttribute.setAttribute(attribute);
        checklistAttribute.setAttributeCategory(attributeCategory);
        question.setChecklistAttribute(checklistAttribute);
        stage1Questions.add(question);

        question = new ChecklistQandA();
        checklistAttribute = new ChecklistAttributeV2();
        attributeCategory = new AttributeCategoryV2();
        attribute = new AttributeV2();
        attributeCategory.setId((long) 224);
        attributeCategory.setHeaderText("Section 1c - Model Development: Connectivity");
        checklistAttribute.setId((long) 7550);
        checklistAttribute.setQuestionNumber("1c-4");
        attribute.setId((long) 2298);
        attribute.setStem("If stiffness elements...");
        question.setId((long) 42587);
        checklistAttribute.setAttribute(attribute);
        checklistAttribute.setAttributeCategory(attributeCategory);
        question.setChecklistAttribute(checklistAttribute);
        stage1Questions.add(question);

        question = new ChecklistQandA();
        checklistAttribute = new ChecklistAttributeV2();
        attributeCategory = new AttributeCategoryV2();
        attribute = new AttributeV2();
        attributeCategory.setId((long) 224);
        attributeCategory.setHeaderText("Section 1c - Model Development: Connectivity");
        checklistAttribute.setId((long) 7551);
        checklistAttribute.setQuestionNumber("1c-5");
        attribute.setId((long) 2299);
        attribute.setStem("Is the structural...");
        question.setId((long) 42588);
        checklistAttribute.setAttribute(attribute);
        checklistAttribute.setAttributeCategory(attributeCategory);
        question.setChecklistAttribute(checklistAttribute);
        stage1Questions.add(question);

        question = new ChecklistQandA();
        checklistAttribute = new ChecklistAttributeV2();
        attributeCategory = new AttributeCategoryV2();
        attribute = new AttributeV2();
        attributeCategory.setId((long) 224);
        attributeCategory.setHeaderText("Section 1c - Model Development: Connectivity");
        checklistAttribute.setId((long) 7552);
        checklistAttribute.setQuestionNumber("1c-6");
        attribute.setId((long) 2300);
        attribute.setStem("Are connections between...");
        question.setId((long) 42589);
        checklistAttribute.setAttribute(attribute);
        checklistAttribute.setAttributeCategory(attributeCategory);
        question.setChecklistAttribute(checklistAttribute);
        stage1Questions.add(question);

        question = new ChecklistQandA();
        checklistAttribute = new ChecklistAttributeV2();
        attributeCategory = new AttributeCategoryV2();
        attribute = new AttributeV2();
        attributeCategory.setId((long) 224);
        attributeCategory.setHeaderText("Section 1c - Model Development: Connectivity");
        checklistAttribute.setId((long) 7553);
        checklistAttribute.setQuestionNumber("1c-7");
        attribute.setId((long) 2301);
        attribute.setStem("Are there distinct...");
        question.setId((long) 42590);
        checklistAttribute.setAttribute(attribute);
        checklistAttribute.setAttributeCategory(attributeCategory);
        question.setChecklistAttribute(checklistAttribute);
        stage1Questions.add(question);

        question = new ChecklistQandA();
        checklistAttribute = new ChecklistAttributeV2();
        attributeCategory = new AttributeCategoryV2();
        attribute = new AttributeV2();
        attributeCategory.setId((long) 225);
        attributeCategory.setHeaderText("Section 1d - Model Development: Units and Inertias");
        checklistAttribute.setId((long) 7556);
        checklistAttribute.setQuestionNumber("1d-1");
        attribute.setId((long) 7522);
        attribute.setStem("Are consistent...");
        question.setId((long) 42605);
        checklistAttribute.setAttribute(attribute);
        checklistAttribute.setAttributeCategory(attributeCategory);
        question.setChecklistAttribute(checklistAttribute);
        stage1Questions.add(question);

        question = new ChecklistQandA();
        checklistAttribute = new ChecklistAttributeV2();
        attributeCategory = new AttributeCategoryV2();
        attribute = new AttributeV2();
        attributeCategory.setId((long) 225);
        attributeCategory.setHeaderText("Section 1d - Model Development: Units and Inertias");
        checklistAttribute.setId((long) 7557);
        checklistAttribute.setQuestionNumber("1d-2");
        attribute.setId((long) 7523);
        attribute.setStem("Are lumped...");
        question.setId((long) 42606);
        checklistAttribute.setAttribute(attribute);
        checklistAttribute.setAttributeCategory(attributeCategory);
        question.setChecklistAttribute(checklistAttribute);
        stage1Questions.add(question);

        question = new ChecklistQandA();
        checklistAttribute = new ChecklistAttributeV2();
        attributeCategory = new AttributeCategoryV2();
        attribute = new AttributeV2();
        attributeCategory.setId((long) 225);
        attributeCategory.setHeaderText("Section 1d - Model Development: Units and Inertias");
        checklistAttribute.setId((long) 7558);
        checklistAttribute.setQuestionNumber("1d-3");
        attribute.setId((long) 2306);
        attribute.setStem("Are densities...");
        question.setId((long) 42593);
        checklistAttribute.setAttribute(attribute);
        checklistAttribute.setAttributeCategory(attributeCategory);
        question.setChecklistAttribute(checklistAttribute);
        stage1Questions.add(question);

        question = new ChecklistQandA();
        checklistAttribute = new ChecklistAttributeV2();
        attributeCategory = new AttributeCategoryV2();
        attribute = new AttributeV2();
        attributeCategory.setId((long) 225);
        attributeCategory.setHeaderText("Section 1d - Model Development: Units and Inertias");
        checklistAttribute.setId((long) 7559);
        checklistAttribute.setQuestionNumber("1d-4");
        attribute.setId((long) 2307);
        attribute.setStem("Is the total model weight...");
        question.setId((long) 42594);
        checklistAttribute.setAttribute(attribute);
        checklistAttribute.setAttributeCategory(attributeCategory);
        question.setChecklistAttribute(checklistAttribute);
        stage1Questions.add(question);

    }

    public List<ChecklistQandA> getStage1Questions() {
        return stage1Questions;
    }

}