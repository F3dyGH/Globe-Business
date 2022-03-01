package tn.globebusiness.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.globebusiness.spring.Entities.Profession;
import tn.globebusiness.spring.Services.IProfessionService;

import java.util.List;

@RestController
public class ProfessionRestController {
    @Autowired
    IProfessionService ipr;
    @PostMapping("/professions/add")
    public Profession addProfession(@RequestBody Profession profession){
        return ipr.addProfession(profession);
    }
    @PutMapping("/professions/{name}/edit")
    public Profession updateProfession(@PathVariable("name") String name, @RequestBody Profession profession) throws Exception {
        return ipr.updateProfession(name, profession);
    }
    @DeleteMapping("/professions/{name}/delete")
    public void deleteProfession(@PathVariable("name") String name) throws Exception {
        ipr.deleteProfession(name);
    }

}
