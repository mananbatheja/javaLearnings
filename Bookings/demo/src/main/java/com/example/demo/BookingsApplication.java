package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

@SpringBootApplication
public class BookingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingsApplication.class, args);
	}


}

@Component
class BookingCommandLineRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {

		for (Booking booking: this.bookingRepository.findAll()) {
			System.out.println(booking.toString());
		}

	}

	@Autowired
	BookingRepository bookingRepository;
}

interface BookingRepository extends JpaRepository<Booking, Long>{
	Collection<Booking> findByBookingName(String bookingName);
}

@Entity
class Booking{

	@Id @GeneratedValue
	private long id;
	private String bookingName;

	public Booking(String bookingName) {
		this.bookingName = bookingName;
	}

	public Booking() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookingName() {
		return bookingName;
	}

	public void setBookingName(String bookingName) {
		this.bookingName = bookingName;
	}

	@Override
	public String toString() {
		return "Booking{" +
				"id=" + id +
				", bookingName='" + bookingName + '\'' +
				'}';
	}
}