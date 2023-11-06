package Ceiba.CeibaSv.service;

import Ceiba.CeibaSv.dto.DeviceList;
import Ceiba.CeibaSv.dto.GetVehicleGroupInfo;
import Ceiba.CeibaSv.dto.GroupData;
import Ceiba.CeibaSv.dto.LastGPSposition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.OptionalInt;


public class findingService extends VerificationService {


    public List<GroupData> getByTerId(int groupid) {
        return  getGroupData().stream().filter(c->c.groupid == groupid).toList();


    }


}
