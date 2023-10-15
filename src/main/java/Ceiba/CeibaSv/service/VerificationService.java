package Ceiba.CeibaSv.service;

import Ceiba.CeibaSv.dto.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;



@Service
public class VerificationService {
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
    String lastGPsUrl = "http://91.90.213.174:12056/api/v1/basic/gps/count";
    String terid= "009900A73C";

    public GpsLastResponse getLastGpsData(GpsLastRequest request) {
        String url = "http://91.90.213.174:12056/api/v1/basic/gps/last";

        // Create the request object
        //GpsLastRequest request = new GpsLastRequest();
        request.setKey(token);
        request.setTerid(new String[]{"terid"});

        // Set up the HTTP headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Create the request entity with the request body and headers
        HttpEntity<GpsLastRequest> requestEntity = new HttpEntity<>(request, headers);

        // Send the POST request and handle the response
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<GpsLastResponse> responseEntity = restTemplate.postForEntity(url, requestEntity, GpsLastResponse.class);

        // Get the response body
        GpsLastResponse response = responseEntity.getBody();

        return response;



        }







}






