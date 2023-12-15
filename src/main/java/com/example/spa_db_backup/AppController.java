package com.example.spa_db_backup;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AppController {
	@FXML
	public Label leftLabel;
	@FXML
	public TextField pathForSave;
	@FXML
	public TextField db_address;
	@FXML
	public TextField db_username;
	@FXML
	public TextField db_password;
	@FXML
	public Label middleLabel;
	@FXML
	public ListView<String> backup_history;
	@FXML
	public Label rightLabel;
	@FXML
	public Text file_size;
	@FXML
	public Text created_at;
	@FXML
	public Label leftStatus;
	@FXML
	public Label rightStatus;

	@FXML
	protected void onTestConnectButtonClick(ActionEvent actionEvent) {}
	@FXML
	public void onSaveButtonClick(ActionEvent actionEvent) {}
	@FXML
	public void onCreateBackUpClick(ActionEvent actionEvent) {}
	@FXML
	public void onRestoreBackUpClick(ActionEvent actionEvent) {}
	@FXML
	public void onDeleteBackUpClick(ActionEvent actionEvent) {}
}