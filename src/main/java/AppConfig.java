import com.conference.util.CalendarFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.conference"})
public class AppConfig {
    @Bean(name = "calendarFactory")
    public CalendarFactory calendarFactory() {
        CalendarFactory calendarFactory = new CalendarFactory();
        calendarFactory.addDays(2);
        return calendarFactory;
    }

    @Bean(name = "calendar")
    public Calendar calendar() throws Exception {
        return calendarFactory().getObject();
    }
}
