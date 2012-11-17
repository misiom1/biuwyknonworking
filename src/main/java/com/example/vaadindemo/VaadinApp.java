package com.example.vaadindemo;

import java.util.ArrayList;
import java.util.List;

import com.example.vaadindemo.domain.Car;
import com.vaadin.Application;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.util.BeanItem;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.ObjectProperty;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component.Event;
import com.vaadin.ui.Form;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class VaadinApp extends Application {

	private static final long serialVersionUID = 1L;
	Window mainWindow = new Window();
	final HorizontalLayout h1 = new HorizontalLayout();
	Label helloLabel;
	TextField helloText;
	Button helloButton = new Button("Add new button");
	Button newCarButton = new Button("LOL");
	
	@Override
	public void init() {
		BeanItemContainer<Car> cont = new BeanItemContainer<Car>(Car.class);
		
		final Table table = new Table("samochody", cont);
		Car c1 = new Car();
		c1.setMake("fiat");
		c1.setModel("bravo");
		Car c2 = new Car();
		c2.setMake("porsche");
		c2.setModel("panamera");
		List<Car> cars = new ArrayList<Car>();
		cars.add(c1);
		cars.add(c2);
		cont.addAll(cars);
		h1.addComponent(table);
		table.addListener(new Table.ValueChangeListener() {

			private static final long serialVersionUID = 1L;

			@Override
			public void valueChange(ValueChangeEvent event) {
				if(table.getValue() != null)
					mainWindow.showNotification("" + table.getValue());
				
			}
			
			
		});
		
		newCarButton.addListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				carFormWindow = new FormModelWindow();
				if(carFormWindow != null) {
					
					mainWindow.removeWindow(carFormWindow);
					
					
				}
				mainWindow.addWindow(carFormWindow);
			}
		});
//		table.addListener(new ItemClickListener() {
//			
//			@Override
//			public void itemClick(ItemClickEvent event) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
//		Form helloForm = new Form();
//		
//		final Car auto = new Car();
//		/*h1.addComponent(helloText);
//		h1.addComponent(helloLabel);
//		h1.addComponent(helloButton);*/
////		mainWindow.addComponent(h1);
//		setMainWindow(mainWindow);
//		final BeanItem <Car> carItem = new BeanItem<Car>(new Car());
//		helloForm.setItemDataSource(carItem);
//		h1.addComponent(helloForm);
//		h1.addComponent(helloButton);
//		ObjectProperty<String> stringProperty = new ObjectProperty<String>(" hello ");
//		//viewer
//		helloLabel.setPropertyDataSource(stringProperty);
//		helloText.setPropertyDataSource(stringProperty);
//		helloText.setImmediate(true);
//		Car zBazy = new Car();
//		zBazy.setMake("105");
//		zBazy.setModel("Syrena");
//		auto.setMake(zBazy.getMake());
//		auto.setModel(zBazy.getModel());
//		helloButton.addListener(new Button.ClickListener() {
//			private static final long serialVersionUID = 1L;
//
//			@Override
//			public void buttonClick(ClickEvent event) {
////				helloLabel.setValue(helloText.getValue());
//				//Car nowyCar = carItem.getBean();
////				mainWindow.showNotification(carItem.getBean().getMake());
//				mainWindow.showNotification("" + auto);
//			}
//		});
//		mainWindow.addComponent(h1);
//		/*Window mainWindow = new Window();
//
//		Button helloButton = new Button("Say Hello");
//		
//		HorizontalLayout h1 = new HorizontalLayout();
//		h1.addComponent(helloButton);
//		h1.addComponent(helloLabel);
//		mainWindow.addComponent(h1);
//		mainWindow.addComponent(new Label("Hello Wordl"));
//		helloButton.addListener(new Button.ClickListener() {
//			
//			@Override
//			public void buttonClick(ClickEvent event) {
//				helloLabel.setValue(" Heeeeelllo ");
//				
//			}
//		});*/
//		//helloButton.addListener(Button.ClickEvent.class, this, "buttonHandler");
//		
	}
/*	public void buttonHandler(Event event) {
		helloLabel.setValue("hello");
	}*/
}
