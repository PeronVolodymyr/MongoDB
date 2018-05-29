package per.db.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import per.db.mongo.model.Subject;
import per.db.mongo.repository.SubjectRepository;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SubjectController {
    @Autowired
    private SubjectRepository subjectRepository;

    @RequestMapping("/subjects")
    public List<Subject> showSubjects() {
        return subjectRepository.findAll();
    }

    @PostMapping("/subject/insert")
    Subject insertSubject(@RequestBody Subject subject) {
        return subjectRepository.save(subject);
    }

    @GetMapping("/subject/delete")
    void deleteSubject(@RequestParam("id") String id)
    {
        subjectRepository.deleteById(id);
    }

    @GetMapping("/subject/get")
    Subject getSubjectById(@RequestParam("id") String id)
    {
        return subjectRepository.findById(id).get();
    }

    @RequestMapping("/subject/update")
    Subject updateSubject(@RequestBody Subject subject, @RequestParam("id") String id)
    {
        subject.setId(id);
        return subjectRepository.save(subject);
    }
}
