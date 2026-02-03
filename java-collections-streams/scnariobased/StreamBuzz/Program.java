package StreamBuzz;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public void registerCreator(CreatorStats record) {
		CreatorStats.engagementBoard.add(record);
	}
	
	public Map<String, Integer> getTopPostCounts(List<CreatorStats> records, double likeThreshold){
		Map<String, Integer> topPosts = new LinkedHashMap<>();
		
		for(CreatorStats creator : records) {
			int count = 0;
			for(double like : creator.getWeeklyLikes()) {
				if(like >= likeThreshold)
				count ++ ;
			}
			if(count != 0)
				topPosts.put(creator.getCreatorName(), count);
		}
		return topPosts;
		
	}
	public double calculateAverageLikes() {
        double totalLikes = 0;
        int totalWeeks = 0;

        for (CreatorStats creator : CreatorStats.engagementBoard) {
            for (double likes : creator.getWeeklyLikes()) {
                totalLikes += likes;
                totalWeeks++;
            }
        }
        
        return totalWeeks == 0 ? 0 : totalLikes / totalWeeks;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Program program = new Program();
        boolean running = true;

        while (running) {
            // Display Menu [cite: 29-32]
            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // Choice 1: Register Creator [cite: 13-15]
                    CreatorStats newCreator = new CreatorStats();
                    System.out.print("Enter Creator Name: ");
                    newCreator.setCreatorName(scanner.nextLine());
                    
                    double[] likes = new double[4];
                    System.out.println("Enter weekly likes (Week 1 to 4): ");
                    for (int i = 0; i < 4; i++) {
                        likes[i] = scanner.nextDouble();
                    }
                    newCreator.setWeeklyLikes(likes);
                    
                    program.registerCreator(newCreator);
                    System.out.println("Creator registered successfully");
                    break;

                case 2:
                    // Choice 2: Show Top Posts [cite: 16-18]
                    System.out.print("Enter like threshold: ");
                    double threshold = scanner.nextDouble();
                    Map<String, Integer> results = program.getTopPostCounts(CreatorStats.engagementBoard, threshold);
                    
                    if (results.isEmpty()) {
                        System.out.println("No top-performing posts this week");
                    } else {
                        results.forEach((name, count) -> System.out.println(name + " - " + count));
                    }
                    break;

                case 3:
                    // Choice 3: Average Likes [cite: 19, 82]
                    double avg = program.calculateAverageLikes();
                    // Using (int) cast if the sample output strictly requires integer representation
                    System.out.println("Overall average weekly likes: " + (int)avg);
                    break;

                case 4:
                    // Choice 4: Exit [cite: 20, 89]
                    System.out.println("Logging off - Keep Creating with StreamBuzz!");
                    running = false;
                    break;
            }
        }
        scanner.close();
	}

}
