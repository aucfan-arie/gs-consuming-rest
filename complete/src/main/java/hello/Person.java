package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
