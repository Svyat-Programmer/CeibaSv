package Ceiba.CeibaSv.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class GpsLastRequest {
        String key;
        String[] terid ;//= {"009901DA02"};

    public GpsLastRequest(String key) {
        this.key = key;
    }
}

