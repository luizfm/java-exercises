package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post postOne = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zeland", "I'm going to visit this wonderful country!", 12);
		
		postOne.addComment(new Comment("Have a nice trip"));
		postOne.addComment(new Comment("Wow that's awesome!"));
		
		Post postTwo = new Post(sdf.parse("21/06/2018 13:05:44"), "Good night guys!", "See you tomorrow", 5);
		
		postTwo.addComment(new Comment("Good night"));
		postTwo.addComment(new Comment("Maybe the Force be with you"));
		
		System.out.println(postOne);
		System.out.println();
		System.out.println(postTwo);
	}

}
