module hellogluon {
    requires glisten.afterburner;
    requires javafx.fxml;
    requires javafx.controls;
    requires com.gluonhq.attach.display;
    requires com.gluonhq.attach.storage;
    requires com.gluonhq.attach.util;
    requires com.gluonhq.charm.glisten;

    opens com.gluonhq.hello.views to javafx.fxml;
    exports com.gluonhq.hello;
}