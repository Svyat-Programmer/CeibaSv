package Ceiba.CeibaSv.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class VerificationDTO {
    @JsonProperty("data")
    private Data data;

    @JsonProperty("errorcode")
    private int errorCode;



    public static class Data {
        private String key;

        public String getKey() {

            return key;
        }
    }

}
