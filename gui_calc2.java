import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
public class gui_calc2 extends Application{

static int num1, num2;
static String operator;
   
   public void start(Stage s) throws Exception{
      s.setTitle("GUI Calculator");
      GridPane pane = new GridPane();
      Button ad = new Button("+");
      Button sub = new Button("-");
      Button mul = new Button("*");
      Button div = new Button("/");
      Button equal = new Button("=");
      Button b0 = new Button("0");
      Button b1 = new Button("1");
      Button b2 = new Button("2");
      Button b3 = new Button("3");
      Button b4 = new Button("4");
      Button b5 = new Button("5");
      Button b6 = new Button("6");
      Button b7 = new Button("7");
      Button b8 = new Button("8");
      Button b9 = new Button("9");
      Button cl = new Button("C");
      TextField tf = new TextField();
      
     
      
      pane.setPadding(new Insets(50,50,50,50));
      pane.add(tf,0,1);
      pane.add(b0,1,1);
      pane.add(b4,1,2);
      pane.add(b7,1,3);
      pane.add(b1,2,1);
      pane.add(b5,2,2);
      pane.add(b8,2,3);
      pane.add(b2,3,1);
      pane.add(b6,3,2);
      pane.add(b9,3,3);
      pane.add(b3,4,1);
      pane.add(ad,4,2);
      pane.add(sub,4,3);
      pane.add(mul,5,1);
      pane.add(div,5,2);
      pane.add(equal,5,3);
      pane.add(cl,1,6);
           
      Scene sc = new Scene(pane);
      s.setScene(sc);
      s.show();
      
      EventHandler<ActionEvent> e = new EventHandler<ActionEvent>(){
         public void handle(ActionEvent e){
            if (e.getSource() == b0){
               if (tf.getText().isEmpty()){
                  tf.setText("0");
               }
               else {
                  tf.appendText("0");
               }
            }
            else if (e.getSource() == b1) {
               if (tf.getText().isEmpty()){
                  tf.setText("1");
               }
               else {
                  tf.appendText("1");
               }      
            }
            else if (e.getSource() == b2) {
               if (tf.getText().isEmpty()){
                  tf.setText("2");
               }
               else {
                  tf.appendText("2");
               }      
            }
            else if (e.getSource() == b3) {
               if (tf.getText().isEmpty()){
                  tf.setText("3");
               }
               else {
                  tf.appendText("3");
               }      
            }
            else if (e.getSource() == b4){
               if (tf.getText().isEmpty()){
                  tf.setText("4");
               }
               else {
                  tf.appendText("4");
               }      
            }
            else if (e.getSource() == b5) {
               if (tf.getText().isEmpty()){
                  tf.setText("5");
               }
               else {
                  tf.appendText("5");
               }      
            }
            else if (e.getSource() == b6) {
               if (tf.getText().isEmpty()){
                  tf.setText("6");
               }
               else {
                  tf.appendText("6");
               }      
            }
            else if (e.getSource() == b7) {
               if (tf.getText().isEmpty()){
                  tf.setText("7");
               }
               else {
                  tf.appendText("7");
               }      
            }
            else if (e.getSource() == b8) {
               if (tf.getText().isEmpty()){
                  tf.setText("8");
               }
               else {
                  tf.appendText("8");
               }      
            }
            else if (e.getSource() == b9) {
               if (tf.getText().isEmpty()){
                  tf.setText("9");
               }
               else {
                  tf.appendText("9");
               }      
            }
            else if (e.getSource() == cl){
               tf.setText("");
            }
            if (e.getSource() == ad) {
               num1 = Integer.parseInt(tf.getText()); 
               tf.setText("");
               operator = "+";
            }
            if (e.getSource() == sub) {
               num1 = Integer.parseInt(tf.getText()); 
               tf.setText("");
               operator = "-";
            }
            if (e.getSource() == mul) {
               num1 = Integer.parseInt(tf.getText()); 
               tf.setText("");
               operator = "*";
            }
            if (e.getSource() == div) {
               num1 = Integer.parseInt(tf.getText()); 
               tf.setText("");
               operator = "/";
            }
         }

      };
      
      EventHandler<ActionEvent> e1 = new EventHandler<ActionEvent>(){
         public void handle(ActionEvent e){
            if (e.getSource() == equal){
               if (operator == "+"){
                  num2 = Integer.parseInt(tf.getText());
                  tf.setText(Double.toString(num1+num2));
               }
               else if (operator == "-"){
                  num2 = Integer.parseInt(tf.getText());
                  tf.setText(Double.toString(num1-num2));
               }
               else if (operator == "*"){
                  num2 = Integer.parseInt(tf.getText());
                  tf.setText(Double.toString(num1*num2));
               }
               else if (operator == "/"){
                  num2 = Integer.parseInt(tf.getText());
                  tf.setText(Double.toString(num1/num2));
               }
            }
         }
      };
      
      b0.setOnAction(e);
      b1.setOnAction(e);
      b2.setOnAction(e);
      b3.setOnAction(e);
      b4.setOnAction(e);
      b5.setOnAction(e);
      b6.setOnAction(e);
      b7.setOnAction(e);
      b8.setOnAction(e);
      b9.setOnAction(e);
      cl.setOnAction(e);
      ad.setOnAction(e);
      sub.setOnAction(e);
      mul.setOnAction(e);
      div.setOnAction(e);
      equal.setOnAction(e1);      
   }
   
   public static void main (String [] args){
      launch(args);
   }
}