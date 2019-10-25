package GUI;


import doprava.* ;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;
import javafx.scene.control.Label;

    public class Controller {
        @FXML
        private Label souradniceX;
        @FXML
        private Label souradniceY;
        @FXML
        private Label souradniceZ;
        @FXML
        private Label rychlostX;
        @FXML
        private Label rychlostY;
        @FXML
        private Label rychlostZ;
        @FXML
        private Button submitButton;
        @FXML
        protected void handleSubmitButtonAction(ActionEvent event) {

        souradniceX.setText("SouradniceX:",++);
        souradniceX.setText("SouradniceY:",+něco co nevím jak naimportovat);
        souradniceX.setText("SouradniceZ:",+něco co nevím jak naimportovat);
        souradniceX.setText("rychlostX:",+něco co nevím jak naimportovat);
        souradniceX.setText("rychlostY:",+něco co nevím jak naimportovat);
        souradniceX.setText("rychlostZ:",+něco co nevím jak naimportovat);

            if(nameField.getText().isEmpty()) {
                AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                        "Please enter your name");

            }
        }

    }
    }
