package lt.agmis.testproject.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by VytautasL on 10/28/2015.
 */
@Entity
public class SensorData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(nullable=true, unique=false)
    Double data;

    @Column(nullable=true, unique=false)
    Timestamp log_time;

    @Column(nullable=true, unique=false)
    Integer objectId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getData() {
        return data;
    }

    public void setData(Double data) {
        this.data = data;
    }

    public Timestamp getLog_time() {
        return log_time;
    }

    public void setLog_time(Timestamp log_time) {
        this.log_time = log_time;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }
}
