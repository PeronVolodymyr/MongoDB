package per.db.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import per.db.mongo.model.TypeOfSubject;

@Repository
public interface TypeOfSubjectRepository extends MongoRepository<TypeOfSubject, String> {
}
