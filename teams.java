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
      Label messageLabel = new Label("Hello World");
      Label activity = new Label("Activity");
      Label chat = new Label("Chat");
      Label teams = new Label("Teams");
      Label sheCodes = new Label("sheCodes");
      Label groupChat = new Label("Group Chat");
      Label voiceChannel = new Label("voiceChannel");
      Label post1 = new Label("Post 1");
      Label post2 = new Label("Post 2");
      Label members = new Label("members");
      
      // Put the Label in an HBox.

      // Put the promptLabel and the costTextField in HBox
      
      // Put the HBox, calcButton, and resultLabel in VBox
      VBox left = new VBox(activity, chat, teams);
      VBox channels = new VBox(sheCodes, groupChat, voiceChannel);
      VBox bulletin = new VBox(post1, post2);
      VBox groupchat = new VBox(members);
      
      // Create a Scene with the HBox as its root node.
      HBox hbox = new HBox(10, left, channels, bulletin, groupchat);
      Scene scene = new Scene(hbox);

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
