package TestCases_GUI;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Combo;

public class testCaseGUI extends Composite {
	private Text text;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public testCaseGUI(Composite parent, int style) {
		super(parent, style);
		
		text = new Text(this, SWT.BORDER);
		text.setBounds(10, 328, 880, 422);
		
		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.setBounds(770, 85, 94, 61);
		btnNewButton.setText("STOP TEST");
		
		Button btnNewButton_3 = new Button(this, SWT.NONE);
		btnNewButton_3.setBounds(770, 18, 94, 61);
		btnNewButton_3.setText("START TEST");
		
		Button button_1 = new Button(this, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_1.setText("Android SoftApp");
		button_1.setBounds(28, 172, 186, 41);
		
		Button btnAndroidAt = new Button(this, SWT.NONE);
		btnAndroidAt.setText("Android A2T - CAC");
		btnAndroidAt.setBounds(233, 172, 186, 41);
		
		Button btnAndroidPurebred = new Button(this, SWT.NONE);
		btnAndroidPurebred.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnAndroidPurebred.setText("Android PureBred");
		btnAndroidPurebred.setBounds(28, 232, 186, 41);
		
		Button btnAndroidAt_1 = new Button(this, SWT.NONE);
		btnAndroidAt_1.setText("Android A2T - PIV");
		btnAndroidAt_1.setBounds(233, 232, 186, 41);
		
		Button btnIosSoftapp = new Button(this, SWT.NONE);
		btnIosSoftapp.setText("iOS SoftApp");
		btnIosSoftapp.setBounds(492, 172, 186, 41);
		
		Button btnIosPurebred = new Button(this, SWT.NONE);
		btnIosPurebred.setText("iOS PureBred");
		btnIosPurebred.setBounds(492, 232, 186, 41);
		
		Button btnIosAt = new Button(this, SWT.NONE);
		btnIosAt.setText("iOS A2T - CAC");
		btnIosAt.setBounds(688, 172, 186, 41);
		
		Button btnIosAt_1 = new Button(this, SWT.NONE);
		btnIosAt_1.setText("iOS A2T - PIV");
		btnIosAt_1.setBounds(688, 232, 186, 41);
		
		Label lblLogging = new Label(this, SWT.NONE);
		lblLogging.setBounds(416, 310, 88, 14);
		lblLogging.setText("LOGGING");
		
		Combo combo = new Combo(this, SWT.NONE);
		combo.setItems(new String[] {"Android", "iOS"});
		combo.setBounds(10, 64, 228, 22);
		
		Combo combo_1 = new Combo(this, SWT.NONE);
		combo_1.setItems(new String[] {"SoftApp", "PureBread", "A2T - CAC", "A2T - PIV"});
		combo_1.setBounds(257, 64, 228, 22);
		
		Combo combo_2 = new Combo(this, SWT.NONE);
		combo_2.setBounds(513, 64, 228, 22);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
