package lt.agmis.testproject.restcontroller;

import lt.agmis.testproject.domain.SensorData;
import lt.agmis.testproject.dto.OperationResult;
import lt.agmis.testproject.gcm.GcmSender;
import lt.agmis.testproject.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by VytautasL on 10/28/2015.
 */
@RequestMapping(value = {"/sensor"})
@Controller
public class SensorController {
    @Autowired
    private SensorService sensorService;

    @RequestMapping(produces = {"application/json"}, method = RequestMethod.POST)
    @ResponseBody
    public OperationResult putSensorData(@RequestBody SensorData sensorData) {
    	GcmSender.get().sendMessage(sensorData);
        return sensorService.putSensorData(sensorData);
    }


    @RequestMapping(produces = {"application/json"}, method = RequestMethod.GET)
    @ResponseBody
    public List<SensorData> getAll() {
        return sensorService.getAll();
    }
}
