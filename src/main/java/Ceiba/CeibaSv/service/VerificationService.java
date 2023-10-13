package Ceiba.CeibaSv.service;

import Ceiba.CeibaSv.dto.*;

import org.springframework.beans.factory.annotation.Autowired;

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

//    public DeviceList getByTerId(String terid)
//    { List<DeviceList> cars = getDeviceList();
//        for (DeviceList device : cars) {
//            if (device.getTerid().equals(terid)) {
//                return device;
//            }
//
//        }
//
//        return null;
//    }

}






