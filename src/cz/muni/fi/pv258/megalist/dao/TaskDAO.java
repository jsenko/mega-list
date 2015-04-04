package cz.muni.fi.pv258.megalist.dao;

import java.util.List;

import cz.muni.fi.pv258.megalist.model.Task;

/**
 * @author Jakub Senko
 */
public interface TaskDAO {

    List<Task> getAll();
}
