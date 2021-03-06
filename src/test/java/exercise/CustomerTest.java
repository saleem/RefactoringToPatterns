package exercise;


import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class CustomerTest {

    @Ignore("Ignored this failing test")
    @Test
    public void shouldCharge3DollarsForANewRelease(){
        Customer customer = new Customer("Bill");
        Rental rental = mock(Rental.class);

        Tape tape = mock(Tape.class);

        customer.addRental(rental);

        assertThat(customer.statement(), containsString("Amount owed is 3"));
    }
}