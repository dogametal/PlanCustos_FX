
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MenusDemo extends JFrame {
	private JMenu[] menu = { new JMenu("File"), new JMenu("Edit"), new JMenu("Run"), new JMenu("Source"),
			new JMenu("Refactor"), new JMenu("Navigate"), new JMenu("Search"), new JMenu("Project"),
			new JMenu("Window"), new JMenu("Help") };
	private JMenuItem[] item = { new JMenuItem("New"), new JMenuItem("Undo Typing"), new JMenuItem("Run"),
			new JMenuItem("Toggle Comment"), new JMenuItem("Android"), new JMenuItem("Go Into"),
			new JMenuItem("Search"), new JMenuItem("Open Project"), new JMenuItem("New Window"),
			new JMenuItem("Welcome"), new JMenuItem("Open File"), new JMenuItem("Redo"), new JMenuItem("Debug"),
			new JMenuItem("Add Block Comment"), new JMenuItem("Rename"), new JMenuItem("Go To"), new JMenuItem("File"),
			new JMenuItem("Close Project"), new JMenuItem("New Editor"), new JMenuItem("Help Contents"),
			new JMenuItem("Close"), new JMenuItem("Cut"), new JMenuItem("Run History"),
			new JMenuItem("Remove Block Comment"), new JMenuItem("Move"), new JMenuItem("Open Declaration"),
			new JMenuItem("Java"), new JMenuItem("Build All"), new JMenuItem("Open Perspective"),
			new JMenuItem("Search"), new JMenuItem("Close All"), new JMenuItem("Copy"), new JMenuItem("RunTest As"),
			new JMenuItem("Generate Element Comment"), new JMenuItem("Change Method Signature"),
			new JMenuItem("Open Type Hierarchy"), new JMenuItem("Text"), new JMenuItem("Build Project"),
			new JMenuItem("Show View"), new JMenuItem("Dynamic Help") };

	public MenusDemo() {
		for (int i = 0; i < item.length; i++) {
			menu[i % 10].add(item[i]);
		}
		JMenuBar menubar = new JMenuBar();
		for (JMenu menus : menu)
			menubar.add(menus);
		setJMenuBar(menubar);
		setLayout(new FlowLayout());

	}

	public static void main(String[] args) {
		setFrame(new MenusDemo(), 900, 700);
	}

	public static void setFrame(final JFrame frame, final int width, final int height) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				//ImageIcon img = new ImageIcon("C:\Backup_Douglas\Biblioteca\Icones\Icons\Apps");
				frame.setTitle(frame.getClass().getSimpleName());
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(width, height);				
				frame.setVisible(true);
			}
		});
	}
}