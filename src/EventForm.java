import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EventForm extends JDialog {

    public EventForm(JFrame parent) {
        super(parent, "New Event", true); // Set 'modal' to true for modal dialog
        setSize(300, 200);
        setLayout(new FlowLayout());

        // Add components to the form
        JLabel year = new JLabel("Year :");
        JTextField yearField = new JTextField(2);

        JLabel month = new JLabel("Month :");
        JTextField monthField = new JTextField(2);

        JLabel startTimeH = new JLabel("Start Time Hour :");
        JTextField startTimeHField = new JTextField(2);

        JLabel startTimeM = new JLabel("Start Time Min :");
        JTextField startTimeMField = new JTextField(2);

        JLabel endTimeH = new JLabel("End Time Hour :");
        JTextField endTimeHField = new JTextField(2);

        JLabel endTimeM = new JLabel("End Time Min :");
        JTextField endTimeMField = new JTextField(2);

        JLabel text = new JLabel("Text :");
        JTextField textField = new JTextField(20);



        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle form submission here
                int year  = Integer.parseInt(yearField.getText());
                int month  = Integer.parseInt(monthField.getText());
                int startTimeH = Integer.parseInt(startTimeHField.getText());
                int startTimeM = Integer.parseInt(startTimeMField.getText());
                int endTimeH = Integer.parseInt(endTimeHField.getText());
                int endTimeM = Integer.parseInt(endTimeMField.getText());
                String text = textField.getText();

                // Process the input data as needed

                // Close the dialog
                dispose();
            }
        });

        add(year);
        add(yearField);

        add(month);
        add(monthField);

        add(startTimeH);
        add(startTimeHField);
        add(startTimeM);
        add(startTimeMField);
        add(endTimeH);
        add(endTimeHField);
        add(endTimeM);
        add(endTimeMField);

        add(text);
        add(textField);
        add(submitButton);
    }
}