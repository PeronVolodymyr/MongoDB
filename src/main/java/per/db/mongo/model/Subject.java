package per.db.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Subject {
    @Id
    private String id;
    private String name;
    private int numberOfHours;
    private TypeOfSubject typeOfSubject;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public TypeOfSubject getTypeOfSubject() {
        return typeOfSubject;
    }

    public void setTypeOfSubject(TypeOfSubject typeOfSubject) {
        this.typeOfSubject = typeOfSubject;
    }
}
