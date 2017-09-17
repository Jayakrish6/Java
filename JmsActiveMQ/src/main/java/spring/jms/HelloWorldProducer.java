package spring.jms;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class HelloWorldProducer {

	public static void main (String[] args) {
		try {
			//Create a connection factory
			ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://Toshiba:61616");
			
			//Create a connection
			Connection connection = connectionFactory.createConnection();
			connection.start();
			
			//Create a session
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			
			//Create the destination (Topic or queue)
			Destination destination = session.createQueue("HelloWOrld.TESTQ");
			
			//Create a MessageProducer from the session to the Topic or Queue
			MessageProducer producer = session.createProducer(destination);
			producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
			
			//Create message
			String text = "Hello World !! From : " + Thread.currentThread().getName();
			TextMessage message = session.createTextMessage(text);
			
			//Tell the producer to send the message
			System.out.println("Sent message:" + message.hashCode() + ":" +Thread.currentThread().getName());
			producer.send(message);
			
			//Clean up
			session.close();
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//Do something			
		}

	}
}
