import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.Test;

import com.maizuo.seat.object.CinemaOffer;
import com.maizuo.seat.object.SeatOffer;
import com.maizuo.seat.service.offer.RequestObj;
import com.maizuo.seat.service.offer.impl.FirePhenixServiceImpl;
import com.maizuo.seat.service.offer.impl.SkyStarServiceImpl;

public class ServiceTest {
	//private org.apache.log4j.Logger logger = org.apache.log4j.LogManager.getLogger(getClass());

	 private Logger logger = (Logger) LogManager.getLogger(ServiceTest.class);

	// @Test
	public void test() {
		FirePhenixServiceImpl impl = new FirePhenixServiceImpl();
		List<CinemaOffer> list = impl.getCinemas();
		System.out.println(list);
	}

	@Test
	public void a() {
		long start = System.currentTimeMillis();
		int i = 0;
		while (i < 50) {
			i++;
			logger.info("asdasdadsadddddddddddddddddddddddddddddddddddddddddddddddasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddds");
			logger.info("asdasdadsadddddddddddddddddddddddddddddddddddddddddddddddasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddds");
			logger.info("asdasdadsadddddddddddddddddddddddddddddddddddddddddddddddasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddds");
			logger.info("asdasdadsadddddddddddddddddddddddddddddddddddddddddddddddasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddds");
			logger.info("asdasdadsadddddddddddddddddddddddddddddddddddddddddddddddasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddds");
			logger.info("asdasdadsadddddddddddddddddddddddddddddddddddddddddddddddasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddds");
			logger.info("asdasdadsadddddddddddddddddddddddddddddddddddddddddddddddasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddds");
			logger.info("asdasdadsadddddddddddddddddddddddddddddddddddddddddddddddasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddds");
			logger.info("asdasdadsadddddddddddddddddddddddddddddddddddddddddddddddasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddds");
			logger.info("asdasdadsadddddddddddddddddddddddddddddddddddddddddddddddasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddds");
			logger.info("asdasdadsadddddddddddddddddddddddddddddddddddddddddddddddasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddds");
			logger.info("asdasdadsadddddddddddddddddddddddddddddddddddddddddddddddasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddds");
			logger.info("asdasdadsadddddddddddddddddddddddddddddddddddddddddddddddasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddds");
			logger.info("asdasdadsadddddddddddddddddddddddddddddddddddddddddddddddasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddds");
			logger.info("asdasdadsadddddddddddddddddddddddddddddddddddddddddddddddasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddds");
			logger.info("asdasdadsadddddddddddddddddddddddddddddddddddddddddddddddasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddds");
			logger.info("asdasdadsadddddddddddddddddddddddddddddddddddddddddddddddasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddds");
		}
		long end = System.currentTimeMillis();
		System.out.print(end - start);
	}

	// @Test
	public void testSeat() {
		FirePhenixServiceImpl impl = new FirePhenixServiceImpl();
		RequestObj bo = new RequestObj();
		bo.setOfferCinemaId("31051201");
		bo.setLinkId("492");
		bo.setHallId("2");
		List<SeatOffer> list = impl.getSeats(bo);
		System.out.println(list);
	}

	// @Test
	public void testSky() {
		SkyStarServiceImpl impl = new SkyStarServiceImpl();
		impl.getToken();
		impl.getCinemas();
		RequestObj bo = new RequestObj();
		bo.setOfferCinemaId("31051201");
		bo.setLinkId("492");
		bo.setHallId("2");
		List<SeatOffer> list = impl.getSeats(bo);
		System.out.println(list);
	}
}
