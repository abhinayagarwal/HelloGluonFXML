# HelloGluonFXML
Merging the HelloGluon and HelloFXML from gluon-samples to find a solution to allow View as a top level node 
in fxml for a Mobile Application under JavaFX 11. Essential to be able to use NavigationDrawer.

This uses the HelloGluon MobileApplication, with subdirectories 'views' added under com.gluonhq.hello in both 
source packages and resources, to contain the fxml, properties, css and HelloController.java from HelloFXML as appropriate. 
The HelloGluon.java and build.gradle files have been amended and this project will run as expected 
if I change the hello.fxml file to have a top level node of  <fx:root type="AnchorPane" ... >.

Then I changed the hello.fxml file to have a top level node of  <fx:root type="View" ... >, with corresponding changes 
to HelloPresenter.java and the FXMLLoader in the (new) file Hellofxml.java as shown here. 
This also runs, although the controls have lost size and now their content is '...'.

Changing the top level node of hello.fxml to <View ... > and the program runs but no contents of the view are present. 
(Both button & label missing.) No error message occurs. 

In comparison, changing the hello.fxml in HelloFXML with the same changes,  <View ... >, 
does not stop it running as before. 

So using a View as the top level node of an fxml file works in an Application but not in a MobileApplication.
