package eu.senla.taskTrain.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class taskTrain {
	private int number;
	private String point;
	private Date time;
	
	public taskTrain(int number, String point, Date time){
		this.number = number;
		this.point = point;
		this.time = time;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if (number>0) {
			this.number = number;
		}
		else System.out.println( "Не корректно введён номер поезда" );
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(String time) throws ParseException{	
		this.time=new SimpleDateFormat("dd.MM.yyyy HH:mm").parse(time);
	}

	@Override
	public String toString() {
		return "Поезд " + point + ", Номер поезда "  + number + ", Время отправления " + time;
	}
	
}
