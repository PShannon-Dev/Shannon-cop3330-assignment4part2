package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Paul Shannon
 */
public class Item {
    private String description;
    private String dueDate;
    private boolean completionStatus;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return completionStatus;
    }

    public void setCompletionStatus(boolean completionStatus) {
        this.completionStatus = completionStatus;
    }

    public Item(String description, String dueDate, boolean completionStatus) {
        this.description = description;
        this.dueDate = dueDate;
        this.completionStatus = completionStatus;
    }
}
