package by.htp.katokoleg.simpleclassandobject.task4;

import java.util.Arrays;
import java.util.Scanner;

public class TrainLogic {

	private Train[] trains;

	public TrainLogic(Train[] trains) {
		this.trains = trains;
	}

	public Train[] getTrains() {
		return trains;
	}

	public void sortTrainsByNumberByDecr() {

		for (int i = 0; i < trains.length; i++) { // сортируем массив
			int max = 0;
			for (int j = i; j < trains.length; j++) {
				if (trains[j].getTrainNumber() > max) {
					max = trains[j].getTrainNumber();
				}
			}
			for (int k = i; k < trains.length; k++) {
				if (trains[k].getTrainNumber() == max) {

					Train t = trains[k];
					trains[k] = trains[i];
					trains[i] = t;
					break;
				}
			}
		}
	}

	public void sortTrainsByNumberByIncr() {

		for (int i = 0; i < trains.length; i++) { // сортируем массив
			int min = 1000;
			for (int j = i; j < trains.length; j++) {
				if (trains[j].getTrainNumber() < min) {
					min = trains[j].getTrainNumber();
				}
			}
			for (int k = i; k < trains.length; k++) {
				if (trains[k].getTrainNumber() == min) {

					Train t = trains[k];
					trains[k] = trains[i];
					trains[i] = t;
					break;
				}
			}
		}
	}

	public Train outputInformationAboutTrain(Train[] trains) {

		int number;

		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();

		for (Train train : trains) {
			if (number == train.getTrainNumber()) {
				return train;
			}
		}
		return null;
	}

	public void sortTrainsByDestination(Train[] trains) {

		int l = trains.length;
		String[] trainsSortByDest = new String[l];
		String[] trainsSortByTime = new String[2];

		for (int i = 0; i < trains.length; i++) {
			trainsSortByDest[i] = trains[i].getDestination();
		}
		Arrays.sort(trainsSortByDest);

		for (int i = 0; i < trains.length; i++) {
			for (int j = i; j < trains.length; j++) {
				if (trainsSortByDest[i] == trains[j].getDestination()) {

					Train t = trains[j];
					trains[j] = trains[i];
					trains[i] = t;
				}
			}
		}
		for (int i = 0; i < trains.length; i++) {
			for (int j = i; j < trains.length; j++) {
				if (trains[j].getDestination() == trains[i].getDestination()) {
					trainsSortByTime[0] = trains[j].getDepartureTime();
					trainsSortByTime[1] = trains[i].getDepartureTime();
					Arrays.sort(trainsSortByTime);
					if (trainsSortByTime[0] == trains[j].getDepartureTime()) {
						
						Train t = trains[j];
						trains[j] = trains[i];
						trains[i] = t;
					}
				}
			}
		}
	}

}
