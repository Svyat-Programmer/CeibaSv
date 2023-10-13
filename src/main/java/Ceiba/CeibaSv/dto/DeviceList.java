package Ceiba.CeibaSv.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class DeviceList {
    String carlicence; //:[int]License plate numbe
    String terid; //device serial number
    String sim; //Mobile phone number
    int platecolor; //The license plate color
    int channel; //Channel
    String cname;// Channel name, comma-separated
    int groupid; //set of cars ID
    String devicetype; //Device type.1：MDVR，4：N9M
    String linktype; //Connection type
    String deviceusername; //Device login user name
    String devicepassword;
    String registerip; //:[string]Register server IP
    int registerport;// :[]Register server port
    String transmitip;
    int transmitport;
    int channelEnable;// -1 //represents all channel permissions. The digits need to be converted to binary, and the low to high bits represent the permissions of the corresponding channel respectively

//
//    public String getCarLicence() {
//
//        return carlicence;
//    }
//
//    public String getDevId() {
//        return terid;  }
//
//    public String getSim() {
//        return sim;
//    }
//
//    public int getPlateColor() {
//        return platecolor;
//    }
//
//    public int getChannel() {
//        return channel;
//    }
//
//    public String getChanelName() {
//        return chanelName;
//    }
//
//    public int getGroupId() {
//        return groupId;
//    }
//
//    public String getDeviceType() {
//        return deviceType;
//    }
//
//    public String getLinkType() {
//        return linkType;
//    }
//
//    public String getDeviceUserMame() {
//        return deviceUserMame;
//    }
//
//    public String getDevicePassword() {
//        return devicePassword;
//    }
//
//    public String getRegisterIp() {
//        return registerIp;
//    }
//
//    public int getRegisterPort() {
//        return registerPort;
//    }
//
//    public int getForwardServerPort() {
//        return forwardServerPort;
//    }
//
//    public int getChannelEnable() {
//        return channelEnable;
//    }
//
//
//
//    public void setCarLicence(String carLicence) {
//        this.carlicence = carLicence;
//    }
//
//    public void setDevId(String devId) {
//        this.terid = devId;
//    }
//
//    public void setSim(String sim) {
//        this.sim = sim;
//    }
//
//    public void setPlateColor(int plateColor) {
//        this.platecolor = plateColor;
//    }
//
//    public void setChannel(int channel) {
//        this.channel = channel;
//    }
//
//    public void setChanelName(String chanelName) {
//        this.chanelName = chanelName;
//    }
//
//    public void setGroupId(int groupId) {
//        this.groupId = groupId;
//    }
//
//    public void setDeviceType(String deviceType) {
//        this.deviceType = deviceType;
//    }
//
//    public void setLinkType(String linkType) {
//        this.linkType = linkType;
//    }
//
//    public void setDeviceUserMame(String deviceUserMame) {
//        this.deviceUserMame = deviceUserMame;
//    }
//
//    public void setDevicePassword(String devicePassword) {
//        this.devicePassword = devicePassword;
//    }
//
//    public void setRegisterIp(String registerIp) {
//        this.registerIp = registerIp;
//    }
//
//    public void setRegisterPort(int registerPort) {
//        this.registerPort = registerPort;
//    }
//
//    public void setForwardServerPort(int forwardServerPort) {
//        this.forwardServerPort = forwardServerPort;
//    }
//
//    public void setChannelEnable(int channelEnable) {
//        this.channelEnable = channelEnable;
//    }


}
