package GUI;

import doprava.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.*;
import java.util.Arrays;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1028, 400));
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args);
        String fileName="Prostredky1.txt";
        ArrayList<AbsProstredek> em = new ArrayList<>();
        ArrayList<AbsProstredek> emNew = new ArrayList<>();
        em.add(new Letadlo("airbus",5000,4,2000,200000));
        em.add(new Auto("Skoda octavia", 102, 5,0.2f,8));
        em.add(new Ponorka("Takovata co meli beetles", 500, 9,1,4));
        //serialize to file
        try {
            SerializationUtil.serialize(em, fileName);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        //deserialize from file
        try {
            emNew = SerializationUtil.deserialize(fileName);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        System.out.println("emp Object::"+em.get(0));
        System.out.println("emp Object::"+em.get(1));
        System.out.println("empNew Object::"+emNew.get(0));
        System.out.println("empNew Object::"+emNew.get(1));

    }

}


