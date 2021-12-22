import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

	//Calendar calendar;
	// arrange the time however we want. can make it am/pm, 24 hour format.
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;

	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(350,200);
		this.setResizable(false);

		// hours, minutes, seconds, am/pm
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		// day name of a week
		dayFormat = new SimpleDateFormat("EEEE");
		// month, day, year
		dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");

		// Set up the clock's looks
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
		timeLabel.setForeground(new Color(0x00FF00));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);

		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));

		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));

		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		this.setVisible(true);

		setTime();
	}

	public void setTime() {
		while(true) {
			// displays time
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);

			// displays day
			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);

			// displays date
			date = dateFormat.format(Calendar.getInstance().getTime());
			dateLabel.setText(date);

			// updates every one second
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
