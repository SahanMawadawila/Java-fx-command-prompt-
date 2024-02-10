package com.example.assignment6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;

public class HelloController {
    private CommandExecutionExample commandExecutionExample=new CommandExecutionExample();
    @FXML
    private TextField txtCommand;
    @FXML
    private TextArea txtOutput;
    private String command;

    @FXML
    private Label label1;
    @FXML
    public void runNetwork(ActionEvent event){
        command=txtCommand.getText();
        String[] stringArray=command.split(" ");
        label1.setText("Running Command: "+command+"\n");
        String st=commandExecutionExample.execute(command);
        txtOutput.appendText(st);
    }
    public void closeBtnFn(ActionEvent event){
        System.exit(0);
    }

}