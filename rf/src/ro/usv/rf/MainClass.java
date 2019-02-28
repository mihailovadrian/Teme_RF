package ro.usv.rf;

public class MainClass {

	public static void main(String[] args) {
		double[][] learningSet = FileUtils.readLearningSetFromFile("d://in.txt");
		FileUtils.writeLearningSetToFile("d://out.csv", FileUtils.normalizeLearningSet(learningSet));

	}

}
