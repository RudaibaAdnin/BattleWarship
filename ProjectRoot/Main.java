/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pkg0_battlewarship;

import java.util.Random;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Main extends Application {

    Circle c;
    int count = 0, right;
    int rect_x, rect_y;
    int p, q;
    int l = 0;

    Group design = new Group();
    Group group2 = new Group();
    Group group1 = new Group();
    int turn = 1;
    int flag = 0;

    double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, rect_x1, rect_y1;
    int key1 = 1;
    int key2 = 1;
    int key3 = 1;
    int key4 = 1;
    int key5 = 1;
    int n = 11;
    int placement1 = 0;
    int placement2 = 0;
    int placement3 = 0;
    int placement4 = 0;
    int placement5 = 0;
    int number = 0;

    Stage window;
    double x;
    double y;
    int[][] matrix1 = new int[n][n];
    int[][] matrix2 = new int[n][n];
    int[][] rectangle, rectangle2;

    Scene scene1;
    Scene scene2;
    Scene scene3;

    @Override
    public void start(Stage primaryStage) {

        Text t = new Text();
        t.setX(250.0f);
        t.setY(01.0f);
        t.setCache(true);
        t.setText("BATTLE WARSHIP");
        t.setFill(Color.BLUE);
        t.setFont(Font.font("Arial", FontWeight.BOLD, 100));
//t.setFont(Font.font("Verdana", FontPosture.ITALIC, 100));

        Reflection r = new Reflection();
        r.setFraction(0.7f);

        t.setEffect(r);

        t.setTranslateY(400);
        group2.getChildren().add(t);

        DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 0.4f));

        Text th1 = new Text();
        th1.setEffect(ds);
        th1.setCache(true);
        th1.setX(600.0f);
        th1.setY(560.0f);
        th1.setFill(Color.BLACK);
        th1.setText("MENU");
        th1.setFont(Font.font(null, FontWeight.BOLD, 50));
        group2.getChildren().add(th1);

        Text t4 = new Text(1100, 635, "HIT");

        t4.setFont(Font.font("Verdana", 15));
        t4.setFill(Color.BROWN);
        design.getChildren().add(t4);

        Text t5 = new Text(1100, 670, "MISS");

        t5.setFont(Font.font("Verdana", 15));
        t5.setFill(Color.BROWN);
        design.getChildren().add(t5);
        Circle demo = new Circle(1170, 670, 11);
        demo.setFill(Color.BLUE);
        design.getChildren().add(demo);
        Line line3 = new Line(1150, 640, 1170, 620);
        Line line4 = new Line(1150, 620, 1170, 640);
        line3.setStroke(Color.BLUE);
        line4.setStroke(Color.BLUE);
        design.getChildren().add(line3);
        design.getChildren().add(line4);

        Text th3 = new Text(550, 650, "");
        th3.setText("FIRST PLACE THE SHIPS");
        th3.setFont(Font.font("Verdana", 20));
        th3.setFill(Color.VIOLET);
        design.getChildren().add(th3);
        Text th4 = new Text(550, 670, "");
        th4.setText("use keyboard to rotate the ships");
        th4.setFont(Font.font("Verdana", 20));
        th4.setFill(Color.VIOLET);
        design.getChildren().add(th4);

        matrix_initial_value_for_player1 matrix_ob_player1 = new matrix_initial_value_for_player1(matrix1);
        matrix_ob_player1.initial_value_for_player1();

        matrix_initial_value_for_player2 matrix_ob_player2 = new matrix_initial_value_for_player2(matrix2);
        matrix_ob_player2.initial_value_for_player2();

        draw_grid_for_player1 ob = new draw_grid_for_player1(matrix1, design);
        ob.drawing_grid_for_player1();

        set_text ob_set_text = new set_text(design);
        ob_set_text.set_text_player1();

        /*for(int i=0;i<11;i++)
       {  
           
           for(int j=0;j<11;j++)
           {
               System.out.print(rectangle1[i][j]);
               
           }
            System.out.println(" ");
               
       } */
        draw_grid_for_player2 ob_2 = new draw_grid_for_player2(matrix2, design);
        ob_2.drawing_grid_for_player2();
        rectangle2 = matrix2;

        // Scene scene=new Scene(group1,1400,700);
        // Scene scene=new Scene(group2,1000,700);
        // Stage window;
        //scene3=new Scene(group2,1400,800);
        window = primaryStage;

        //Button 1
        Text t1 = new Text(200, 100, "Battle Warship");

        t1.setFont(Font.font("Verdana", 30));
        t1.setFill(Color.BLUE);
        // group2.getChildren().add(t1);

        Button btn = new Button();
        btn.setText("START");

        //Pane root = new Pane();
        btn.setLayoutX(600);
        btn.setLayoutY(620);
        btn.setStyle("-fx-background-color: yellow; -fx-text-fill: black;");

        btn.setMinWidth(80);
        btn.setMinHeight(60);
        group2.getChildren().addAll(btn);
        btn.setOnAction(e -> window.setScene(scene2));
        scene1 = new Scene(group2, 1400, 800, Color.LIGHTBLUE);

        //Button 2
        Button button2 = new Button("Click to quit");
        button2.setLayoutX(1220);
        button2.setLayoutY(620);

        button2.setMinWidth(80);
        button2.setMinHeight(50);
        button2.setStyle("-fx-background-color: lightblue; -fx-text-fill: black;");

        button2.setOnAction(e -> window.setScene(scene1));
        Button button3 = new Button("Click");

        design.getChildren().add(button2);
        scene3 = new Scene(group1, 1400, 700, Color.LIGHTBLUE);
        scene2 = new Scene(design, 1400, 700);

        //scene3=new Scene(group2,1400,700);
        //Display scene 1 at first
        window.setScene(scene1);
        /* if(count==15)
        {
            window.setScene(scene3);
        }*/
        // window.setTitle("Title Here");
        window.show();

        // primaryStage.setScene(scene);
        //  primaryStage.setScene(scene2);
        Rectangle rect1 = new Rectangle(85, 100, 50, 50);
        Rectangle rect3 = new Rectangle(85, 400, 50, 150);
        Rectangle rect4 = new Rectangle(20, 100, 50, 200);
        Rectangle rect2 = new Rectangle(85, 200, 50, 100);
        Rectangle rect5 = new Rectangle(20, 350, 50, 250);
        rect1.setFill(Color.RED);
        rect1.setStroke(Color.BLACK);

        rect1.setOnMouseDragged(me -> {
            x1 = me.getSceneX();
            y1 = me.getSceneY();
            rect1.setX(x1);
            rect1.setY(y1);

        });
        // Rectangle rect2=new Rectangle(100,200,50,100);
        rect2.setFill(Color.RED);
        rect2.setStroke(Color.BLACK);

        rect2.setOnMouseDragged(me -> {
            x2 = me.getSceneX();
            y2 = me.getSceneY();
            rect2.setX(x2);
            rect2.setY(y2);

            scene2.setOnKeyPressed((KeyEvent event) -> {

                switch (event.getCode()) {

                    case UP:

                        if (key2 == 2) {
                            rect2.getTransforms().add(new Rotate(90, x2, y2));
                            key2 = 3;
                            placement2 = 1;

                        }
                        break;

                    case DOWN:
                        if (key2 == 4) {
                            rect2.getTransforms().add(new Rotate(90, x2, y2));
                            placement2 = 2;
                            key2 = 1;

                        }
                        break;

                    case RIGHT:

                        if (key2 == 3) {
                            rect2.getTransforms().add(new Rotate(90, x2, y2));
                            placement2 = 3;
                            key2 = 4;
                        }

                        break;

                    case LEFT:
                        if (key2 == 1) {
                            rect2.getTransforms().add(new Rotate(90, x2, y2));
                            placement2 = 4;
                            key2 = 2;

                        }
                        break;

                }

            });
        });
        // Rectangle rect3=new Rectangle(100,400,50,150);
        rect3.setFill(Color.RED);
        rect3.setStroke(Color.BLACK);

        rect3.setOnMouseDragged(me -> {
            x3 = me.getSceneX();
            y3 = me.getSceneY();
            rect3.setX(x3);
            rect3.setY(y3);

            scene2.setOnKeyPressed((KeyEvent event) -> {

                switch (event.getCode()) {

                    case UP:

                        if (key3 == 2) {
                            rect3.getTransforms().add(new Rotate(90, x3, y3));
                            key3 = 3;
                            placement3 = 1;

                        }
                        break;

                    case DOWN:
                        if (key3 == 4) {
                            rect3.getTransforms().add(new Rotate(90, x3, y3));
                            placement3 = 2;
                            key3 = 1;

                        }
                        break;

                    case RIGHT:

                        if (key3 == 3) {
                            rect3.getTransforms().add(new Rotate(90, x3, y3));
                            placement3 = 3;
                            key3 = 4;
                        }

                        break;

                    case LEFT:
                        if (key3 == 1) {
                            rect3.getTransforms().add(new Rotate(90, x3, y3));
                            placement3 = 4;

                            key3 = 2;

                        }
                        break;

                }

            });
        });

        // Rectangle rect4=new Rectangle(100,400,50,200);
        rect4.setFill(Color.RED);
        rect4.setStroke(Color.BLACK);

        rect4.setOnMouseDragged(me -> {
            x4 = me.getSceneX();
            y4 = me.getSceneY();
            rect4.setX(x4);
            rect4.setY(y4);

            scene2.setOnKeyPressed((KeyEvent event) -> {

                switch (event.getCode()) {

                    case UP:

                        if (key4 == 2) {
                            rect4.getTransforms().add(new Rotate(90, x4, y4));
                            key4 = 3;
                            placement4 = 1;

                        }
                        break;

                    case DOWN:
                        if (key4 == 4) {
                            rect4.getTransforms().add(new Rotate(90, x4, y4));
                            placement4 = 2;
                            key4 = 1;

                        }
                        break;

                    case RIGHT:

                        if (key4 == 3) {
                            rect4.getTransforms().add(new Rotate(90, x4, y4));
                            placement4 = 3;
                            key4 = 4;
                        }

                        break;

                    case LEFT:
                        if (key4 == 1) {
                            rect4.getTransforms().add(new Rotate(90, x4, y4));
                            placement4 = 4;
                            key4 = 2;

                        }
                        break;

                }

            });
        });

        // Rectangle rect5=new Rectangle(100,400,50,250);
        rect5.setFill(Color.RED);
        rect5.setStroke(Color.BLACK);

        rect5.setOnMouseDragged(me -> {
            x5 = me.getSceneX();
            y5 = me.getSceneY();
            rect5.setX(x5);
            rect5.setY(y5);

            scene2.setOnKeyPressed((KeyEvent event) -> {

                switch (event.getCode()) {

                    case UP:

                        if (key5 == 2) {
                            rect5.getTransforms().add(new Rotate(90, x5, y5));
                            key5 = 3;
                            placement5 = 1;

                        }
                        break;

                    case DOWN:
                        if (key5 == 4) {
                            rect5.getTransforms().add(new Rotate(90, x5, y5));
                            placement5 = 2;
                            key5 = 1;

                        }
                        break;

                    case RIGHT:

                        if (key5 == 3) {
                            rect5.getTransforms().add(new Rotate(90, x5, y5));
                            placement5 = 3;
                            key5 = 4;
                        }

                        break;

                    case LEFT:
                        if (key5 == 1) {
                            rect5.getTransforms().add(new Rotate(90, x5, y5));
                            placement5 = 4;
                            key5 = 2;

                        }
                        break;

                }

            });
        });

        Button button = new Button("Activate ships");
        button.setLayoutX(30);
        button.setLayoutY(15);
        button.setStyle("-fx-background-color: lightblue; -fx-text-fill: black;");

        button.setMinWidth(80);
        button.setMinHeight(50);
        button.setOnAction(evt -> {

            scene2.setOnKeyPressed(null);
            rect1.setOnMouseDragged(null);
            rect2.setOnMouseDragged(null);
            rect3.setOnMouseDragged(null);
            rect4.setOnMouseDragged(null);
            rect5.setOnMouseDragged(null);

            flag = 1;
            if (flag == 1) {
                Text turn_3 = new Text(900, 650, "");
                turn_3.setText("YOUR TURN");
                turn_3.setFont(Font.font("Verdana", 20));
                turn_3.setFill(Color.BLUE);
                design.getChildren().add(turn_3);
                Rectangle rect01 = new Rectangle(550, 630, 350, 100);
                rect01.setFill(Color.WHITE);
                // rect01.setStroke(Color.BLACK);
                design.getChildren().add(rect01);

            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((x1 > 100 + 48 + 50 * i && x1 < 100 + 20 + 50 + 50 * i) && (y1 > 47 + 50 * j && y1 < 20 + 50 + 50 * j)) //down
                    {

                        matrix1[i][j] = 2;
                        number++;
                        drawrect();
                        //drawrect3();
                    }

                    if ((x2 > 100 + 48 + 50 * i && x2 < 100 + 20 + 50 + 50 * i) && (y2 > 47 + 50 * j && y2 < 20 + 50 + 50 * j) && (placement2 == 2 || placement2 == 0)) //down
                    {

                        matrix1[i][j] = 2;
                        matrix1[i][j + 1] = 2;
                        number++;
                        drawrect();
                        //drawrect3();
                    }

                    if ((x2 > 100 + 48 + 50 * i && x2 < 100 + 20 + 50 + 50 * i) && (y2 > 47 + 50 * j && y2 < 20 + 50 + 50 * j) && placement2 == 3)//right 
                    {

                        matrix1[i][j - 1] = 2;
                        matrix1[i + 1][j - 1] = 2;
                        number++;
                        drawrect();
                        //  drawrect3();
                    }

                    if ((x2 > 100 + 48 + 50 * i && x2 < 100 + 20 + 50 + 50 * i) && (y2 > 47 + 50 * j && y2 < 20 + 50 + 50 * j) && placement2 == 1) //up
                    {

                        matrix1[i - 1][j - 1] = 2;
                        matrix1[i - 1][j - 2] = 2;
                        drawrect();
                        number++;
                        //  drawrect3();
                    }

                    if ((x2 > 100 + 48 + 50 * i && x2 < 100 + 20 + 50 + 50 * i) && (y2 > 47 + 50 * j && y2 < 20 + 50 + 50 * j) && placement2 == 4)//left
                    {

                        matrix1[i - 1][j] = 2;
                        matrix1[i - 2][j] = 2;
                        number++;
                        drawrect();
                        // drawrect3();
                    }
                    if ((x3 > 100 + 48 + 50 * i && x3 < 100 + 20 + 50 + 50 * i) && (y3 > 47 + 50 * j && y3 < 20 + 50 + 50 * j) && (placement3 == 2 || placement3 == 0)) //down
                    {

                        matrix1[i][j] = 2;
                        matrix1[i][j + 1] = 2;
                        matrix1[i][j + 2] = 2;
                        //  System.out.println("Grid "+i+ " "+j);
                        drawrect();
                        number++;
                        //drawrect3();
                    }

                    if ((x3 > 100 + 48 + 50 * i && x3 < 100 + 20 + 50 + 50 * i) && (y3 > 47 + 50 * j && y3 < 20 + 50 + 50 * j) && placement3 == 3)//right 
                    {

                        matrix1[i][j - 1] = 2;
                        matrix1[i + 1][j - 1] = 2;
                        matrix1[i + 2][j - 1] = 2;
                        number++;
                        drawrect();
                        //  drawrect3();
                    }

                    if ((x3 > 100 + 48 + 50 * i && x3 < 100 + 20 + 50 + 50 * i) && (y3 > 47 + 50 * j && y3 < 20 + 50 + 50 * j) && placement3 == 1) //up
                    {

                        matrix1[i - 1][j - 1] = 2;
                        matrix1[i - 1][j - 2] = 2;
                        matrix1[i - 1][j - 3] = 2;
                        number++;
                        drawrect();
                        //  drawrect3();
                    }

                    if ((x3 > 100 + 48 + 50 * i && x3 < 100 + 20 + 50 + 50 * i) && (y3 > 47 + 50 * j && y3 < 20 + 50 + 50 * j) && placement3 == 4)//left
                    {

                        matrix1[i - 1][j] = 2;
                        matrix1[i - 2][j] = 2;
                        matrix1[i - 3][j] = 2;
                        drawrect();
                        // drawrect3();
                    }
                    if ((x4 > 100 + 48 + 50 * i && x4 < 100 + 20 + 50 + 50 * i) && (y4 > 47 + 50 * j && y4 < 20 + 50 + 50 * j) && (placement4 == 2 || placement4 == 0)) //down
                    {

                        matrix1[i][j] = 2;
                        matrix1[i][j + 1] = 2;
                        matrix1[i][j + 2] = 2;
                        matrix1[i][j + 3] = 2;
                        number++;
                        //  System.out.println("Grid "+i+ " "+j);
                        drawrect();
                        //drawrect3();
                    }

                    if ((x4 > 100 + 48 + 50 * i && x4 < 100 + 20 + 50 + 50 * i) && (y4 > 47 + 50 * j && y4 < 20 + 50 + 50 * j) && placement4 == 3)//right 
                    {

                        matrix1[i][j - 1] = 2;
                        matrix1[i + 1][j - 1] = 2;
                        matrix1[i + 2][j - 1] = 2;
                        matrix1[i + 3][j - 1] = 2;
                        number++;
                        drawrect();
                        //  drawrect3();
                    }

                    if ((x4 > 100 + 48 + 50 * i && x4 < 100 + 20 + 50 + 50 * i) && (y4 > 47 + 50 * j && y4 < 20 + 50 + 50 * j) && placement4 == 1) //up
                    {

                        matrix1[i - 1][j - 1] = 2;
                        matrix1[i - 1][j - 2] = 2;
                        matrix1[i - 1][j - 3] = 2;
                        matrix1[i - 1][j - 4] = 2;
                        number++;
                        drawrect();
                        //  drawrect3();
                    }

                    if ((x4 > 100 + 48 + 50 * i && x4 < 100 + 20 + 50 + 50 * i) && (y4 > 47 + 50 * j && y4 < 20 + 50 + 50 * j) && placement4 == 4) //left
                    {

                        matrix1[i - 1][j] = 2;
                        matrix1[i - 2][j] = 2;
                        matrix1[i - 3][j] = 2;
                        matrix1[i - 4][j] = 2;
                        number++;
                        drawrect();
                        // drawrect3();
                    }

                    if ((x5 > 100 + 48 + 50 * i && x5 < 100 + 20 + 50 + 50 * i) && (y5 > 47 + 50 * j && y5 < 20 + 50 + 50 * j) && (placement5 == 2 || placement5 == 0)) //down
                    {

                        matrix1[i][j] = 2;
                        matrix1[i][j + 1] = 2;
                        matrix1[i][j + 2] = 2;
                        matrix1[i][j + 3] = 2;
                        matrix1[i][j + 4] = 2;
                        //  System.out.println("Grid "+i+ " "+j);
                        drawrect();
                        number++;
                        //drawrect3();
                    }

                    if ((x5 > 100 + 48 + 50 * i && x5 < 100 + 20 + 50 + 50 * i) && (y5 > 47 + 50 * j && y5 < 20 + 50 + 50 * j) && placement5 == 3)//right 
                    {

                        matrix1[i][j - 1] = 2;
                        matrix1[i + 1][j - 1] = 2;
                        matrix1[i + 2][j - 1] = 2;
                        matrix1[i + 3][j - 1] = 2;
                        matrix1[i + 4][j - 1] = 2;
                        number++;
                        drawrect();
                        //  drawrect3();
                    }

                    if ((x5 > 100 + 48 + 50 * i && x5 < 100 + 20 + 50 + 50 * i) && (y5 > 47 + 50 * j && y5 < 20 + 50 + 50 * j) && placement5 == 1) //up
                    {

                        matrix1[i - 1][j - 1] = 2;
                        matrix1[i - 1][j - 2] = 2;
                        matrix1[i - 1][j - 3] = 2;
                        matrix1[i - 1][j - 4] = 2;
                        matrix1[i - 1][j - 5] = 2;
                        number++;
                        drawrect();
                        //  drawrect3();
                    }

                    if ((x5 > 100 + 48 + 50 * i && x5 < 100 + 20 + 50 + 50 * i) && (y5 > 47 + 50 * j && y5 < 20 + 50 + 50 * j) && placement5 == 4) //left
                    {

                        matrix1[i - 1][j] = 2;
                        matrix1[i - 2][j] = 2;
                        matrix1[i - 3][j] = 2;
                        matrix1[i - 4][j] = 2;
                        matrix1[i - 5][j] = 2;
                        number++;
                        drawrect();
                        // drawrect3();
                    }

                }
            }
            if (number == 5) {
                System.out.println("perfectly placed ships");
                Text turn_7 = new Text(10, 300, "");
                turn_7.setText("Ships are"
                        + " placed");
                turn_7.setFont(Font.font("Verdana", 15));
                turn_7.setFill(Color.BROWN);
                design.getChildren().add(turn_7);
                Text turn_8 = new Text(20, 330, "");
                turn_8.setText(" perfectly");
                turn_8.setFont(Font.font("Verdana", 15));
                turn_8.setFill(Color.BROWN);
                design.getChildren().add(turn_8);

            } else {
                System.out.println("Ships are not placed perfectly");
                Text turn_6 = new Text(10, 300, "");
                turn_6.setText("Ships are not");
                turn_6.setFont(Font.font("Verdana", 15));
                turn_6.setFill(Color.BROWN);
                design.getChildren().add(turn_6);
                Text turn_9 = new Text(10, 330, "");
                turn_9.setText("placed perfectly");
                turn_9.setFont(Font.font("Verdana", 15));
                turn_9.setFill(Color.BROWN);
                design.getChildren().add(turn_9);

            }

        });

        scene2.setOnMouseClicked((MouseEvent event) -> {

            x = event.getX();
            y = event.getY();
            System.out.println("(X,Y)=" + x + y);

            condition_check_when_mouse_clicked();
            circle_draw1 ob_circle_draw1 = new circle_draw1(matrix1, design);
            ob_circle_draw1.circle_draw_for_player1();

            circle_draw2 ob_circle_draw2 = new circle_draw2(matrix2, design);
            ob_circle_draw2.circle_draw_for_player2();
            if (turn == 1 && flag == 1) {
                Rectangle rect = new Rectangle(400, 610, 150, 50);
                rect.setFill(Color.WHITE);
                //rect.setStroke(Color.BLACK);
                design.getChildren().add(rect);
                Text turn_2 = new Text(900, 650, "");
                turn_2.setText("YOUR TURN");
                turn_2.setFont(Font.font("Verdana", 20));
                turn_2.setFill(Color.BLUE);
                design.getChildren().add(turn_2);

            }
            if (turn == 2) {

                Rectangle rect0 = new Rectangle(900, 610, 150, 50);
                rect0.setFill(Color.WHITE);
                //rect.setStroke(Color.BLACK);
                design.getChildren().add(rect0);
                Text turn_1 = new Text(400, 650, "");
                turn_1.setText("YOUR TURN");
                turn_1.setFont(Font.font("Verdana", 20));
                turn_1.setFill(Color.BLUE);
                design.getChildren().add(turn_1);
            }

        });
        design.getChildren().addAll(button, rect1, rect2, rect3, rect4, rect5);

        // primaryStage.show();
    }

    public void drawrect() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix1[i][j] == 2) {
                    Rectangle rect = new Rectangle(150 + 50 * i, 50 + 50 * j, 50, 50);
                    rect.setFill(Color.RED);
                    rect.setStroke(Color.BLACK);
                    design.getChildren().addAll(rect);
                }
            }
        }
    }

    public void condition_check_when_mouse_clicked() {

        int k = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {

                if ((x > 50 + 700 + 50 * i && x < 50 + 700 + 50 + 50 * i) && (y > 50 + 50 * j && y < 50 + 50 + 50 * j)
                        && matrix2[i][j] == 1 && turn == 1) {

                    matrix2[i][j] = 3;//cross
                    count++;
                    // turn=2;
                    if (count >= 15) {
                        System.out.println("YOU WIN");

                        Text t = new Text(550, 350, "YOU WIN");

                        t.setFont(Font.font("Verdana", 60));
                        t.setFill(Color.BLUE);
                        group1.getChildren().add(t);
                        window.setScene(scene3);
                    }

                }
                if ((x > 50 + 700 + 50 * i && x < 50 + 700 + 50 + 50 * i) && (y > 50 + 50 * j && y < 50 + 50 + 50 * j)
                        && matrix2[i][j] == 0 && turn == 1) {

                    matrix2[i][j] = 2;//cross
                    turn = 2;

                }

                if ((x > 150 + 50 * i && x < 150 + 50 + 50 * i) && (y > 50 + 50 * j && y < 100 + 50 * j) && matrix1[i][j] == 1 && turn == 2) {
                    Random rand = new Random();
                    System.out.println("(X,Y)=" + x + y);
                    rect_x = rand.nextInt(500);
                    rect_y = rand.nextInt(500);

                    System.out.println(rect_x);
                    p = rect_x % n;
                    q = rect_y % n;

                    if (matrix1[p][q] == 1) {
                        matrix1[p][q] = 3;//circle
                        turn = 1;

                    }
                    if (matrix1[p][q] == 2) {
                        matrix1[p][q] = 4;//cross

                    }

                }

            }

        }
    }

    public static void main(String[] args) {
        launch(args);
    }

};
