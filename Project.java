import java.util.Date;

public class Project {
    private String projectName;
    private String projectManager;
    private Date startDate;
    private Date endDate;
    private String description;
    private int budget;


    public Project(String projectName, String projectManager, Date startDate, Date endDate, String description,int budget) {
        this.projectName = projectName;
        this.projectManager = projectManager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.budget = budget;
    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public int getBudget) {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}

