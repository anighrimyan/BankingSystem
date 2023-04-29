import java.util.Date;
public class DateClass {
   private final Date startDate;
   private Date closeDate;

    public DateClass() {
        startDate = new Date();
    }

    public void setCloseDate() {
        this.closeDate = new Date();

    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }
}
