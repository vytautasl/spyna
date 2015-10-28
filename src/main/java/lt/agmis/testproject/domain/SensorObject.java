package lt.agmis.testproject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by VytautasL on 10/28/2015.
 */
@Entity
public class SensorObject {
    @Id
    Integer id;

    @Column(nullable=true, unique=false)
    String objectName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
}
