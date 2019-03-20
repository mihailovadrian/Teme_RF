package laborator4;

public class DistanceUtils {
	protected static double calculateEuclidianDistance(double firstLine[], double nextLine[], int numberOfFeatures) {
		double result = 0;
		for (int i = 0; i < numberOfFeatures - 1; i++) {
			result += Math.pow(firstLine[i] - nextLine[i], 2);
		}
		return Math.round(Math.sqrt(result) * 100.0) / 100.0;
	}

}
