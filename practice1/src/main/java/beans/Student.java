package beans;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class Student {

	@JsonProperty
	public String FirstName;
	@JsonProperty
	public String LastName;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	@Override
	public String toString() {
		return "Student [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
}
