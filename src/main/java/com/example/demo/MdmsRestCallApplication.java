package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//@Import({ TracerConfiguration.class })
@RestController
@SpringBootApplication
public class MdmsRestCallApplication {
	@Autowired
	RestTemplate restTemplate;
//
//	public MdmsRestCallApplication() {
//		restTemplate = new RestTemplate();
//	}
@Bean
public RestTemplate restTemplate(RestTemplateBuilder builder) {

	return builder.build();
}
	public static void main(String[] args) {
		SpringApplication.run(MdmsRestCallApplication.class, args);
	}


	@PostMapping(value = "/result")
	public Object[] showResults(@RequestBody RestData restData)
	{

		final ResponseData response = restTemplate.postForObject("http://egov-micro-dev.egovernments.org/egov-mdms-service/v1/_search",restData,ResponseData.class);
//		log.info(response.toString());
		return (response.getMdmsRes().getCommonMasters().getDepartment().toArray());
	}

}
