package ConsumerLab;
class Main {
	public static void main(String[] args) {
		System.out.println("\n\n26WestReview::\n");
		System.out.println(Review.totalSentiment("src/ConsumerLab/26WestReview.txt"));
		System.out.println("\n\nsimpleReview::\n");
		System.out.println(Review.totalSentiment("src/ConsumerLab/simpleReview.txt"));
		System.out.println("\n\npositiveAdjectives::\n");
		System.out.println(Review.totalSentiment("src/ConsumerLab/positiveAdjectives.txt"));
		System.out.println("\n\nnegativeAdjectives::\n");
		System.out.println(Review.totalSentiment("src/ConsumerLab/negativeAdjectives.txt"));
	}
}