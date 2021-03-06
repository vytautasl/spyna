package lt.agmis.testproject.daohibernateimpl;

import lt.agmis.testproject.dao.SensorDao;
import lt.agmis.testproject.domain.SensorData;
import lt.agmis.testproject.dto.OperationResult;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by VytautasL on 10/28/2015.
 */
@Repository
public class SensorDaoImpl implements SensorDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public OperationResult putSensorData(SensorData sensorData) {
        OperationResult putResult = new OperationResult();
        try
        {
            sessionFactory.getCurrentSession().save(sensorData);
            putResult.setSuccess(true);
            putResult.setId(sensorData.getId());
        } catch (Exception e)
        {
            putResult.setDescription(e.getMessage());
        }

        return putResult;
    }

    @Override
    public List<SensorData> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from SensorData").list();
    }
}
