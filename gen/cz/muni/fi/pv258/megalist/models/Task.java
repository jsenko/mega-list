package cz.muni.fi.pv258.megalist.models;

/**
 * Created by pepin_000 on 8. 4. 2015.
 */
public class Task {
    public enum Type {
        LifeGoal,
        DoToday,
        DoLater,
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void DoToday() {
        type = Type.DoToday;
    }

    public void DoLater() {
        type = Type.DoLater;
    }

    public void Done() {
        // TODO: some statistics maybe?

        taskStorage.remove(this);
    }

    public void injectTaskStorage(TaskStorage taskStorage) {
        this.taskStorage = taskStorage;
    }

    protected TaskStorage taskStorage;

    protected String name;
    protected Type type;
    protected int id;

}
