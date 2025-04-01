package scramblegame;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String[] wordList = {"Java", "Javascript", "Go", "Python", "Ruby", "React", "Spring", "Rails", "Node", "Express", "Django"};
		
		int playerScore = 0;
		boolean keepPlaying = true;
		
		System.out.println("Welcome to Word Scramble Wizard! \nUnscremble the magic words to score points!");
		
		while (keepPlaying) {
			String word = wordList[random.nextInt(wordList.length)];
			String scrambledWord = scrambleWord(word, random);
			System.out.println("Scrambled Word: " + scrambledWord);
			boolean wordGuessed = false;
			int attempts = 3;
			
			while (attempts > 0 && !wordGuessed) {
				System.out.println("Your Guess: ");
				String playerguess = scanner.nextLine();
				
				if (playerguess.equalsIgnoreCase(word)) {
					System.out.println("Correct! You've scrambled the word!");
					playerScore++;
					wordGuessed = true;
				} else {
					attempts--;
					System.out.println("Wrong! Attempts remaining: " + attempts);
				}
			}
			
			if (!wordGuessed) {
				System.out.println("The correct word was: " + word);
			}
			
			System.out.println("Your currently score: " + playerScore);
			System.out.println("Do you want to play again? (yes/no): ");
			String response = scanner.nextLine();
			keepPlaying = response.equalsIgnoreCase("yes");
		}
		
		System.out.println("Thank you for playing! Your final score: " + playerScore);
		scanner.close();
	}
	
	public static String scrambleWord(String word, Random random) {
		char[] letters = word.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			int j = random.nextInt(letters.length);
			char temp = letters[i];
			letters[i] = letters[j];
			letters[j] = temp;
		}
		return new String(letters);
	}
}
