package Ceiba.CeibaSv.service;

import Ceiba.CeibaSv.dto.*;

import jakarta.security.auth.message.callback.SecretKeyCallback;
import lombok.Getter;
import lombok.Setter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;


@Service
@Slf4j
public class VerificationService  {
    private final String apiUrl = "http://91.90.213.174:12056/api/v1/basic/key";


    String token;
    List<GroupData> a;

    @Autowired
    private RestTemplate restTemplate;
    ResponseEntity<GetVehicleGroupInfo> vgInfo;



    String username = "spbcsat";
    String password = "12345F";

    public String getKey(String username, String password) {
        //username = "Domodedovo";
        //password = "csat001!";
        username = "spbcsat";//spbcsat";
        password = "12345F";
        ResponseEntity<VerificationDTO> response = restTemplate.getForEntity(apiUrl + "?username={username}&password={password}", VerificationDTO.class, username, password);

        if (response.getStatusCode().is2xxSuccessful()) {
            return token = response.getBody().getData().getKey();
        } else {
            throw new RuntimeException("API request failed with status code: " + response.getStatusCodeValue());
        }
    }


    final String vsUrl = "http://91.90.213.174:12056/api/v1/basic/groups";


    public List<GroupData> getGroupData() {
        // username = "spbcsat";
        //password = "12345F";
        token = getKey(username, password);


        vgInfo = restTemplate.getForEntity(vsUrl + "?key=" + token, GetVehicleGroupInfo.class);


        return a = vgInfo.getBody().getData();

    }

    public int getGroupId() {

        return a.get(1).getGroupid();
    }

    final String deviceListUrl = "http://91.90.213.174:12056/api/v1/basic/devices";
    ResponseEntity<GetDeviceInfo> deviceInfo;


    public List<DeviceList> getDeviceList() {
        //username = "spbcsat";
        //password = "12345F";
        token = getKey(username, password);


        deviceInfo = restTemplate.getForEntity(deviceListUrl + "?key=" + token, GetDeviceInfo.class);


        return deviceInfo.getBody().getData();

    }




//    public GpsLastResponse getLastGpsData() {
//        String url = "http://91.90.213.174:12056/api/v1/basic/gps/last";
//        GpsLastRequest request = new GpsLastRequest(HttpHeade
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        HttpEntity<GpsLastRequest> requestEntity = new HttpEntity<>(request,headers);
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<GpsLastResponse> responseEntity = restTemplate.postForEntity(url, requestEntity, GpsLastResponse.class);
//        GpsLastResponse response = responseEntity.getBody();
//
//        return response;




       // }







        String url = "http://91.90.213.174:12056/api/v1/basic/gps/last";
                 // String apiKey=getKey(username,password);
                  String [] terid={"0099031743"};
       public GpsLastResponse getLastGpsData(String[] terid){

           token = getKey(username, password);

           HttpHeaders headers = new HttpHeaders();
           headers.setContentType(MediaType.APPLICATION_JSON);
//
//           Map<String , String> requestBody = new HashMap<>();
//           requestBody.put("key", token);
//           requestBody.put("terid", terid);
           GpsLastRequest requestBody = new GpsLastRequest(token);
           requestBody.setTerid(terid);

           HttpEntity<GpsLastRequest> requestEntity = new HttpEntity<>(requestBody, headers);
           log.info(requestEntity.toString());
            restTemplate=new RestTemplate();
           ResponseEntity<GpsLastResponse> responseEntity = restTemplate.postForEntity(url, requestEntity, GpsLastResponse.class);
           GpsLastResponse GPSdata = responseEntity.getBody();
           log.info(responseEntity.toString());
            log.info(responseEntity.getBody().toString());
        return GPSdata;

       }
    public OptionalInt takeSpeed(){

        return getLastGpsData(terid).getData().stream().mapToInt(c->c.getAltitude()).max();


    }





}






