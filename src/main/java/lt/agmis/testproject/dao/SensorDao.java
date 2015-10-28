package lt.agmis.testproject.dao;

import lt.agmis.testproject.domain.SensorData;
import lt.agmis.testproject.dto.OperationResult;

import java.util.List;

/**
 * Created by VytautasL on 10/28/2015.
 */
public interface SensorDao {
    public OperationResult putSensorData(SensorData sensorData);

    List<SensorData> getAll();

}
