package Ceiba.CeibaSv.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GetDeviceInfo {
    @JsonProperty("data")
    private List<DeviceList> data;

    @JsonProperty("errorcode")
    private int errorCode;

    public List<DeviceList> getData() {
        return data;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
