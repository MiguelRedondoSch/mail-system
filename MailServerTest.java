

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class MailServerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MailServerTest
{
    private MailServer gmail;
    private MailClient mailClie1;
    private MailClient mailClie2;

    /**
     * Default constructor for test class MailServerTest
     */
    public MailServerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        gmail = new MailServer();
        mailClie1 = new MailClient(gmail, "pepe@gmail.com");
        mailClie2 = new MailClient(gmail, "maria@gmail.com");
        mailClie1.sendMailItem("maria@gmail.com", "Hola Maria, soy Pepe!");
        gmail = new MailServer();
        mailClie1 = new MailClient(gmail, "pepe@gmail.com");
        mailClie2 = new MailClient(gmail, "maria@gmail.com");
        mailClie2.getNextMailItem();
        mailClie2.getNextMailItem();
        mailClie2.printNextMailItem();
        mailClie1.sendMailItem("pepe@gmail.com", "Hola Maria, soy Pepe!");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
