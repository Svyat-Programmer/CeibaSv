package Ceiba.CeibaSv.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class GroupData {
  public int groupid;
    public String groupname;
    public int groupfatherid;

    public int getGroupid() {
        return groupid;
    }

    public String getGroupname() {
        return groupname;
    }

    public int getGroupfatherid() {
        return groupfatherid;
    }
}
