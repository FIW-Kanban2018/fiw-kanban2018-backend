package de.htw.fiw2018.kanban;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Telefonat extends Task {

    // send data as key-value-pairs (json format)
    int id;
    String category = "telefonat";
    String caller;
    String phoneNumber;
    String message;
    Date date;

    public Telefonat (int id, String caller, String phoneNumber, String message, Date date)
    {
     this.id = id;
     this.caller = caller;
     this.phoneNumber = phoneNumber;
     this.message = message;
     this.date = date;
    }

    public Telefonat getTelefonatData() {
        return this;
    }

    public void setData() {

    }

    public Map saveToMap() {
        Map<String, String> data = new HashMap();
        data.put("id", ((Integer) id).toString());
        data.put("caller", caller);
        data.put("phoneNumber", phoneNumber);
        data.put("message", message);
        data.put("date", date.toString());
        return data;
    }
}
