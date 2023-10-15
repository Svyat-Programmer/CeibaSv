package Ceiba.CeibaSv.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
    public class GpsLastRequest {
        private String key;
        private String[] terid;
}
