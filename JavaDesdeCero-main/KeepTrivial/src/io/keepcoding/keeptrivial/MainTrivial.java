package io.keepcoding.keeptrivial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import io.keepcoding.keeptrivial.model.GameState;
import io.keepcoding.keeptrivial.model.Question;
import io.keepcoding.keeptrivial.model.Team;
import io.keepcoding.keeptrivial.model.Topic;

public class MainTrivial {
	public static void main(String [] args) {
		// initialize questions
		var generalQuestions = getQuestions();
		var game = new GameState(getTeams(generalQuestions));
		
		do {
			for (Team team: game.getTeamList()) {
				var pendingTopics = team.getPendingTopics();
				var topic = pendingTopics.get(getRandomInt(pendingTopics.size()));
				var question = topic.getQuestionList()
								.get(getRandomInt(topic.getQuestionList().size()));
				
				
				title("Turno del equipo: " + team.getTeamName());
				System.out.println();
				
				title(topic.getTopicName());
				
				var option = handleQuestion(question);
				
				System.out.println();
				if (question.checkQuestion(option)) {
					title("Great! Habéis acertado");
					team.markTopicDone(topic);
					var isWinner = game.checkWinner();
					if (isWinner) {
						break;
					}
				} else {
					title("Opción incorrecta");
				}
				System.out.println();
				title("Clasificación");
				System.out.println();
				for (var showTeam: game.getTeamList()) {
					System.out.println(showTeam.getTeamStatus());
				}
			}
			// Check winner team
		} while(game.getWinnerTeam() == null);
		System.out.println();
		title("Ha ganado: " + game.getWinnerTeam());
		
	}
	
	public static void title(String text) {
		int length = text.length();
		printHashtagLine(length + 4); // Bordes

        System.out.println("# " + text + " #");

        printHashtagLine(length + 4);
	}
	
	public static void printHashtagLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("#");
        }
        System.out.println();
    }
	
	private static int handleQuestion(Question question) {
		System.out.print(question);
		System.out.print("Opción elegida: ");
		
		Scanner input = new Scanner(System.in);
		
		int option = -1;
		var strOption = input.nextLine();
		
		if (esTransformableAEntero(strOption)) {
			option = Integer.parseInt(strOption);
		} else {
			title("Formato incorrecto");
		}
		
		
		return option;
	}
	
	public static void showError() {
		System.out.println("Opción incorrecta");
	}
	
	 public static boolean esTransformableAEntero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
	
	private static int getRandomInt(int max) {
		return new Random().nextInt(max);
	}
	
	private static ArrayList<Team> getTeams(ArrayList<Topic> topicList) {
		ArrayList<Team> list = new ArrayList<>();
		
		
		String text = "";
		boolean exit = false;
		do {
			Scanner input = new Scanner(System.in);

			System.out.print("Introduce el nombre del equipo (q para empezar el juego): ");

			text = input.nextLine();
			
			exit = "q".equals(text);
			
			if (!exit) {
				list.add(new Team(text, topicList));
			}
			
		} while(!exit);
		
		return list;
	}
	
	private static ArrayList<Topic> getQuestions() {
		ArrayList<Topic> list = new ArrayList<>();
		
		 File folder = new File("questions");
	        if (!folder.exists()) {
	            showError();
	        } else {
	        	File[] filesList = folder.listFiles();

	            for (File file : filesList) {
	                if (file.isFile() && file.getName().endsWith(".txt")) {
	                    var topicName = file.getName().substring(0, file.getName().length() - 4);
	                    var topic = new Topic(topicName);
	                    // Read the question
	                    
	                    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
	                        String line;
	                        List<String> block = new ArrayList<>();

	                        while ((line = br.readLine()) != null) {
                        		block.add(line);

	                            if (block.size() == 6) { // número de lineas que componen una pregunta
	                                topic.addQuestion(new Question(
	                                		block.get(0),
	                                		block.get(1),
	                                		block.get(2),
	                                		block.get(3),
	                                		block.get(4),
	                                		Integer.parseInt(block.get(5))
	                                		));
	                                block.clear();
	                            }
	                        }
	                        //System.out.println(topic);
	                        list.add(topic);
	                    } catch (IOException e) {
	                        e.printStackTrace();
	                    }
	                  
	                }
	            }
	        }
	        
		return list;
	}
}
