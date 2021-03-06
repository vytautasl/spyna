package lt.agmis.testproject.restcontroller;

import lt.agmis.testproject.domain.SensorData;
import lt.agmis.testproject.dto.OperationResult;
import lt.agmis.testproject.gcm.GcmSender;
import lt.agmis.testproject.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by VytautasL on 10/28/2015.
 */
@RequestMapping(value = {"/sensor"})
@Controller
public class SensorController {
    @Autowired
    private SensorService sensorService;

    @RequestMapping(value = "/put/objectId/{id}/time/{time}/sensorData/{data}", produces = {"application/json"}, method = RequestMethod.GET)
    @ResponseBody
    public OperationResult putSensorData(@PathVariable Integer id, @PathVariable Long time, @PathVariable Double data) {
        SensorData sensorData = new SensorData();
        sensorData.setData(data);
        sensorData.setLog_time(new Timestamp(time*1000));
        sensorData.setObjectId(id);
    	GcmSender.get().sendMessage(sensorData);
        return sensorService.putSensorData(sensorData);
    }


    @RequestMapping(produces = {"application/json"}, method = RequestMethod.GET)
    @ResponseBody
    public List<SensorData> getAll() {
        return sensorService.getAll();
    }
}
