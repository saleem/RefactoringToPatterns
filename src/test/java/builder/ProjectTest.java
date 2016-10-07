package builder;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ProjectTest {
    @Test
    public void createWithMinimalParameters() {
        Project project = ProjectBuilder.name("Acme Tech").build();
        assertThat(project.getName(), is("Acme Tech"));
    }
}
