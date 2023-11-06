package Ceiba.CeibaSv.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AlarmStatistic {
    String key; //[string]verify key
     String id; //[string] The terminal number ID array
    int type; //[int] Alarm type
    String starttime;// [string] start time, the format YYYY-MM-dd HH: mm: ss
    String endtime;// [string] end time, the format YYYY-MM-dd HH: mm: ss

}
