import org.junit.Test;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Константин on 27.12.2016.
 */
public class Main {
        private static final String BASE_API = "https://www.tinkoff.ru/api/v1/currency_rates/";
//        private static final String BASE_API = "http://gturnquist-quoters.cfapps.io/api/random";

    @Test
    public void someTest(){

    RestTemplate restTemplate = new RestTemplate();
//    Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
    Quote quote = restTemplate.getForObject(BASE_API, Quote.class);
        System.out.println(quote.toString());
    }

}
