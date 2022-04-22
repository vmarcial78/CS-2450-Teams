import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

/**
 *  Recreation of Teams with design updates
 */

public class teams extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create a Label component.
      Label searchLabel = new Label("search");
      Label activity = new Label("Activity");
      Label chat = new Label("Chat");
      Label teams = new Label("Teams");
      Label sheCodes = new Label("sheCodes");
      Label groupChat = new Label("Group Chat");
      Label voiceChannel = new Label("voiceChannel");
      Label post1 = new Label("Post 1");
      Label post2 = new Label("Post 2");
      Label members = new Label("members");
      Label rachel = new Label("members");
      
      // Create other boxes
      HBox searchBar = new HBox(searchLabel);
      VBox left = new VBox(activity, chat, teams);
      VBox channels = new VBox(sheCodes, groupChat, voiceChannel);
      VBox bulletin = new VBox(post1, post2);
      VBox groupchat = new VBox(members);
      VBox membersList = new VBox(members, rachel);
      left.getStyleClass().add("left-side");
      channels.getStyleClass().add("channels");
      bulletin.getStyleClass().add("bulletin");
      membersList.getStyleClass().add("members-list");
      searchBar.getStyleClass().add("search-bar");
      
      // Create a Scene with the VBox as its root node.
      HBox hbox = new HBox(10, left, channels, bulletin, membersList);
      VBox vbox = new VBox(searchBar, hbox);

      Scene scene = new Scene(vbox);

      // Set stylesheet
      scene.getStylesheets().add("teams.css");
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("Teams");
      
      // Show the window.
      primaryStage.show();
   }
}
