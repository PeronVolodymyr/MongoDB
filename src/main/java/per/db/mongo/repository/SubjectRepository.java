package per.db.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import per.db.mongo.model.Subject;

@Repository
public interface SubjectRepository extends MongoRepository<Subject, String> {
}
