package example.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class mongoDBDataService implements DataService {
	int[] arr= {11,22,33,44,55};
	public int[] retrieve() {
		return arr;
	}
}
