package il.cshaifasweng.OCSFMediatorExample.client.Events;

import il.cshaifasweng.OCSFMediatorExample.entities.ResInfo;

public class UpdateBranchTablesEvent {
    ResInfo reservation;
    public UpdateBranchTablesEvent(ResInfo resInfo) {
        if(resInfo == null)
        {
            System.out.println("Null ResInfo");
        }
        this.reservation= resInfo;
    }
    public ResInfo getReservation() {
        return reservation;
    }
    public void setReservation(ResInfo resInfo) {
        this.reservation = resInfo;
    }

}
