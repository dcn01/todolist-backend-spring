package ch.app_customs.todolistbackendspring.controllers;

import ch.app_customs.todolistbackendspring.models.ToDo;
import ch.app_customs.todolistbackendspring.repositories.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path="/todo")
@RestController
public class ToDoController {

    public ToDoController() {
        System.out.println("ToDo Restpoint test");
    }

    @Autowired
    private ToDoRepo todorepo;

    @GetMapping(path="/get")
    public @ResponseBody Iterable<ToDo> getAllToDos() { return todorepo.findAll(); }

    @PostMapping(path="/add")
    public @ResponseBody String addToDo(@RequestParam String title, @RequestParam String desc) {

        ToDo todo = new ToDo(title, desc);
        todorepo.save(todo);

        return "Adding todo succedded";
    }
}
