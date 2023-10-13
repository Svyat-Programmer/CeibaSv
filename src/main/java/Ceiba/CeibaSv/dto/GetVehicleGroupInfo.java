package Ceiba.CeibaSv.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.List;


public class GetVehicleGroupInfo {
    @JsonProperty("data")
    private List<GroupData> data;

    @JsonProperty("errorcode")
    private int errorCode;

    public List<GroupData> getData() {

        return data;
    }

    public int getErrorCode() {

        return errorCode;
    }

    ////find my persent

}
