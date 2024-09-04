package example.c1;


import org.springframework.stereotype.Component;
import java.util.*;
@Component
public class BusinessCalculationService {
	private DataService dataService;
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService=dataService;
	}
	public int findMax() {
		return (Arrays.stream(dataService.retrieve()).max().orElse(0));
	}

}
