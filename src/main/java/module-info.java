module com.hmps.hmps {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.hmps.hmps.general to javafx.fxml, javafx.graphics, javafx.base;
    opens com.hmps.hmps.dtos to javafx.base;
    opens com.hmps.hmps.hardcodedtypes to javafx.base;
    opens com.hmps.hmps.system to javafx.base;
    exports com.hmps.hmps.general;
}