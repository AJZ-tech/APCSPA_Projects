package ConsumerLab;
class Main {
	public static void main(String[] args) {
		System.out.println("26WestReview:");
		System.out.println(Review.totalSentiment("src/ConsumerLab/26WestReview.txt"));
		System.out.println("simpleReview:");
		System.out.println(Review.totalSentiment("src/ConsumerLab/simpleReview.txt"));
		System.out.println("positiveAdjectives:");
		System.out.println(Review.totalSentiment("src/ConsumerLab/positiveAdjectives.txt"));
		System.out.println("negativeAdjectives:");
		System.out.println(Review.totalSentiment("src/ConsumerLab/negativeAdjectives.txt"));
	}
}