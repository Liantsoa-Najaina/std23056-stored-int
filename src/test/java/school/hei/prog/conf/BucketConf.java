package school.hei.prog.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import school.hei.prog.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
