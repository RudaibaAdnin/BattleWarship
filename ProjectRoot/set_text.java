/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pkg0_battlewarship;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author Asus
 */
public class set_text {

    Group group1;

    set_text(Group group1) {

        this.group1 = group1;
    }

    void set_text_player1() {
        Text t = new Text(300, 25, "First place the seven ships");

        t.setFont(Font.font("Verdana", 15));
        t.setFill(Color.BLUE);
        //group1.getChildren().add(t);

        Text t1 = new Text(150, 25, "PLAYER");

        t1.setFont(Font.font("Verdana", 20));
        t1.setFill(Color.BLUE);
        group1.getChildren().add(t1);

        Text t2 = new Text(850, 25, "OPPONENT");

        t2.setFont(Font.font("Verdana", 20));
        t2.setFill(Color.BLUE);
        group1.getChildren().add(t2);

        Text t3 = new Text(600, 25, "BATTLE WARSHIP");

        t3.setFont(Font.font("Verdana", 25));
        t3.setFill(Color.BROWN);
        group1.getChildren().add(t3);

        for (int i = 1; i < 12; i++) {

            Text text = new Text(115 + 50 * i, 45, "");
            int mat = i - 1;
            text.setText("" + mat);
            text.setFont(Font.font("Verdana", 15));
            text.setFill(Color.PURPLE);
            group1.getChildren().add(text);
        }
        for (int i = 1; i < 12; i++) {

            Text text2 = new Text(122, 25 + 50 * i, "");
            int mat2 = i - 1;
            text2.setText("" + mat2);
            text2.setFont(Font.font("Verdana", 15));
            text2.setFill(Color.PURPLE);
            group1.getChildren().add(text2);

        }
        for (int i = 1; i < 12; i++) {

            Text text2 = new Text(715 + 50 * i, 45, "");
            int mat3 = i - 1;
            text2.setText("" + mat3);
            text2.setFont(Font.font("Verdana", 15));
            text2.setFill(Color.PURPLE);
            group1.getChildren().add(text2);
        }
        for (int i = 1; i < 12; i++) {

            Text text3 = new Text(722, 25 + 50 * i, "");
            int mat4 = i - 1;
            text3.setText("" + mat4);
            text3.setFont(Font.font("Verdana", 15));
            text3.setFill(Color.PURPLE);
            group1.getChildren().add(text3);

        }

        Text text4 = new Text(25, 650, "SHIPS");

        text4.setFont(Font.font("Verdana", 25));
        text4.setFill(Color.PURPLE);
        group1.getChildren().add(text4);

    }

}
