package firstassignment.kajal.controller;

import firstassignment.kajal.model.Developers;
import firstassignment.kajal.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeveloperController {
    @Autowired
    DeveloperService service;

    @GetMapping("/developer")
    public List<Developers> findAll()
    {
        return service.getAll();
    }
    @PostMapping("/developer")
    public String save(@RequestBody Developers developers){
        return  service.save(developers);
    }
    @PutMapping("/developer/{id}")
    public String update(@PathVariable("id") long id,@RequestBody Developers developers){
        return service.update(id,developers);

    }
    @DeleteMapping("/developer/{id}")
    public String delete(@PathVariable("id") long id){
        return service.delete(id);
    }

}
