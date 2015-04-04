package cz.muni.fi.pv258.megalist.model;

/**
 * @author Jakub Senko
 */
public class Task {

    private Long id;

    private String name;

    private String details;

    private TaskPriority priority;

    private Long timePoint;

    public Task(Long id, String name, String details, TaskPriority priority, Long timePoint) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.priority = priority;
        this.timePoint = timePoint;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public Long getTimePoint() {
        return timePoint;
    }

    public void setTimePoint(Long timePoint) {
        this.timePoint = timePoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (id != null ? !id.equals(task.id) : task.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
