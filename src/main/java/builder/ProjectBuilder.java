package builder;

import java.time.LocalDate;


public class ProjectBuilder {


    private String name;
    private String location;
    private LocalDate begins;
    private LocalDate ends;


    public ProjectBuilder name(String name) {
        this.name = name;
        return this;
    }


    public ProjectBuilder location(String location) {
        this.location = location;
        return this;
    }

    public ProjectBuilder begins(LocalDate begins) {
        this.begins = begins;
        return this;
    }

    public ProjectBuilder ends(LocalDate ends) {
        this.ends = ends;
        return this;
    }


    public Project build() {
        Project project = new Project();
        project.setName(name);
        project.setLocation(location);
        project.setBeginDate(begins);
        project.setEndDate(ends);
        return project;
    }
}
