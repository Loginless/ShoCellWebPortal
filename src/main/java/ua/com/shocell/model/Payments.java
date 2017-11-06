package ua.com.shocell.model;

import java.util.Date;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Cacheable
@Table(
        name = "Payments"
)
public class Payments {
    @Id
    @GeneratedValue
    @Column(
            name = "Payment_ID"
    )
    private int paymentID;
    @Column(
            name = "Date"
    )
    private Date date;
    @Column(
            name = "Payment_Sum"
    )
    private int paymentSum;
    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "Abonent_ID",
            foreignKey = @ForeignKey(
                    name = "Fk_Abonent_Payments"
            )
    )
    private Abonents abonentID;

    public Payments() {
    }

    public Payments(Date date, int paymentSum, Abonents abonentID) {
        this.date = date;
        this.paymentSum = paymentSum;
        this.abonentID = abonentID;
    }

    public int getPaymentID() {
        return this.paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPaymentSum() {
        return this.paymentSum;
    }

    public void setPaymentSum(int paymentSum) {
        this.paymentSum = paymentSum;
    }

    public Abonents getAbonentID() {
        return this.abonentID;
    }

    public void setAbonentID(Abonents abonentID) {
        this.abonentID = abonentID;
    }

    public String toString() {
        return "Payments{paymentID=" + this.paymentID + ", activatedServices=, date=" + this.date + ", paymentSum=" + this.paymentSum + ", accountBalance=, abonentID=" + this.abonentID + '}';
    }
}

