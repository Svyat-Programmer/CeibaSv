package Ceiba.CeibaSv.controller;

import Ceiba.CeibaSv.dto.DeviceList;
import Ceiba.CeibaSv.dto.GroupData;
import Ceiba.CeibaSv.dto.VerificationDTO;
import Ceiba.CeibaSv.service.VerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    }

