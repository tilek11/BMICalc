package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.io.File;
import java.text.DecimalFormat;

public class Controller {

        @FXML
        private Font x1;

        @FXML
        private Color x2;

        @FXML
        private TextField WeightLabel;

        @FXML
        private TextField HeightLabel;

        @FXML
        private Button CalculateButton;

        @FXML
        private TextField BMIShow;

        @FXML
        private TextField YourBMI;

        @FXML
        private ImageView ImageView;

        @FXML
        private Font x3;

        @FXML
        private Color x4;

        @FXML
        void click(ActionEvent event) {
            double w = Double.parseDouble(WeightLabel.getText());
            double h = Double.parseDouble(HeightLabel.getText());
            System.out.println(w);
            System.out.println(h);
            DecimalFormat df = new DecimalFormat("0.00");

            double bmi = w / (h*h);
            if (bmi < 18.5){
                BMIShow.setText("UnderWeight");
                YourBMI.setText("Your BMI is " + df.format(bmi));
                File a= new File("/img/under.jpg");
                Image i= new Image(a.getPath().toString());
                ImageView.setImage(i);
            }else if(18.5 < bmi  && bmi < 24.9){
                BMIShow.setText("Normal");
                YourBMI.setText("Your BMI is " +df.format(bmi));
                File a= new File("/img/normal.jpg");
                Image i= new Image(a.getPath().toString());
                ImageView.setImage(i);
            }else if (25 < bmi && bmi <29.9){
                BMIShow.setText("OverWeight");
                YourBMI.setText("Your BMI is " + df.format(bmi));
                File a= new File("/img/over.jpg");
                Image i= new Image(a.getPath().toString());
                ImageView.setImage(i);
            }else{
                BMIShow.setText("Obese");
                YourBMI.setText("Your BMI is " + df.format(bmi));
                File a= new File("/img/obese.jpg");
                Image i= new Image(a.getPath().toString());
                ImageView.setImage(i);
            }

        }

    }




