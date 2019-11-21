package GUI;


import doprava.AbsProstredek;
import doprava.Letadlo;
import doprava.Vyrobna;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;


public class Controller {
    private Vyrobna vyrobna = new Vyrobna();
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
    @FXML
    public ChoiceBox<String> LetadloChoiceBox;

    public void updateChoiceBox(){
        LetadloChoiceBox.getItems().clear();
        for (AbsProstredek prostredek:vyrobna.getProstredky()
             ) {
            if(prostredek instanceof Letadlo){
                LetadloChoiceBox.getItems().add(prostredek.getNazevProstredku());
            }
        }
    }

    public void LetadloUP(){
        String value = LetadloChoiceBox.getValue();
        for (AbsProstredek prostredek:vyrobna.getProstredky()){
            if(Objects.equals(prostredek.getNazevProstredku(), value)){
                prostredek.zrychli(0,0,1);
                updateLabels(prostredek);
                break;
            }
        }
    }
    public void LetadloDown(){
        String value = LetadloChoiceBox.getValue();
        for (AbsProstredek prostredek:vyrobna.getProstredky()){
            if(Objects.equals(prostredek.getNazevProstredku(), value)){
                prostredek.zrychli(0,0,-1);
                updateLabels(prostredek);
                break;
            }
        }
    }
    public void LetadloLeft(){
        String value = LetadloChoiceBox.getValue();
        for (AbsProstredek prostredek:vyrobna.getProstredky()){
            if(Objects.equals(prostredek.getNazevProstredku(), value)){
                prostredek.zrychli(0,1,0);
                updateLabels(prostredek);
                break;
            }
        }
    }
    public void LetadloRight(){
        String value = LetadloChoiceBox.getValue();
        for (AbsProstredek prostredek:vyrobna.getProstredky()){
            if(Objects.equals(prostredek.getNazevProstredku(), value)){
                prostredek.zrychli(0,-1,0);
                updateLabels(prostredek);
                break;
            }
        }
    }
    public void LetadloFW(){
        String value = LetadloChoiceBox.getValue();
        for (AbsProstredek prostredek:vyrobna.getProstredky()){
            if(Objects.equals(prostredek.getNazevProstredku(), value)){
                prostredek.zrychli(1,0,0);
                updateLabels(prostredek);
                break;
            }
        }
    }
    public void LetadloBW(){
        String value = LetadloChoiceBox.getValue();
        for (AbsProstredek prostredek:vyrobna.getProstredky()){
            if(Objects.equals(prostredek.getNazevProstredku(), value)){
                prostredek.zrychli(-1,0,0);
                updateLabels(prostredek);
                break;
            }
        }
    }

    private void updateLabels(AbsProstredek letadlo){
        float[] hodnoty=letadlo.vypisStatus();
        LetadloPoziceX.setText(Float.toString(hodnoty[0]));
        LetadloPoziceY.setText(Float.toString(hodnoty[1]));
        LetadloPoziceZ.setText(Float.toString(hodnoty[2]));
        LetadloRychlostX.setText(Float.toString(hodnoty[3]));
        LetadloRychlostY.setText(Float.toString(hodnoty[4]));
        LetadloRychlostZ.setText(Float.toString(hodnoty[5]));
    }

}
