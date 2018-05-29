package per.db.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import per.db.mongo.model.TypeOfSubject;
import per.db.mongo.repository.TypeOfSubjectRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TypeOfSubjectController {
    @Autowired
    private TypeOfSubjectRepository typeOfSubjectRepository;

    @RequestMapping("/types of subject")
    public List<TypeOfSubject> showTypesOfSubject(){
        return typeOfSubjectRepository.findAll();
    }

    @PostMapping("/type of subject/insert")
    public TypeOfSubject addTypeOfSubject(@RequestBody TypeOfSubject typeOfSubject) {
        return typeOfSubjectRepository.save(typeOfSubject);
    }

    @GetMapping("/type of subject/delete")
    void deleteTypeOfSubjectById(@RequestParam("id") String id)
    {
        typeOfSubjectRepository.deleteById(id);
    }

    @RequestMapping("/type of subject/update")
    TypeOfSubject updateTypeOfSubject(@RequestBody TypeOfSubject typeOfSubject, @RequestParam("id") String id)
    {
        typeOfSubject.setId(id);
        return typeOfSubjectRepository.save(typeOfSubject);
    }

    @GetMapping("/type of subject/get")
    TypeOfSubject getTypeOfSubjectById(@RequestParam("id") String id)
    {
        return typeOfSubjectRepository.findById(id).get();
    }
}
