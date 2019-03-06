package ch.app_customs.todolistbackendspring.repositories;

import ch.app_customs.todolistbackendspring.models.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepo extends CrudRepository<ToDo, Integer> { }
