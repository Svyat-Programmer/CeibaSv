package Ceiba.CeibaSv.dto;

import Ceiba.CeibaSv.service.VerificationService;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
    public class GpsLastResponse extends VerificationService {
    @JsonProperty("data")
    private List<LastGPSposition> data;
    @JsonProperty("errorcode")
    private int errorcode;



}