package nl.pvanassen.ns.model.storingen;

import java.util.Date;

/**
 * http://www.ns.nl/api/api#api-documentatie-storingen-en-werkzaamheden
 * 
 * @author Paul van Assen
 * 
 */
public class Storing {

    private final String id;

    private final String traject;

    private final String periode;

    private final String reden;

    private final String advies;

    private final String bericht;

    private final Date datum;

    /**
     * @param id ID generated by the NS
     * @param traject Traject, textual explanation of a piece of track between two stations
     * @param periode In case of planned maintenance, this contains a textual explanation of the period the maintenance is planned 
     * @param reden Reason for the disruption
     * @param advies Alternative route advice
     * @param bericht Unknown?
     * @param datum Date and time of the disruption
     */
    Storing(String id, String traject, String periode, String reden, String advies, String bericht, Date datum) {
        super();
        this.id = id;
        this.traject = traject;
        this.periode = periode;
        this.reden = reden;
        this.advies = advies;
        this.bericht = bericht;
        this.datum = datum;
    }

    
    public String getId() {
        return id;
    }

    
    public String getTraject() {
        return traject;
    }

    
    public String getPeriode() {
        return periode;
    }

    
    public String getReden() {
        return reden;
    }

    
    public String getAdvies() {
        return advies;
    }

    
    public String getBericht() {
        return bericht;
    }

    
    public Date getDatum() {
        return datum;
    }

    
}
