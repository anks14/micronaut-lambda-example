package micronaut.lambda.example;

import io.micronaut.function.client.FunctionClient;
import io.reactivex.Single;

import javax.inject.Named;

@FunctionClient
public interface MicronautLambdaExampleClient {

    @Named("micronaut-lambda-example")
    Single<String> apply(Greeting greeting);


}
