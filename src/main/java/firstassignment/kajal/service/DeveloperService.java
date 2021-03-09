package firstassignment.kajal.service;

import firstassignment.kajal.model.Developers;
import firstassignment.kajal.repository.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeveloperService {
    @Autowired
    DeveloperRepository repository;
    public List<Developers> getAll(){

        return repository.findAll();
    }

    public String save(Developers developers){
        repository.save(developers);
        return "Developer created successfully";
    }

    public String update(Long id,Developers developers){
        Optional<Developers> dev = repository.findById(id);
        if(dev == null){
            return "Developer having id = " + id + "not found";
        }

        Developers d = dev.get();
        d.setName(developers.getName());
        repository.save(d);
        return "Developer is updated successfully";
    }

    public String delete(long id){

        repository.deleteById(id);
        return "Developer is deleted successfully.";
    }
}
