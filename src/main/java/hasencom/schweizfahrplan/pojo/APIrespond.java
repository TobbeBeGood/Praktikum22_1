package hasencom.schweizfahrplan.pojo;

public class APIrespond {
    private String abfahrtszeit;
    private String ankunftszeit;

    public void setAbfahrtszeit(String abfahrtszeit) {
        this.abfahrtszeit = abfahrtszeit;
    }
    public void setAnkunftszeit(String ankunftszeit) {
        this.ankunftszeit = ankunftszeit;
    }
    public String getAbfahrtszeit() {
        return abfahrtszeit;
    }
    public String getAnkunftszeit() {
        return ankunftszeit;
    }
    public APIrespond(){
    }
    public APIrespond(String abfahrtszeit, String ankunftszeit){
        this.ankunftszeit = ankunftszeit;
        this.abfahrtszeit = abfahrtszeit;
    }
}
