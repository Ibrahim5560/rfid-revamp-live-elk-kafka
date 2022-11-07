package com.isoft.rfid;

import com.isoft.rfid.RfidRevampLiveElkKafkaApp;
import com.isoft.rfid.config.AsyncSyncConfiguration;
import com.isoft.rfid.config.EmbeddedElasticsearch;
import com.isoft.rfid.config.EmbeddedKafka;
import com.isoft.rfid.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { RfidRevampLiveElkKafkaApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
