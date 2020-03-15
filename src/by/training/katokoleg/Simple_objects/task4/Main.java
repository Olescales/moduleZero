package by.htp.katokoleg.simpleclassandobject.task4;

public class Main {

	public static void main(String[] args) {
		
		
		Train train1 = new Train("Minsk", 389, "20:30");
		Train train2 = new Train("Minsk", 253, "11:30");
		Train train3 = new Train("Minsk", 2, "19:30");
		Train train4 = new Train("Kiev", 68, "05:26");
		Train train5 = new Train("Vilnius", 864, "07:30");

		Train[] trains = new Train[5];
		trains[0] = train1;
		trains[1] = train2;
		trains[2] = train3;
		trains[3] = train4;
		trains[4] = train5;
		
		for(Train tr : trains) {
			System.out.println(tr);
		}
		
		TrainLogic tl = new TrainLogic(trains);
		tl.sortTrainsByNumberByDecr();
		
		System.out.println("==================================================================");
		
		for(Train tr : trains) {
			System.out.println(tr);
		}
		
		tl.sortTrainsByNumberByIncr();
		
		System.out.println("==================================================================");
		
		for(Train tr : trains) {
			System.out.println(tr);
		}
		
		//System.out.println(tl.outputInformationAboutTrain(trains));
		System.out.println("==================================================================");
		tl.sortTrainsByDestination(trains);
		
		for(Train tr : trains) {
			System.out.println(tr);
		}
		
	}

}
