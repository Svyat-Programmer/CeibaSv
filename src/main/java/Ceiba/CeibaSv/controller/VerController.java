package Ceiba.CeibaSv.controller;

import Ceiba.CeibaSv.dto.*;
import Ceiba.CeibaSv.service.VerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
    @RequestMapping("/api")
    public class VerController {

        private final VerificationService apiService;



        @Autowired
        public VerController(VerificationService apiService) {
            this.apiService = apiService;
        }

        @GetMapping("/get-key")
        public String getKey() {
            String username = "spbcsat";//spbcsat";
            String password = "12345F";
           // String password = "csat001!";
            return apiService.getKey(username,password);
        }
        @GetMapping("v1/basic/groups")
        public List<GroupData> getGroupData(){
            return
                    apiService.getGroupData();
        }

        @GetMapping("v1/basic/devices")
        public List<DeviceList>getDeviceList(){
            return apiService.getDeviceList();
        }

    @PostMapping("/last")
    public GpsLastResponse getLastGpsData(@RequestBody GpsLastRequest request) {
        return apiService.getLastGpsData(request);
    }
    }

