package Ceiba.CeibaSv.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


    public class GpsLastResponse {
        @JsonProperty("data")
        private List<LastGPSposition> data;
        @JsonProperty("errorcode")
        private int errorcode;


    }
