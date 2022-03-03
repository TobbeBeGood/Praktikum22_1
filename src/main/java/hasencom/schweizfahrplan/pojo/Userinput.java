package hasencom.schweizfahrplan.pojo;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.catalina.User;

import java.lang.reflect.Constructor;


public class Userinput {


    private String start_stadt;


    private String ziel_stadt;

    public void setStart_stadt(String start_stadt) {
        this.start_stadt = start_stadt;
    }
    public void setZiel_stadt(String ziel_stadt) {
        this.ziel_stadt = ziel_stadt;
    }
    public String getStart_stadt() {
        return start_stadt;
    }
    public String getZiel_stadt() {
        return ziel_stadt;
    }

    public Userinput(){
    }
    public Userinput(String start_stadt, String ziel_stadt){
        this.start_stadt = start_stadt;
        this.ziel_stadt = ziel_stadt;
    }
}
