package lt.agmis.testproject.service;

import lt.agmis.testproject.domain.SensorData;
import lt.agmis.testproject.dto.OperationResult;

import java.util.List;

/**
 * Created by VytautasL on 10/28/2015.
 */
public interface SensorService {
    public OperationResult putSensorData(SensorData sensorData);

    List<SensorData> getAll();
}
