package ro.usv.rf;

public class MainClass {

	public static void main(String[] args) {
		double[][] learningSet = FileUtils.readLearningSetFromFile("e://in.txt");
		FileUtils.writeLearningSetToFile("e://out.csv", FileUtils.normalizeLearningSet(learningSet));

	}

}
