package school.hei.prog.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import school.hei.prog.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
