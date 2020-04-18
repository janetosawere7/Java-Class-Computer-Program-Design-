import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public  class SimpleCalc extends Application {
    private TextField txt;

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(txtField());
        borderPane.setCenter(gridPane());
        borderPane.setBottom(hBox());

        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    private TextField txtField() {

        txt = new TextField();
        txt.setEditable(false);
        return txt;
    }
    public void toLaunch() {
        this.launch();
    }

    private GridPane gridPane() {
        GridPane gridPane = new GridPane();
        int counter = 1;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                CircleButton circleButton = new CircleButton(counter + "");
                counter++;

                circleButton.setOnMousePressed(new EventHandler() {
                    @Override
                    public void handle(Event event) {
                        circleButton.setColor(Color.RED);
                        txt.appendText(circleButton.getValue());

                    }
                });
                circleButton.setOnMouseReleased(new EventHandler() {
                    @Override
                    public void handle(Event event) {
                        circleButton.setColor(Color.WHITE);

                    }
                });
                gridPane.add(circleButton, col, row);
            }
        }
        return gridPane;
    }
    public HBox hBox() {
        HBox hbox = new HBox();
        Button xsquared = new Button("x^2");
        Button sqrt = new Button("Sqrt");
        Button clear = new Button("Clear");


        clear.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                txt.clear();
            }
        });

        sqrt.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                txt.setText(String.valueOf(Math.sqrt(Double.parseDouble(txt.getText()))));
            }
        });
        xsquared.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                txt.setText(String.valueOf(Math.pow(Double.parseDouble(txt.getText()),2.0)));

            }
        });
        hbox.getChildren().add(xsquared);
        hbox.getChildren().add(sqrt);
        hbox.getChildren().add(clear);
        return hbox;
    }
}
