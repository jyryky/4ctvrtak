package GUI;


import doprava.AbsProstredek;
import doprava.Letadlo;
import doprava.Vyrobna;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;




public class Controller {
    @FXML
    public Label LetadloRychlostX;
    @FXML
    public Label LetadloRychlostY;
    @FXML
    public Label LetadloRychlostZ;
    @FXML
    public Button LetadloRight;
    @FXML
    public Button LetadloLeft;
    @FXML
    public Button LetadloUP;
    @FXML
    public Button LetadloDown;
    @FXML
    public Button LetadloFW;
    @FXML
    public Button LetadloBW;
    @FXML
    public Label LetadloPoziceZ;
    @FXML
    public Label LetadloPoziceY;
    @FXML
    public Label LetadloPoziceX;
    AbsProstredek letadlo = new Letadlo("Letadloslav", 40.0f, 6, 60, 0.5f);
    @FXML
    private void LetadloRight(){
        letadlo.akcelerujDoprava(1.0f);
        letadlo.akcelerujNahoru(0.0f);
        letadlo.akcelerujDozadu(0.0f);
        LetadloRychlostX.setText(String.valueOf(letadlo.vypisStatus()[0]));
        LetadloPoziceX.setText(String.valueOf(letadlo.vypisStatus()[3]));
        LetadloRychlostY.setText(String.valueOf(letadlo.vypisStatus()[1]));
        LetadloPoziceY.setText(String.valueOf(letadlo.vypisStatus()[4]));
        LetadloRychlostX.setText(String.valueOf(letadlo.vypisStatus()[0]));
        LetadloPoziceX.setText(String.valueOf(letadlo.vypisStatus()[3]));
    }
    @FXML
    private void LetadloLeft(){
        letadlo.akcelerujDoleva(1.0f);
        letadlo.akcelerujNahoru(0.0f);
        letadlo.akcelerujDozadu(0.0f);
        LetadloRychlostX.setText(String.valueOf(letadlo.vypisStatus()[0]));
        LetadloPoziceX.setText(String.valueOf(letadlo.vypisStatus()[3]));
        LetadloRychlostY.setText(String.valueOf(letadlo.vypisStatus()[1]));
        LetadloPoziceY.setText(String.valueOf(letadlo.vypisStatus()[4]));
        LetadloRychlostX.setText(String.valueOf(letadlo.vypisStatus()[0]));
        LetadloPoziceX.setText(String.valueOf(letadlo.vypisStatus()[3]));
    }
    @FXML
    private void LetadloUP(){
        letadlo.akcelerujNahoru(1.0f);
        letadlo.akcelerujDozadu(0.0f);
        letadlo.akcelerujDoleva(0.0f);
        LetadloRychlostZ.setText(String.valueOf(letadlo.vypisStatus()[2]));
        LetadloPoziceZ.setText(String.valueOf(letadlo.vypisStatus()[5]));
        LetadloRychlostX.setText(String.valueOf(letadlo.vypisStatus()[0]));
        LetadloPoziceX.setText(String.valueOf(letadlo.vypisStatus()[3]));
        LetadloRychlostY.setText(String.valueOf(letadlo.vypisStatus()[1]));
        LetadloPoziceY.setText(String.valueOf(letadlo.vypisStatus()[4]));
    }
    @FXML
    private void LetadloDown(){
        letadlo.akcelerujDolu(1.0f);
        letadlo.akcelerujDozadu(0.0f);
        letadlo.akcelerujDoleva(0.0f);
        LetadloRychlostZ.setText(String.valueOf(letadlo.vypisStatus()[2]));
        LetadloPoziceZ.setText(String.valueOf(letadlo.vypisStatus()[5]));
        LetadloRychlostX.setText(String.valueOf(letadlo.vypisStatus()[0]));
        LetadloPoziceX.setText(String.valueOf(letadlo.vypisStatus()[3]));
        LetadloRychlostY.setText(String.valueOf(letadlo.vypisStatus()[1]));
        LetadloPoziceY.setText(String.valueOf(letadlo.vypisStatus()[4]));
    }
    @FXML
    private void LetadloFW(){
        letadlo.akcelerujDopredu(1.0f);
        letadlo.akcelerujNahoru(0.0f);
        letadlo.akcelerujDoleva(0.0f);
        LetadloRychlostY.setText(String.valueOf(letadlo.vypisStatus()[1]));
        LetadloPoziceY.setText(String.valueOf(letadlo.vypisStatus()[4]));
        LetadloRychlostZ.setText(String.valueOf(letadlo.vypisStatus()[2]));
        LetadloPoziceZ.setText(String.valueOf(letadlo.vypisStatus()[5]));
        LetadloRychlostX.setText(String.valueOf(letadlo.vypisStatus()[0]));
        LetadloPoziceX.setText(String.valueOf(letadlo.vypisStatus()[3]));
    }
    @FXML
    private void LetadloBW(){
        letadlo.akcelerujDozadu(1.0f);
        letadlo.akcelerujNahoru(0.0f);
        letadlo.akcelerujDoleva(0.0f);
        LetadloRychlostY.setText(String.valueOf(letadlo.vypisStatus()[1]));
        LetadloPoziceY.setText(String.valueOf(letadlo.vypisStatus()[4]));
        LetadloRychlostZ.setText(String.valueOf(letadlo.vypisStatus()[2]));
        LetadloPoziceZ.setText(String.valueOf(letadlo.vypisStatus()[5]));
        LetadloRychlostX.setText(String.valueOf(letadlo.vypisStatus()[0]));
        LetadloPoziceX.setText(String.valueOf(letadlo.vypisStatus()[3]));
    }

}
