package lt.agmis.testproject.serviceimpl;

import lt.agmis.testproject.dao.SensorDao;
import lt.agmis.testproject.domain.SensorData;
import lt.agmis.testproject.dto.OperationResult;
import lt.agmis.testproject.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by VytautasL on 10/28/2015.
 */
@Service
@Transactional
public class SensorServiceImpl implements SensorService {
    @Autowired
    SensorDao sensorDao;


    @Override
    public OperationResult putSensorData(SensorData sensorData) {
        return sensorDao.putSensorData(sensorData);
    }

    @Override
    public List<SensorData> getAll() {
        return sensorDao.getAll();
    }
}
