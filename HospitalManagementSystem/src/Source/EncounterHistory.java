/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Source;

import java.util.ArrayList;

/**
 *
 * @author srikr
 */
public class EncounterHistory {
    private ArrayList<Encounter> encounterHistory;

    public EncounterHistory() {
    }
    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    public Encounter addNewEncounterDetails(){
        Encounter newEncounterDetails = new Encounter();
        encounterHistory.add(newEncounterDetails);
        return newEncounterDetails;
    }
    
}