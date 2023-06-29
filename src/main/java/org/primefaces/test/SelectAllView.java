package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;


@ViewScoped
@Named
public class SelectAllView implements Serializable {
    private static final long serialVersionUID = 1L;


    private List<ChecklistQandA> stage1Questions;

    private long assignmentId;

    private long modelId;


    @Inject
    private SelectAllService selectAllService;

  @PostConstruct
    public void init() {
        // System.out.println("initializing in the FEA checklist");
        stage1Questions = new ArrayList<>();
        stage1Questions = selectAllService.getStage1Questions();
    }
  
  public void submit() {
      for (ChecklistQandA ans : stage1Questions) {
          System.out.println(" Question : " + ans.getChecklistAttribute().getQuestionNumber() + "  value is " + ans.getToggleValue());
      }
      System.out.println("End Test");
      System.out.println();
      System.out.println();
  }

    public long getAssignmentId() {
        return assignmentId;
    }

    public long getModelId() {
        return modelId;
    }

    public List<ChecklistQandA> getStage1Questions() {
        return stage1Questions;
    }

}
