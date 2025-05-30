package il.cshaifasweng.OCSFMediatorExample.entities;

import java.io.Serializable;

public class Response<T> implements Serializable {

    private ResponseType responseType;
    private Status status;
    private T data;
    private String message = "";
    private Recipient recipient = null;

    // Full Constructor
    public Response(ResponseType responseType, T data, String message,Status status, Recipient recipient) {
        this.status = status;
        this.data = data;
        this.message = message;
        this.responseType = responseType;
        this.recipient = recipient;
    }

    // Constructor without message
    public Response(ResponseType responseType,T data,Status status, Recipient recipient) {
        this.status = status;
        this.data = data;
        this.responseType = responseType;
        this.recipient = recipient;
    }

    // Constructor without data
    public Response(ResponseType responseType, String message ,Status status, Recipient recipient) {
        this.status = status;
        this.message = message;
        this.responseType = responseType;
        this.recipient = recipient;
    }

    // Getters and Setters
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public T getData() {
        System.out.println("[getData in Response] the data is: " + data);
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseType getResponseType() {
        return responseType;
    }

    public void setResponseType(ResponseType responseType) {
        this.responseType = responseType;
    }

    public Recipient getRecipient()
    {
        return recipient;
    }
    public void setRecipient(Recipient recipient)
    {
        this.recipient = recipient;
    }

    public enum ResponseType {
        NO_ACTION,
        //menu related responses
        RETURN_MENU,
        UPDATED_PRICE,
        REMOVE_DISH,
        ADD_DISH,
        UPDATE_INGREDIENTS,
        GET_LATEST_MENU_ITEM_ID,
        UPDATE_DISH_TYPE_RES,
        PERMIT_GRANTED_ACK,
        UPDATE_BRANCH_MENU,
        UPDATE_BRANCH_SPECIAL_ITEM,
        UPDATE_BRANCH_BASE_ITEM,

        RETURN_BRANCH_MENU,
        BRANCHES_SENT,
        RETURN_BRANCH,
        RETURN_BRANCH_BY_NAME,
        RETURN_DELIVERABLES,
        GET_ALL_DELIVERIES,

        RETURN_BRANCH_TABLES,
        UPDATE_BRANCH_RESERVATION,
        //login
        CORRECTNESS_USER,

        DELIVERY_CREATED,
        SEND_DELIVERY,
        DELIVERY_CANCELED,

        RETURN_RES_REPORT,
        RETURN_DELIV_REPORT,
        RETURN_COMP_REPORT,
        RETURN_REPORT,

        CANCELED_RESERVATION,
        ADDED_RESERVATION,
        UPDATE_BRANCH_TABLES,
        RETURN_ACTIVE_RESERVATIONS,

        //COMPLAINT RELATED RESPONSES
        RETURN_ALL_COMPLAINTS,
        Complaint_BY_EMPLOYEE,
        Complaint_BY_DATE,
        UPDATE_COMPLAINT,
        COMPLAINT_CREATED,
        CLIENT_ADDED,

    }

    public enum Status {
        ERROR,
        SUCCESS
    }
    public enum Recipient {
        ALL_CLIENTS,
        THIS_CLIENT,
        BOTH,
        ALL_CLIENTS_EXCEPT_SENDER
    }
}
