package Assignment;

public class Elements extends Button 
{

    public static void main(String[] args) 
    {

        // Button object
        Button btn = new Button();
        btn.click();
        btn.submit();

        // TextField object
        TextField tf = new TextField();
        tf.setText("Selenium");
        System.out.println(tf.getText());

        // CustomButton object
        CustomButton cbt = new CustomButton();
        cbt.click();
        cbt.submit();
        cbt.clickCustomButton();

        // CheckBoxButton object
        CheckBoxButton chk = new CheckBoxButton();
        chk.click();
        chk.submit();
        chk.clickCheckButton();

        // RadioButton object
        RadioButton rb = new RadioButton();
        rb.click();
        rb.submit();
        rb.selectRadioButton();
    }
}
