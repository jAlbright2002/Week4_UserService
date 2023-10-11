package ie.atu.week4_userservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="confirmation-service", url = "http://locahost:8083")
public interface RegistrationServiceClient {
    @PostMapping("/confirm")
    String someDetails(@RequestBody UserDetails userDetails);

}
