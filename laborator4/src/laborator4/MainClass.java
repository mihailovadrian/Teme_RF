package laborator4;

public class MainClass {

	public static void main(String[] args) {
		double[][] learningSet;
		try {
			learningSet = FileUtils.readLearningSetFromFile("d:\\in.txt");
			int numberOfPatterns = learningSet.length;
			int numberOfFeatures = learningSet[0].length;
			double distanceMatrix[][] = new double[learningSet.length][learningSet.length];

			System.out.println(String.format("The learning set has %s patters and %s features", numberOfPatterns,
					numberOfFeatures));

			for (int i = 0; i < numberOfPatterns; i++) {
				for (int j = i + 1; j < numberOfPatterns; j++) {
					distanceMatrix[i][j] = DistanceUtils.calculateEuclidianDistance(learningSet[i], learningSet[j],
							numberOfFeatures);
					distanceMatrix[j][i] = distanceMatrix[i][j];
					System.out.println(distanceMatrix[i][j]);

				}

			}
			int searchPattern = numberOfPatterns - 1;
			int closetPattern = 0;
			double[] distanceRow = distanceMatrix[searchPattern];
			double minDistance = distanceRow[0];
			for (int i = 0; i < distanceRow.length; i++) {
				if (distanceRow[i] < minDistance && i != searchPattern) {
					minDistance = distanceRow[i];
					closetPattern = i;
				}
			}

			int classColumn = learningSet[closetPattern].length - 1;
			System.out.println("Searched class is " + learningSet[closetPattern][classColumn]);
		} catch (USVInputFileCustomException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finished learning set operations");
		}
	}

}
