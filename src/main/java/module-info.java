module hu.petrik.peoplerestclientjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    exports hu.petrik.peoplerestclientjavafx;
    opens hu.petrik.peoplerestclientjavafx to javafx.fxml,com.google.gson;
}