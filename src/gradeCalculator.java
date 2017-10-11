import javax.swing.JOptionPane;

public class gradeCalculator {

	public static void main(String[] args) {
		//Ask user how many grades they will input
		String input = JOptionPane.showInputDialog(null, 
				"How many grades will you be entering?");
			
		//Create an array of that size
		int numScores = Integer.parseInt(input);
		int [] listScores = new int[numScores];
				
		//Ask what their scores are
		int index;
		for (index = 0; index < listScores.length; index++) {
			String score = "";
			if (index == 0) {
				score = JOptionPane.showInputDialog(null, 
						"What is your 1st score?");
			} else if (index == 1) {
				score = JOptionPane.showInputDialog(null,
						"What is your 2nd score?");
			} else if (index == 2) {
				score = JOptionPane.showInputDialog(null,
						"What is your 3rd score?");
			} else {
				score = JOptionPane.showInputDialog(null,
						"What is your " + (index + 1) + "th score?");
			}
			listScores[index] = Integer.parseInt(score);
		}
				
		//Calculate the average
		int sumScores = 0;
		for (index = 0; index < listScores.length; index++) {
			sumScores = sumScores + listScores[index];
		}
		int average = sumScores / numScores;
				
		//Determine the highest and lowest grade
		int highest = listScores[0];
		int lowest = listScores[0];
		for (index = 0; index < listScores.length; index++) {
			if (listScores[index] > highest) {
				highest = listScores[index];
			} else if (listScores[index] <= lowest) {
				lowest = listScores[index];
			}
		}
				
		//Calculate the average with the lowest score dropped
		int averageNoLowest = (sumScores - lowest) / (numScores - 1);
				
		//Show message
		JOptionPane.showMessageDialog(null,
				"Average: " + average 
				+ "\nHighest score: " + highest 
				+ "\nLowest score: " + lowest 
				+ "\nAverage without lowest score: " + averageNoLowest);

	}

}
