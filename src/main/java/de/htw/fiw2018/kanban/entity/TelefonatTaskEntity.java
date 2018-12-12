package de.htw.fiw2018.kanban.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Map;


// If @Table annotation is missing, it is assumed that this
// entity will be mapped to a table named TelefonatTaskEntity
@Entity
@Table(name = "telefonat")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class TelefonatTaskEntity extends GenericTaskEntity {

    @Column(name = "caller")
    String caller;

    @Column(name = "phonenumber")
    String phoneNumber;

    @Column(name = "message")
    String message;


    public void process(Map<String, String> data) {
        newData.put("id", String.valueOf(data.get("id")));
        newData.put("caller", data.get("caller"));
        newData.put("phoneNumber", data.get("phoneNumber"));
        newData.put("message", data.get("message"));
        newData.put("createdAt", String.valueOf(data.get("createdAt")));
        newData.put("updatedAt", String.valueOf(data.get("updatedAt")));
    }

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
