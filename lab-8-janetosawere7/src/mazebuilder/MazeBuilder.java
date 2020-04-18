package mazebuilder;

import javafx.application.Application;
import java.io.File;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;


public class MazeBuilder extends Application {
    private BorderPane root;
    String m;
    String w;

    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();
        GridPane grid = new GridPane();
        HBox hbox = new HBox();
        MyHandler mh = new MyHandler();
        String m = JOptionPane.showInputDialog("What is the width?");
        String w = JOptionPane.showInputDialog("What is the height?");
        if (m.isEmpty() || w.isEmpty()) {
            System.exit(0);
        } else {
            for (int i = 0; i < Integer.parseInt(m); i++) {
                for (int j = 0; j < Integer.parseInt(w); j++) {
                    Button b = new Button();
                    b.setStyle("-fx-background-color: blue; -fx-border-width: 2px; -fx-border-color: black;");
                    b.setOnAction(mh);
                    b.setPrefHeight(30);
                    b.setPrefWidth(30);
                    getColorChar(b);
                    grid.add(b, i, j);
                }
            }
            Button s = new Button("Save");
            Button c = new Button("Exit");
            Button p = new Button("Print");
            s.setOnAction(mh);
            c.setOnAction(mh);
            p.setOnAction(mh);
            hbox.getChildren().addAll(s, c, p);
            grid.setAlignment(Pos.CENTER);
            hbox.setAlignment(Pos.CENTER);
            root.setCenter(grid);
            root.setBottom(hbox);
            Scene scene = new Scene(root, 300, 250);
            primaryStage.setTitle("Maze Builder");
            primaryStage.setScene(scene);
            primaryStage.show();

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

    public class MyHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {

            Button b = (Button) e.getSource(); //e.getSource() returns the button that was clicked.

            if (b.getText().equals("Save")) {

                try { //create output file
                    JFileChooser f = new JFileChooser();
                    int retVal = f.showSaveDialog(null);
                    if (retVal == JFileChooser.APPROVE_OPTION) {
                        File file = f.getSelectedFile();
                        PrintWriter p = new PrintWriter(file);
                        String dem = "Height: " + m + " x " + "Width: " + w;
                        p.println(dem);
                        char color = getColorChar(b);
                        for (int i = 0; i < Integer.parseInt(m); i++) {
                            for (int j = 0; j < Integer.parseInt(w); j++) {
                                if (b.getStyle().indexOf("blue") == '0') {
                                    p.print("0");
                                } else if (color == '1') {
                                    p.print("1");
                                } else if (color == 'S') {
                                    p.print("S");
                                } else {
                                    p.print("E");
                                }
                            }
                            p.println();
                        }
                        p.close();
                    }
                    System.exit(0);
                } catch (java.io.IOException a) {
                    System.err.println("Error");
                }
            } else if (b.getText().equals("Exit")) {

                //exit the application
                System.exit(0);
            } else { //if a maze button is clicked
                char val = getColorChar(b);
                if (val == '0') {
                    b.setStyle("-fx-background-color: white;");
                } else if (val == '1') {

                    b.setStyle("-fx-background-color: green; -fx-border-width: 2px; -fx-border-color: black;");
                } else if (val == 'S') {

                    b.setStyle("-fx-background-color: red; -fx-border-width: 2px; -fx-border-color: black;");
                } else {

                    b.setStyle("-fx-background-color: blue; -fx-border-width: 2px; -fx-border-color: black;");
                }
            }
        }
    }
    public class GridButtons extends GridPane {
        MyHandler buttonFunctions;
        public GridButtons(int size) {
            buttonFunctions = new MyHandler();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    Button gridButton = new Button();
                    gridButton.setStyle("-fx-background-color: blue");
                    this.add(gridButton, j, i);
                    gridButton.setOnAction(buttonFunctions);
                }
            }
        }

    }
    public BorderPane test() {
        BorderPane test = new BorderPane();

        return test;
    }
    private char getColorChar(Button b) {
        if (b.getStyle().indexOf("blue") > -1) {
            return '0';
        } else if (b.getStyle().indexOf("white") > -1) {
            return '1';
        } else if (b.getStyle().indexOf("green") > -1) {
            return 'S';
        } else {
            return 'E';
        }
    }

}










