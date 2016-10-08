package builder;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ProjectTest {

    @Test
    public void createWithMinimalParameters() {
        Project project = new ProjectBuilder().name("Acme Tech").build();
        assertThat(project.getName(), is("Acme Tech"));
    }

    @Test
    public void beginDateMustBeTodayWhenUnspecified() {
        Project project = new ProjectBuilder().name("Acme Tech").build();
        assertThat(project.getBeginDate(), is(LocalDate.now()));
    }


    @Test
    public void createWithAllParameters() {
        Project project = new ProjectBuilder().name("Acme Tech").location("Kansas City, MO").begins(LocalDate.of
                (2016, Month.NOVEMBER, 1)).ends(LocalDate.of(2017, Month.JULY, 31)).build();
        assertThat(project.getLocation(), is("Kansas City, MO"));
        assertThat(project.getBeginDate(), is(LocalDate.of(2016, Month.NOVEMBER, 1)));
        assertThat(project.getEndDate(), is(LocalDate.of(2017, Month.JULY, 31)));
    }
}
