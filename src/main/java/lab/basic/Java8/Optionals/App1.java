package lab.basic.Java8.Optionals;

import java.util.Optional;

public class App1 {
	public static void main(String[] args) {
		Optional<Integer> possible = Optional.of(5);
		possible.ifPresent(System.out::println);

		// Assume this value has returned from a method
		Optional<Company> companyOptional = Optional.empty();

		// Now check optional; if value is present then return it,
		// else create a new Company object and retur it
		Company company = companyOptional.orElse(new Company());

		// OR you can throw an exception as well
		company = companyOptional.orElseThrow(IllegalStateException::new);
	}
}
