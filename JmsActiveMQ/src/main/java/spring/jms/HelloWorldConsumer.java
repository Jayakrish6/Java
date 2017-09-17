package spring.jms;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class HelloWorldConsumer {
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
			MessageConsumer consumer = session.createConsumer(destination);

			Message message = consumer.receive(1000);
			
			if (message instanceof TextMessage) {
				TextMessage textMessage = (TextMessage) message;
				String text = textMessage.getText();
				System.out.println("Receiver: " + text);
			} else {
				System.out.println("Received: " + message);
			}
			
			
			//Clean up
			consumer.close();
			session.close();
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//Do something			
		}

	}
}
