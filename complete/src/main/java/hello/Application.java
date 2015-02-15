package hello;

import org.springframework.web.client.RestTemplate;

public class Application {

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Person person = restTemplate.getForObject("http://localhost:8080/people/1", Person.class);
        System.out.println("FirstName:    " + person.getFirstName());
        System.out.println("LastName:   " + person.getLastName());
    }

}