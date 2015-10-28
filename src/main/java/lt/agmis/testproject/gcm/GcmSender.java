<<<<<<< HEAD
package lt.agmis.testproject.gcm;

import java.io.IOException;
import java.util.ArrayList;

import lt.agmis.testproject.domain.SensorData;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.MulticastResult;
import com.google.android.gcm.server.Sender;

public class GcmSender {
	
	/**
	 * Server api key
	 */
	private static final String API_KEY = "";
	
	/**
	 * Device registration id (test)
	 */
	private static final String REG_ID = "";
	
	/**
	 * Gcm sender singleton
	 */
	public static final GcmSender instance = new GcmSender();	
	
	public static GcmSender get() {
		return instance;
	}
	
	private Sender sender;
	
	private GcmSender() {
		sender = new Sender(API_KEY);
	}
	
	public void sendMessage(SensorData sensorData) {
		ArrayList<String> devicesList = new ArrayList<String>();
        devicesList.add(REG_ID);

        Message message = new Message.Builder().timeToLive(30)
                .delayWhileIdle(true)
                .addData("ID", sensorData != null ? String.valueOf(sensorData.getId()) : "")
                .addData("DATA", sensorData != null ? String.valueOf(sensorData.getData()) : "")
                .addData("LOG_TIME", sensorData != null ? String.valueOf(sensorData.getLog_time()) : "")
                .addData("OBJECT_ID", sensorData != null ? String.valueOf(sensorData.getObjectId()) : "").build();

        MulticastResult result = null;
		try {
			result = sender.send(message, devicesList, 1);
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println(result != null ? result.toString() : "FAILED TO SEND MESSAGE");
	}
}

=======
package lt.agmis.testproject.gcm;

import java.io.IOException;
import java.util.ArrayList;

import lt.agmis.testproject.domain.SensorData;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.MulticastResult;
import com.google.android.gcm.server.Sender;

public class GcmSender {
	
	/**
	 * Server api key
	 */
	private static final String API_KEY = "AIzaSyDIIbYeEKgIlSikkS4Y22Y8NiaD9ng2r34";
	
	/**
	 * Device registration id (test)
	 */
	private static final String REG_ID = "APA91bEBYPyatoCH1QHhHUzqsYM37BLQVLkm_yDggb-Z8aNkPZ_fR1uQID4acUw0b82ItCXgJH-YEBQsGKMuEakhrN99xzSG2H3FrFNM8QdXOOx9GMG3Jpo";
	
	/**
	 * Gcm sender singleton
	 */
	public static final GcmSender instance = new GcmSender();	
	
	public static GcmSender get() {
		return instance;
	}
	
	private Sender sender;
	
	private GcmSender() {
		sender = new Sender(API_KEY);
	}
	
	public void sendMessage(SensorData sensorData) {
		ArrayList<String> devicesList = new ArrayList<String>();
        devicesList.add(REG_ID);

        Message message = new Message.Builder().timeToLive(30)
                .delayWhileIdle(true)
                .addData("ID", sensorData != null ? String.valueOf(sensorData.getId()) : "")
                .addData("DATA", sensorData != null ? String.valueOf(sensorData.getData()) : "")
                .addData("LOG_TIME", sensorData != null ? String.valueOf(sensorData.getLog_time()) : "")
                .addData("OBJECT_ID", sensorData != null ? String.valueOf(sensorData.getObjectId()) : "").build();

        MulticastResult result = null;
		try {
			result = sender.send(message, devicesList, 1);
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println(result != null ? result.toString() : "FAILED TO SEND MESSAGE");
	}
}

>>>>>>> origin/vl_adds
