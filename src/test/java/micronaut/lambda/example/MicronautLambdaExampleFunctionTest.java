package micronaut.lambda.example;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MicronautLambdaExampleFunctionTest {

    @Test

    public void testFunction() throws Exception {
        EmbeddedServer server = ApplicationContext.run(EmbeddedServer.class);

        MicronautLambdaExampleClient client = server.getApplicationContext().getBean(MicronautLambdaExampleClient.class);
        Greeting greeting = new Greeting("Jon", "Snow");

        assertEquals(client.apply(greeting).blockingGet(), "Hello Jon Snow!!");
        server.stop();
    }



}
