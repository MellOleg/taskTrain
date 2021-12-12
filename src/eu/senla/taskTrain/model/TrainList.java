package eu.senla.taskTrain.model;

import java.util.ArrayList;
import java.util.List;

public class TrainList {
	public List<taskTrain> getTrainsByPoint(List<taskTrain> railways, String dest){
		List <taskTrain> result =new ArrayList<>();
		for(taskTrain rail : railways) {
			if (rail.getPoint().equals(dest))
				result.add(rail);
		}
		return result;
	}

}
