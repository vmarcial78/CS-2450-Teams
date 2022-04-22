import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
      
      
      Image activitypic = new Image("File:activitybuttonpic.PNG");
      ImageView activityview = new ImageView(activitypic);
      activityview.setFitHeight(50);
      activityview.setPreserveRatio(true);

      Image chatpic = new Image("File:chatbuttonpic.PNG");
      ImageView chatview = new ImageView(chatpic);
      chatview.setFitHeight(50);
      chatview.setPreserveRatio(true);

      Image teampic = new Image("File:teamsbuttonpic.PNG");
      ImageView teamview = new ImageView(teampic);
      teamview.setFitHeight(50);
      teamview.setPreserveRatio(true);

      Image assignpic = new Image("File:assignbuttonpic.PNG");
      ImageView assignview = new ImageView(assignpic);
      assignview.setFitHeight(50);
      assignview.setPreserveRatio(true);

      Image calendarpic = new Image("File:calendarbuttonpic.PNG");
      ImageView calendarview = new ImageView(calendarpic);
      calendarview.setFitHeight(50);
      calendarview.setPreserveRatio(true);

      Image callspic = new Image("File:callsbuttonpic.PNG");
      ImageView callsview = new ImageView(callspic);
      callsview.setFitHeight(50);
      callsview.setPreserveRatio(true);

      Image filespic = new Image("File:filesbuttonpic.PNG");
      ImageView filesview = new ImageView(filespic);
      filesview.setFitHeight(50);
      filesview.setPreserveRatio(true);

      Image morepic = new Image("File:morebuttonpic.PNG");
      ImageView moreview = new ImageView(morepic);
      moreview.setFitHeight(50);
      moreview.setPreserveRatio(true);


      
      Label searchLabel = new Label("search");

      Button activity = new Button();
      activity.setGraphic(activityview);
      activity.setPrefSize(50, 50);

      Button chat = new Button();
      chat.setGraphic(chatview);
      chat.setPrefSize(50, 50);

      Button teams = new Button();
      teams.setGraphic(teamview);
      teams.setPrefSize(50, 50);

        
      Button assignments = new Button();
      assignments.setGraphic(assignview);
      assignments.setPrefSize(50, 50);

      Button calendar = new Button();
      calendar.setGraphic(calendarview);
      calendar.setPrefSize(50, 50);

      Button calls = new Button();
      calls.setGraphic(callsview);
      calls.setPrefSize(50, 50);

      Button files = new Button();
      files.setGraphic(filesview);
      files.setPrefSize(50, 50);

      Button more = new Button();
      more.setGraphic(moreview);
      more.setPrefSize(50, 50);

      Label members = new Label("members");
      Label rachel = new Label("members");
      Button shecodesbutton = new Button("sheCodes");
      
      // Create other boxes
      HBox searchBar = new HBox(searchLabel);
      VBox left = new VBox(activity, chat, teams, assignments,calendar,calls,files,more);
     
      
     
      VBox membersList = new VBox(members, rachel);
      HBox main = new HBox(shecodesbutton);
      left.getStyleClass().add("left-side");
     
      membersList.getStyleClass().add("members-list");
      searchBar.getStyleClass().add("search-bar");
      
      // Create a Scene with the VBox as its root node.
      HBox hbox = new HBox(10, left,  membersList,main);
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
