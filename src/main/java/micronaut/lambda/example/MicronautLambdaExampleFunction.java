package micronaut.lambda.example;

import io.micronaut.context.annotation.Primary;
import io.micronaut.function.FunctionBean;

import java.util.function.Function;

@Primary
@FunctionBean("micronaut-lambda-example")
public class MicronautLambdaExampleFunction implements Function<Greeting, String> {


    @Override
    public Function compose(Function before) {
        return null;
    }

    @Override
    public Function andThen(Function after) {
        return null;
    }

    @Override
    public String apply(Greeting greeting) {
        return "Hello" + " " + greeting.getFirstName() + " " + greeting.getLastName() + "!!";
    }


}
