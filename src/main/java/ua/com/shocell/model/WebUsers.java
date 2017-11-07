package ua.com.shocell.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Component
@Entity
@Cacheable
@Table(
        name = "Web_users"
)
public class WebUsers {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    @Column(
            name = "User_ID"
    )
    private int userID;
    @Column(
            name = "Login",
            unique = true,
            nullable = false
    )
    private String login;
    @Column(
            name = "Password",
            nullable = false
    )
    private String password;
    @Column(
            name = "Admin_Type",
            nullable = false
    )
    private boolean adminType;
    @OneToMany(
            mappedBy = "webUserID",
            fetch = FetchType.LAZY,
            cascade = {CascadeType.ALL},
            orphanRemoval = true
    )
    private List<Abonents> owners = new ArrayList();

    public WebUsers() {
    }

    public WebUsers(String login, String password, boolean adminType) {
        this.login = login;
        this.password = password;
        this.adminType = adminType;
    }

    public int getUserID() {
        return this.userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdminType() {
        return this.adminType;
    }

    public void setAdminType(boolean adminType) {
        this.adminType = adminType;
    }

    public List<Abonents> getOwners() {
        return this.owners;
    }

    public void setOwners(List<Abonents> owners) {
        this.owners = owners;
    }

    public String toString() {
        return "WebUsers{userID=" + this.userID + ", login='" + this.login + '\'' + ", password='" + this.password + '\'' + ", adminType=" + this.adminType + '}';
    }
}
