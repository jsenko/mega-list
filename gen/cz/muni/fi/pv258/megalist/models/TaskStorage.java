package cz.muni.fi.pv258.megalist.models;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by pepin_000 on 8. 4. 2015.
 */
public class TaskStorage {
    public Task createTask(String name) {
        Task task = new Task();
        task.injectTaskStorage(this);
        task.setName(name);
        return task;
    }

    public void persist(Task task)
    {
        // TODO
    }

    public void remove(Task task)
    {
        // TODO
    }

    public Iterable<Task> getTasks(Task.Type type) {
        Vector<Task> vec = new Vector<Task>();

        vec.add(createTask("Uklidit mrtvolu"));
        vec.add(createTask("Dojít pro vejce"));
        vec.add(createTask("Nakrmit psa"));
        vec.add(createTask("Traktor dělá brm brm"));

        return vec;
    }


}
