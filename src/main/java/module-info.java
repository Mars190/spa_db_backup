module com.example.spa_db_backup {
	requires javafx.controls;
	requires javafx.fxml;

	requires net.synedra.validatorfx;

	opens com.example.spa_db_backup to javafx.fxml;
	exports com.example.spa_db_backup;
}