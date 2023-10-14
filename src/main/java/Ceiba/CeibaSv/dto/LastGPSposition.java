package Ceiba.CeibaSv.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LastGPSposition {

    String terid; //": "AE99873120",
    String gpstime;//: "2017-06-19 00:00:00",
    int altitude; //": 600,
    int direction; //": 45,
    String gpslat;//: "23.654123",
    String gpslng; //": "108.432143",
    int speed;//": 80,
    int recordspeed; //: 0,
    String state;//: 0,
    String time;//: "2017-06-19 00:00:00"
}

