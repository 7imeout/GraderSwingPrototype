import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   

public class AddCategoryUI extends JDialog {

	public AddCategoryUI() {
        initUI();
	}

    private final void initUI() {
		JPanel panel = new JPanel();
		getContentPane().add(panel);

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(Box.createVerticalGlue());

		panel.add(Box.createRigidArea(new Dimension(0, 10)));

		JPanel catNamePanel = new JPanel();
        catNamePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        catNamePanel.setLayout(new BoxLayout(catNamePanel, BoxLayout.X_AXIS));

        catNamePanel.add(new JLabel("Category Name:"));
        catNamePanel.add(Box.createRigidArea(new Dimension(10, 0)));

        JTextField catNameField = new JTextField(15);
        catNameField.setMaximumSize(catNameField.getPreferredSize());

        catNamePanel.add(catNameField);

        panel.add(catNamePanel);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel weightPanel = new JPanel();
        weightPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        weightPanel.setLayout(new BoxLayout(weightPanel, BoxLayout.X_AXIS));

        weightPanel.add(Box.createRigidArea(new Dimension(53, 0)));
        weightPanel.add(new JLabel("Weight:"));
        weightPanel.add(Box.createRigidArea(new Dimension(10, 0)));

        JTextField weightField = new JTextField(15);
        weightField.setMaximumSize(weightField.getPreferredSize());

        weightPanel.add(weightField);

        panel.add(weightPanel);

		JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JButton addCatButton = new JButton("Add Category");
		addCatButton.setBounds(0, 0, 80, 30);
		addCatButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			   dispose();
			}
		});

		bottom.add(addCatButton);

		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(0, 0, 80, 30);
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			   dispose();
			}
		});

		panel.add(Box.createRigidArea(new Dimension(0, 15)));

		bottom.add(cancelButton);
		bottom.add(Box.createRigidArea(new Dimension(25, 0)));

		panel.add(bottom);

		setTitle("New Category");
		setModal(true);
		setResizable(false);
		setSize(380, 190);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void showAddCategoryUI() {  
        AddCategoryUI catFrame = new AddCategoryUI();
        catFrame.setVisible(true);
    }
}