package example.c1;

import org.springframework.stereotype.Component;

@Component
public class mySQLDataService implements DataService {
	int[] arr= {1,2,3,4,5};
	public int[] retrieve() {
		return arr;
	}
}
