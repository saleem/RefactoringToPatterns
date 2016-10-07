package builder;

import java.time.LocalDate;


public class Project {

    private String name;
    private String location;
    private LocalDate beginDate;
    private LocalDate endDate;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public String getLocation() {
        return location;
    }


    public LocalDate getBeginDate() {
        return beginDate;
    }


    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }


    public LocalDate getEndDate() {
        return endDate;
    }


    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
