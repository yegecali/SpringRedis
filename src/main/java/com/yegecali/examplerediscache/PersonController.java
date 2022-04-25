package com.yegecali.examplerediscache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/cache")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable String id){
        return personService.getById(id);
    }
    @PutMapping("/{id}")
    public Person updateById(@RequestBody Person p, @PathVariable String id){
        return personService.update(p, id);
    }
    @GetMapping
    public List<Person> getAll(){
        return personService.getAll();
    }
    @PostMapping
    public Person save(@RequestBody Person person){
        return personService.save(person);
    }
    @DeleteMapping("/{id}")
    public Map<String, String> delete(@PathVariable String id){
        personService.delete(id);
        Map<String, String> res = new HashMap<>();
        res.put("status", "se elemino correctamente");
        return res;
    }
}
