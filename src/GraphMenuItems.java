import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GraphMenuItems implements MenuItemProvider {

   private ArrayList<JMenuItem> graphMenuItems;

   public GraphMenuItems() {
      graphMenuItems = new ArrayList<JMenuItem>();
      createMenuItems();
   }

   private void createMenuItems() {
      graphMenuItems.add(addHistographMenu());
      graphMenuItems.add(addPieChartMenu());
   }

   private JMenuItem addHistographMenu() {
      final JMenuItem mnuHistograph = new JMenuItem("Histograph");
      mnuHistograph.setMnemonic('H');
      mnuHistograph.setAccelerator(
            KeyStroke.getKeyStroke('H', ActionEvent.ALT_MASK));
      mnuHistograph.addActionListener(new ActionListener() {
         // Anonymous inner classes are used here for brevity, but should be
         // named classes in production code.
         public void actionPerformed(ActionEvent e) {
            //add code here to pull up accroding menu
            mnuHistograph.setEnabled(false);
         }
      });

      return mnuHistograph;
   }

   private JMenuItem addPieChartMenu() {
      final JMenuItem mnuPieChart = new JMenuItem("Pie Chart");
      mnuPieChart.setMnemonic('P');
      mnuPieChart.setAccelerator(
            KeyStroke.getKeyStroke('P', ActionEvent.ALT_MASK));
      mnuPieChart.addActionListener(new ActionListener() {
         // Anonymous inner classes are used here for brevity, but should be
         // named classes in production code.
         public void actionPerformed(ActionEvent e) {
            ///add code here to pull up accroding menu
            mnuPieChart.setEnabled(false);
         }
      });

      return mnuPieChart;
   }


   public ArrayList<JMenuItem> getMenuItems() {
      return graphMenuItems;
   }
}